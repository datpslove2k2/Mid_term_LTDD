package com.example.midterm_trantiendat_2050531200126;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginPage extends AppCompatActivity {
    private TextView backSignup;
    private Button btnlogin;
    private TextInputEditText edtEmail;
    private TextInputEditText edtPassword;
    private CheckBox cbRemember;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        AnhXa();
        sharedPreferences = getSharedPreferences("dataLogin", MODE_PRIVATE);
        edtEmail.setText(sharedPreferences.getString("taikhoan", ""));
        edtPassword.setText(sharedPreferences.getString("matkhau", ""));
        cbRemember.setChecked(sharedPreferences.getBoolean("checked", false));

        backSignup = (TextView) findViewById(R.id.return_Signup);
        backSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginPage.this, SignupPage.class);
                startActivity(intent);
            }
        });
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = edtEmail.getText().toString().trim();
                String password = edtPassword.getText().toString().trim();
                if (email.equals("tiendat@gmail.com") && password.equals("admin@1234")) {
                    Toast.makeText(LoginPage.this, "Login Success!!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginPage.this, MenuPage.class);
                    startActivity(intent);
                    if (cbRemember.isChecked()) {
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("taikhoan", email);
                        editor.putString("matkhau", password);
                        editor.putBoolean("checked", true);
                        editor.commit();
                    } else {
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.remove("taikhoan");
                        editor.remove("matkhau");
                        editor.remove("checked");
                        editor.commit();
                    }
                } else {
                    Toast.makeText(LoginPage.this, "Login Fail!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    private void AnhXa() {
        btnlogin = (Button) findViewById(R.id.btnLogin);
        edtEmail = (TextInputEditText) findViewById(R.id.inputEmail);
        edtPassword = (TextInputEditText) findViewById(R.id.inputPassword);
        cbRemember = (CheckBox) findViewById(R.id.checkBox);
    }
}
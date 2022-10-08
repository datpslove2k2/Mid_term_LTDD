package com.example.midterm_trantiendat_2050531200126;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignupPage extends AppCompatActivity {
    private Button backLogin;
    private Button btnSignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);
        TextInputLayout layoutPassword = findViewById(R.id.textInputPassword);
        TextInputEditText editTextPass = findViewById(R.id.inputPassword);
        editTextPass.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String pass = charSequence.toString();
                if (pass.length() >= 8) {
                    Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
                    Matcher matcher = pattern.matcher(pass);
                    boolean isPassCheck = matcher.find();
                    if (isPassCheck) {
                        layoutPassword.setHelperText("Strong Password");
                        layoutPassword.setError("");
                    } else {
                        layoutPassword.setHelperText("");
                        layoutPassword.setError("Weak Password. Include minium 1 special char.");
                    }

                } else {
                    layoutPassword.setHelperText("Enter Minium 8 char");
                    layoutPassword.setError("");
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        backLogin = (Button) findViewById(R.id.back_Login);
        backLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupPage.this, LoginPage.class);
                startActivity(intent);
            }
        });
        btnSignup = (Button) findViewById(R.id.btn_Signup);
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupPage.this, LoginPage.class);
                Toast.makeText(SignupPage.this, "Create Account Success!!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}
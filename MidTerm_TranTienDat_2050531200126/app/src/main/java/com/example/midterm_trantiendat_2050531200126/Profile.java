package com.example.midterm_trantiendat_2050531200126;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Profile extends AppCompatActivity {
    private ImageView btnBack;
    private Button btnBackLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        btnBackLogin = (Button) findViewById(R.id.btnBack_login);
        btnBackLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, LoginPage.class);
                startActivity(intent);
            }
        });
        btnBack = (ImageView) findViewById(R.id.img_Back_Home);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, HomePage.class);
                startActivity(intent);
            }
        });
    }
}
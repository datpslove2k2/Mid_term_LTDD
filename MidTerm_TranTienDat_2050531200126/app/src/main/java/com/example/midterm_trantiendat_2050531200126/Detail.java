package com.example.midterm_trantiendat_2050531200126;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    private TextView txtText;
    private TextView txtDir;
    private TextView txtPrice;
    private ImageView btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        btnBack = (ImageView) findViewById(R.id.img_Back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Detail.this, MenuPage.class);
                startActivity(intent);
            }
        });

        txtText = (TextView) findViewById(R.id.txtView);
        txtPrice = (TextView) findViewById(R.id.priceCart);
        txtDir = (TextView) findViewById(R.id.txtDicription);
        Intent intent = getIntent();
        String value = intent.getStringExtra("Key");
        txtText.setText(value);
        String value_price = intent.getStringExtra("price");
        txtPrice.setText(value_price);
        String value_dir = intent.getStringExtra("Dicription");
        txtDir.setText(value_dir);


    }
}
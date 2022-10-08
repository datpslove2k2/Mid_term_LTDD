package com.example.midterm_trantiendat_2050531200126;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;

public class HomePage extends AppCompatActivity {
    private ViewPager viewPaper;
    private CircleIndicator circleIndicator;
    private PhotoAdapter photoAdapter;
    private ImageView imgMenuItem;
    private ImageView imgProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        imgProfile = (ImageView) findViewById(R.id.img_Profile);
        imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, Profile.class);
                startActivity(intent);
            }
        });

        viewPaper = (ViewPager) findViewById(R.id.viewpaper);
        circleIndicator = (CircleIndicator) findViewById(R.id.circle_indicator);

        photoAdapter = new PhotoAdapter(this, getListPhoto());
        viewPaper.setAdapter(photoAdapter);

        circleIndicator.setViewPager(viewPaper);
        photoAdapter.registerDataSetObserver(circleIndicator.getDataSetObserver());

        imgMenuItem = (ImageView) findViewById(R.id.imgMenu);
        imgMenuItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, MenuPage.class);
                startActivity(intent);
            }
        });

    }
    private List<Photo> getListPhoto() {
        List<Photo> list = new ArrayList<>();
        list.add(new Photo(R.drawable.bg_burger_2));
        list.add(new Photo(R.drawable.bg_burger_3));
        list.add(new Photo(R.drawable.bg_burger_4));
        list.add(new Photo(R.drawable.bg_burger_5));
        list.add(new Photo(R.drawable.bg_burger_6));
        list.add(new Photo(R.drawable.bg_burger_7));

        return list;
    }
}
package com.example.midterm_trantiendat_2050531200126;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MenuPage extends AppCompatActivity {
    private ImageView backHome;
    private ImageView backHomeP;
    private ImageView profile;
    private ListView lvFood;
    private ArrayList <foodItem> arrayFood;
    private FoodItemAdapter adapter;
    private int position = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_page);
        AnhXa();
        profile = (ImageView) findViewById(R.id.img_Profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuPage.this, Profile.class);
                startActivity(intent);
            }
        });

        backHome = (ImageView) findViewById(R.id.imgBackHome);
        backHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuPage.this, HomePage.class);
                startActivity(intent);
            }
        });
        backHomeP = (ImageView) findViewById(R.id.imgHomeP);
        backHomeP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuPage.this, HomePage.class);
                startActivity(intent);
            }
        });
        adapter = new FoodItemAdapter(this, R.layout.food, arrayFood);
        lvFood.setAdapter(adapter);
        lvFood.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent intent = new Intent(MenuPage.this, Detail.class);
                    intent.putExtra("Key", "Burgerfi Burger");
                    intent.putExtra("Dicription", "Double Natural Angus Beef, Lettuce, Tomato, BurgerFi Sauce\n" +
                            "\n" +
                            "*Available as Single Burger");
                    intent.putExtra("price", "54");
                    startActivity(intent);
                }
                if(i==1){
                    Intent intent = new Intent(MenuPage.this, Detail.class);
                    intent.putExtra("Key", "Burgerfi Burger");
                    intent.putExtra("Dicription", "Double Natural Angus Beef, Double American Cheese, Lettuce, Tomato, BurgerFi Sauce\n" +
                            "*Available as Single Burger");
                    intent.putExtra("price", "47");
                    startActivity(intent);
                }
                if(i==2){
                    Intent intent = new Intent(MenuPage.this, Detail.class);
                    intent.putExtra("Key", "Ultimate Burger");
                    intent.putExtra("Dicription", "Double Wagyu + Brisket Blend Burger, Homemade Candied Bacon-Tomato Jam, Truffle Aioli, Aged Swiss Cheese");
                    intent.putExtra("price", "89");
                    startActivity(intent);
                }
                if(i==3){
                    Intent intent = new Intent(MenuPage.this, Detail.class);
                    intent.putExtra("Key", "Swag Burger");
                    intent.putExtra("Dicription", "Double Wagyu + Brisket Blend, Charred Jalapeños, Candied Ghost Pepper Bacon, Sweet Tomato Relish, Pepper Jack Cheese, Hot Steak Sauce");
                    intent.putExtra("price", "35");
                    startActivity(intent);
                }
                if(i==4){
                    Intent intent = new Intent(MenuPage.this, Detail.class);
                    intent.putExtra("Key", "Conflicted Burger");
                    intent.putExtra("Dicription", "Natural Angus Beef, Bacon, American Cheese, Maple Syrup, Fried Egg, Hash Brown, Grilled Onions, Ketchup");
                    intent.putExtra("price", "55");
                    startActivity(intent);
                }
                if(i==5){
                    Intent intent = new Intent(MenuPage.this, Detail.class);
                    intent.putExtra("Key", "Beyond Burger");
                    intent.putExtra("Dicription", "Natural Angus Beef, VegeFi® Burger, American Cheese, White Cheddar, Lettuce, Tomato, BurgerFi Sauce");
                    intent.putExtra("price", "65");
                    startActivity(intent);
                }
            }
        });

    }
    private void AnhXa() {
        lvFood = (ListView) findViewById(R.id.list_item_food);
        arrayFood = new ArrayList<>();
        arrayFood.add(new foodItem("Burgerfi \nBurger", 0, 54, 0, R.drawable.add, R.drawable.tru, R.drawable.burger_cut));
        arrayFood.add(new foodItem("Burgerfi \nBurger", 0, 47, 0, R.drawable.add, R.drawable.tru, R.drawable.burger_cut_2));
        arrayFood.add(new foodItem("Ultimate \nBurger", 0, 89, 0, R.drawable.add, R.drawable.tru, R.drawable.burger_cut_3));
        arrayFood.add(new foodItem("Swag \nBurger ", 0, 35, 0, R.drawable.add, R.drawable.tru, R.drawable.burger_cut_4));
        arrayFood.add(new foodItem("Conflicted \nBurger", 0, 55, 0, R.drawable.add, R.drawable.tru, R.drawable.burger_cut_5));
        arrayFood.add(new foodItem("Beyond \nBurger", 0, 65, 0, R.drawable.add, R.drawable.tru, R.drawable.burger_cut_6));
    }
}
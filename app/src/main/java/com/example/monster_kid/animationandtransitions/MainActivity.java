package com.example.monster_kid.animationandtransitions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import spencerstudios.com.bungeelib.Bungee;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void secondActivity(View view) {
        startActivity(new Intent(this, secondActivity.class));
        Bungee.swipeLeft(this);
    }

//Bungee.split(context);
//Bungee.shrink(content);
//Bungee.card(context);
//Bungee.inAndOut(context);
//Bungee.swipeLeft(context);
//Bungee.swiperRight(context);
//Bungee.slideLeft(context);
//Bungee.slideRight(context);
//Bungee.slideDown(context);
//Bungee.slideUp(context);
//Bungee.fade(context);
//Bungee.zoom(context);
//Bungee.windmill(context);
//Bungee.diagonal(context);
//Bungee.spin(context);
}

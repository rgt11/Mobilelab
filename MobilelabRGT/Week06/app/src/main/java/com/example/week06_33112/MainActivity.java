package com.example.week06_33112;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void keproperty(View view){
        Intent intentprop = new Intent(MainActivity.this, PropertyActivity.class);
        startActivity(intentprop);
    }
    public void kedraw(View view){
        Intent intentdraw = new Intent(MainActivity.this, DrawableActivity.class);
        startActivity(intentdraw);
    }
    public void kefis(View view){
        Intent intentfis = new Intent(MainActivity.this, FisikaActivity.class);
        startActivity(intentfis);
    }
}
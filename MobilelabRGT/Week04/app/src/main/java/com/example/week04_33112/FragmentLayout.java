package com.example.week04_33112;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FragmentLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_layout);
    }
    public void pindahhal(View view) {
        Intent intent = new Intent(FragmentLayout.this, SecondActivity.class);
        startActivity(intent);
    }
}
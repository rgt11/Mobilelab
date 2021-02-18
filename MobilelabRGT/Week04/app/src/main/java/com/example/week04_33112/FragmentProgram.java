package com.example.week04_33112;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FragmentProgram extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_program);
    }
    public void pindahhal_2(View view) {
        Intent intent = new Intent(FragmentProgram.this, ThirdActivity.class);
        startActivity(intent);
    }
}
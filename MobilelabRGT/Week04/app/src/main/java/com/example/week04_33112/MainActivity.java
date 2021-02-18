package com.example.week04_33112;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etIsian;
    private EditText etUrl;
    private Button btnKirim;
    private Button btnBrowse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etIsian = findViewById(R.id.isian);
        etUrl = findViewById(R.id.url);
        btnBrowse = findViewById(R.id.buttonBrowse);
        btnKirim = findViewById(R.id.buttonKirim);

        btnBrowse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urlText = etUrl.getText().toString();
                if(urlText.isEmpty()){
                    urlText = "https://www.umn.ac.id/";
                }
                Intent browseIntent = new Intent(Intent.ACTION_VIEW);
                browseIntent.setData(Uri.parse(urlText));
                if(browseIntent.resolveActivity(getPackageManager()) != null){
                    startActivity(browseIntent);
                }
            }
        });
        btnKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDua = new Intent(MainActivity.this,
                        ActivityDua.class);
                String isian = etIsian.getText().toString();
                intentDua.putExtra("PesanDariMain",isian);
                startActivityForResult(intentDua, 1);
            }
        });
    }
    public void pindahlay(View view) {
        Intent intent = new Intent(MainActivity.this, FragmentLayout.class);
        startActivity(intent);
    }

    public void pindahprog(View view) {
        Intent intent2 = new Intent(MainActivity.this, FragmentProgram.class);
        startActivity(intent2);
    }
}
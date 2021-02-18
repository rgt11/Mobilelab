package com.example.week04_33112;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityDua extends AppCompatActivity {
    private TextView tvPesanDiterima, tvJawaban;
    private EditText etJawaban;
    private Button btnBalasKirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);
        tvPesanDiterima = findViewById(R.id.pesanDiterima);
        etJawaban = findViewById(R.id.pesanBalik);
        btnBalasKirim = findViewById(R.id.kirimBalik);
        tvJawaban = findViewById(R.id.jawaban);

        Intent mainIntent = getIntent();
        String pesanDiterima =
                mainIntent.getStringExtra("PesanDariMain");
        tvPesanDiterima.setText(pesanDiterima);
    }

    public void kirimBalik(View view) {
        String jawaban = etJawaban.getText().toString();
        Intent balasIntent = new Intent();
        balasIntent.putExtra("Jawaban", jawaban);
        setResult(RESULT_OK, balasIntent);
        finish();
    }

    @Override
    public void onActivityResult(int requestCode,
                                 int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                String jawaban = data.getStringExtra("Jawaban");
                tvJawaban.setText(jawaban);
            }
        }
    }
}

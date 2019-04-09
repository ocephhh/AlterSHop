package com.example.yosepheldwin.altershop.Intent.Alterticket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;

import com.example.yosepheldwin.altershop.R;

public class TotalTiket2 extends AppCompatActivity {

    AppCompatTextView total_harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_tiket2);

        total_harga = findViewById(R.id.total_harga);

        int total = getIntent().getIntExtra("total",0);

        total_harga.setText(total+"");
    }
}

package com.example.yosepheldwin.altershop.Intent.Alterticket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.widget.Toast;

import com.example.yosepheldwin.altershop.R;

public class Totaltiket1 extends AppCompatActivity {

    AppCompatTextView ttl_harga;

    private String KEY_NAME = "Total";

//    private String total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_totaltiket1);

        ttl_harga = findViewById(R.id.ttl_harga);

        Toast.makeText(this,"totalnya "+getIntent().getIntExtra("total",0),Toast.LENGTH_LONG).show();

//        Intent intent = getIntent();
//
        int total = getIntent().getIntExtra("total",0);

        ttl_harga.setText(total+"");
    }
}

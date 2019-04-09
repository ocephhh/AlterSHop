package com.example.yosepheldwin.altershop.Intent.Alterticket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yosepheldwin.altershop.R;

public class Tiket1 extends AppCompatActivity {

    TextView quantity, harga;

    AppCompatTextView total;

    Button pesan;

    int quantiti = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiket1);

        quantity = findViewById(R.id.quantity_textview);
        harga = findViewById(R.id.harga);

        total = findViewById(R.id.total_harga);

        pesan = findViewById(R.id.btn_pesan);

        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int jumlah;
                int satuan;
                int total = quantiti * 50000;

                Intent hasil = new Intent(Tiket1.this, Totaltiket1.class );
                hasil.putExtra("total" , total);
                startActivity(hasil);
            }
        });
    }

    public void increment(View view) {
        if (quantiti==100){
            Toast.makeText(this, "Pesan tiket maksimal 100", Toast.LENGTH_LONG).show();
            return;
        }
        quantiti = quantiti + 1;
//        display(quantiti);
        quantity.setText(quantiti+"");
    }

    public void decrement(View view) {
        if (quantiti==1){
            Toast.makeText(this, "Minimal pesan 1 tiket", Toast.LENGTH_LONG).show();
            return;
        }
        quantiti = quantiti - 1;
//        display(quantiti);
        quantity.setText(quantiti+"");
    }
}

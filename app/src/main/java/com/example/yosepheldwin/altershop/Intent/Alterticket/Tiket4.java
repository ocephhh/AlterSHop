package com.example.yosepheldwin.altershop.Intent.Alterticket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yosepheldwin.altershop.R;

public class Tiket4 extends AppCompatActivity {

    TextView quantityTextView;

    Button pesan;

    int quantitas = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiket4);

        quantityTextView = findViewById(R.id.quantity_textview);

        pesan = findViewById(R.id.btn_pesan);

        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int jumlah;
                int satuan;
                int total = quantitas * 110000;

                Intent hasil = new Intent(Tiket4.this,TotalTiket2.class);
                hasil.putExtra("total",total);
                startActivity(hasil);
            }
        });
    }

    public void decrement(View view) {

        if (quantitas==1){
            Toast.makeText(this, "Minimal pesan 1 tiket", Toast.LENGTH_LONG).show();
            return;
        }
        quantitas = quantitas - 1;
//        display(quantiti);
        quantityTextView.setText(quantitas+"");
    }

    public void increment(View view) {

        if (quantitas==100){
            Toast.makeText(this, "Pesan tiket maksimal 100", Toast.LENGTH_LONG).show();
            return;
        }
        quantitas = quantitas + 1;
//        display(quantiti);
        quantityTextView.setText(quantitas+"");
    }
}

package com.example.yosepheldwin.altershop.Intent.Alterticket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.Button;

import com.example.yosepheldwin.altershop.R;

public class AlterTicket extends AppCompatActivity {

    AppCompatButton tiket_1, tiket_2, tiket_3, tiket_4, tiket_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alter_ticket);

        tiket_1 = findViewById(R.id.tiket1);
        tiket_2 = findViewById(R.id.tiket2);
        tiket_3 = findViewById(R.id.tiket3);
        tiket_4 = findViewById(R.id.tiket4);
        tiket_5 = findViewById(R.id.tiket5);


        tiket_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intTiket1 = new Intent(AlterTicket.this, Tiket1.class);
                startActivity(intTiket1);
            }
        });

        tiket_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentTiket2 = new Intent(AlterTicket.this, Tiket2.class);
                startActivity(intentTiket2);
            }
        });

        tiket_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentTiket3 = new Intent(AlterTicket.this, Tiket3.class);
                startActivity(intentTiket3);
            }
        });

        tiket_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentTiket4 = new Intent(AlterTicket.this, Tiket4.class);
                startActivity(intentTiket4);
            }
        });

        tiket_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentTiket5 = new Intent(AlterTicket.this, Tiket5.class);
                startActivity(intentTiket5);
            }
        });
    }
}

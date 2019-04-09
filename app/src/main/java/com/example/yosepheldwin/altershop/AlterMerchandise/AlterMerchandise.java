package com.example.yosepheldwin.altershop.AlterMerchandise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;

import com.example.yosepheldwin.altershop.R;

public class AlterMerchandise extends AppCompatActivity {

    AppCompatImageView baju, gelas,tupperware, merchand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alter_merchandise);

        baju = findViewById(R.id.tshirt);
        gelas = findViewById(R.id.mug);
        tupperware = findViewById(R.id.tupperware);
        merchand = findViewById(R.id.merchandise);

        baju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent baju = new Intent(AlterMerchandise.this, Tshirt.class);
                startActivity(baju);
            }
        });

        gelas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentgelas = new Intent(AlterMerchandise.this, Mug.class);
                startActivity(intentgelas);
            }
        });

        tupperware.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttupperware = new Intent(AlterMerchandise.this, Tupperware.class);
                startActivity(intenttupperware);
            }
        });

        merchand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentmerchandise = new Intent(AlterMerchandise.this, Merchand.class);
                startActivity(intentmerchandise);
            }
        });
    }
}

package com.example.yosepheldwin.altershop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.yosepheldwin.altershop.AlterCourse.AlterCourse;
import com.example.yosepheldwin.altershop.AlterFest.AlterFest;
import com.example.yosepheldwin.altershop.AlterMerchandise.AlterMerchandise;
import com.example.yosepheldwin.altershop.Intent.Alterticket.AlterTicket;

public class MainActivity extends AppCompatActivity {

    Button ticket, course, merchandise, fest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ticket = findViewById(R.id.alt_tiket);
        course = findViewById(R.id.alt_course);
        merchandise = findViewById(R.id.alt_merchandise);
        fest = findViewById(R.id.alt_fest);

        ticket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tiket = new Intent(MainActivity.this, AlterTicket.class);
                startActivity(tiket);
            }
        });

        course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent course = new Intent(MainActivity.this, AlterCourse.class);
                startActivity(course);
            }
        });

        merchandise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent merchandise = new Intent(MainActivity.this, AlterMerchandise.class);
                startActivity(merchandise);
            }
        });

        fest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fest = new Intent(MainActivity.this, AlterFest.class);
                startActivity(fest);
            }
        });
    }
}

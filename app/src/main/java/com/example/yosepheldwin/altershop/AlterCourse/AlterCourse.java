package com.example.yosepheldwin.altershop.AlterCourse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.yosepheldwin.altershop.R;

public class AlterCourse extends AppCompatActivity {

    TextView web, android, game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alter_course);

        web = findViewById(R.id.website);
        android = findViewById(R.id.android);
        game = findViewById(R.id.game);

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentWebsite = new Intent(AlterCourse.this, WebsiteCourse.class);
                startActivity(intentWebsite);
            }
        });

        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAndroid = new Intent(AlterCourse.this, WebsiteCourse.class);
                startActivity(intentAndroid);
            }
        });

        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGame = new Intent(AlterCourse.this, WebsiteCourse.class);
                startActivity(intentGame);
            }
        });
    }
}

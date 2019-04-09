package com.example.yosepheldwin.altershop;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplasshScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_splassh_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent Main =new Intent(SplasshScreen.this, Login.class);
                startActivity(Main);
                finish();
            }
        }, 3000);
    }
}

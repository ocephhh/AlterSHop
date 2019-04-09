package com.example.yosepheldwin.altershop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    AppCompatEditText username, password;

    Button btn_Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.id_username);
        password = findViewById(R.id.id_password);

        btn_Login = findViewById(R.id.btn_login);

        btn_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();

                if (user.equals("admin") && pass.equals("admin") ){

                    Intent main = new Intent(Login.this,MainActivity.class);
                    startActivity(main);
                    finish();
                }

                else if (user.matches("") && pass.matches("")){
                    Toast.makeText(getApplication(),"Username atau Password tidak boleh kosong", Toast.LENGTH_LONG).show();
                }

                else if (!user.equals("admin") && !pass.equals("admin")){
                    Toast.makeText(getApplication(), "Gagal Login, Username atau Password salah!!", Toast.LENGTH_LONG).show();
                }

                else if (!user.equals("admin")){
                    Toast.makeText(getApplication(), "Username yang anda masukan salah", Toast.LENGTH_LONG).show();
                }

                else if (!pass.equals("admin")){
                    Toast.makeText(getApplication(), "Password yang anda masukan salah", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

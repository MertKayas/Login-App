package com.example.vizeloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity
{
    Button btnsifre;
    Button btnuye;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanımlama();
        tanımlama2();

        btnuye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yeniuye=new Intent(getApplicationContext(),UyeOl.class);
                startActivity(yeniuye);
            }
        });

        btnsifre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sifreunut=new Intent(getApplicationContext(),SifreniMiUnuttun.class);
                startActivity(sifreunut);
            }
        });



        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        //admin ve admin

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    //doğru
                    Toast.makeText(MainActivity.this,"GİRİŞ BAŞARILI",Toast.LENGTH_SHORT).show();
                }else
                    //yanlış
                    Toast.makeText(MainActivity.this,"GİRİŞ BAŞARISIZ !!!",Toast.LENGTH_SHORT).show();
            }
        });


    }
        public void tanımlama()
        {
            btnsifre=findViewById(R.id.sifreunut);
        }

        public void tanımlama2()
        {
            btnuye=findViewById(R.id.yeniuye);
        }




}

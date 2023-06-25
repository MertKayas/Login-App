package com.example.vizeloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class UyeOl extends AppCompatActivity {

    Button girisbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uye_ol);

        TextView email = (TextView) findViewById(R.id.Email);
        TextView sifre = (TextView) findViewById(R.id.YeniŞifre);
        TextView sifre2 = (TextView) findViewById(R.id.YeniŞifre2);
        MaterialButton girisbtn = (MaterialButton) findViewById(R.id.girisbtn);

        girisbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // admin@gmail.com and 12345
        girisbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (sifre.getText().toString().equals(sifre2.getText().toString())
                ) {

                    Intent anasayfa = new Intent(getApplicationContext(), MainActivity.class);

                    startActivity(anasayfa);
                    Toast.makeText(UyeOl.this, "Hesap Oluşturuldu", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(UyeOl.this, "Şifreler Aynı Değil", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
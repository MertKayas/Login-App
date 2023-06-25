package com.example.vizeloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
public class SifreniMiUnuttun extends AppCompatActivity {

    Button unutbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sifreni_mi_unuttun);

        TextView email = (TextView) findViewById(R.id.Emailsifir);

        MaterialButton unutbtn = (MaterialButton) findViewById(R.id.girisbtn);

        unutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // admin@gmail.com and admin
        unutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (email.getText().toString().equals(""))


                {
                    Toast.makeText(SifreniMiUnuttun.this, "Emailinizi Giriniz", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent anasayfa = new Intent(getApplicationContext(),MainActivity.class);

                    startActivity(anasayfa);
                    Toast.makeText(SifreniMiUnuttun.this, "Emailinize Şifre Sıfırlama Linki Yollanmıştır", Toast.LENGTH_SHORT).show();
                }


            }

        });


        }
    }
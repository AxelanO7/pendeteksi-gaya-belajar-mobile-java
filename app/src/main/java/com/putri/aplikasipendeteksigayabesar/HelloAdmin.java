package com.putri.aplikasipendeteksigayabesar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HelloAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_admin);
        Button Soal = findViewById(R.id.button);
        Button Hasil = findViewById(R.id.button2);
        Button Logout = findViewById(R.id.button3);

        Soal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HelloAdmin.this, QuestionData.class);
                HelloAdmin.this.startActivity(intent);
                finish();
            }
        });

        Hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HelloAdmin.this, ResultData.class);
                HelloAdmin.this.startActivity(intent);
                finish();
            }
        });

        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HelloAdmin.this, MainActivity.class);
                HelloAdmin.this.startActivity(intent);
                finish();
            }
        });
    }
}
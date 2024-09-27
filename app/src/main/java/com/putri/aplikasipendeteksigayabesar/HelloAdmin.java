package com.putri.aplikasipendeteksigayabesar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HelloAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_admin);
        Button Soal = findViewById(R.id.button), Hasil = findViewById(R.id.button2), Logout = findViewById(R.id.button3);

        Soal.setOnClickListener(view -> {
            Intent intent = new Intent(HelloAdmin.this, QuestionData.class);
            HelloAdmin.this.startActivity(intent);
            finish();
        });

        Hasil.setOnClickListener(view -> {
            Intent intent = new Intent(HelloAdmin.this, ResultData.class);
            HelloAdmin.this.startActivity(intent);
            finish();
        });

        Logout.setOnClickListener(view -> {
            Intent intent = new Intent(HelloAdmin.this, MainActivity.class);
            HelloAdmin.this.startActivity(intent);
            finish();
        });
    }
}
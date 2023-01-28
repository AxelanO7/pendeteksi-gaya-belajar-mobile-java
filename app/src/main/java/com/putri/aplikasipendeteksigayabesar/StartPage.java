package com.putri.aplikasipendeteksigayabesar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class StartPage extends AppCompatActivity {

    Button btn1;
    static String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        userName = getIntent().getStringExtra("username");

        btn1 = findViewById(R.id.button);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartPage.this, TestIndex1.class);
                StartPage.this.startActivity(intent);
                finish();
            }
        });
    }
}
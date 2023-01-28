package com.putri.aplikasipendeteksigayabesar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button btnLogin;
    String userLogin [] = {
      "GungPutri", "MiaSwantari", "DanielSetiawan", "YulialdaMashun", "PatrisiaEtrianaBurga"
    };
    String passLogin [] = {
      "pass1", "pass2", "pass3", "pass4", "pass5"
    };
    static String namaUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.editText1);
        password = findViewById(R.id.editText2);
        btnLogin = findViewById(R.id.button);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameKey = username.getText().toString();
                String passwordKey = password.getText().toString();
                if ((usernameKey.equals(userLogin[0]) && (passwordKey.equals(passLogin[0])))){
                    succesLogin(usernameKey);
                }else if((usernameKey.equals(userLogin[1]) && (passwordKey.equals(passLogin[1])))) {
                    succesLogin(usernameKey);
                }else if((usernameKey.equals(userLogin[2]) && (passwordKey.equals(passLogin[2])))){
                    succesLogin(usernameKey);
                }else if((usernameKey.equals(userLogin[3]) && (passwordKey.equals(passLogin[3])))){
                    succesLogin(usernameKey);
                }else if((usernameKey.equals(userLogin[4]) && (passwordKey.equals(passLogin[4])))){
                    succesLogin(usernameKey);
                }else if((usernameKey.equals("bk1")) && (passwordKey.equals("bk"))){
                    Intent intent = new Intent(MainActivity.this, HelloAdmin.class);
                    MainActivity.this.startActivity(intent);
                    finish();
                }else{
                    failedLogin();
                }
            }
        });
    }

    public void succesLogin(String usernameKey){
        String nama = usernameKey;
        Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
                Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, StartPage.class);
        intent.putExtra("username", nama);
        MainActivity.this.startActivity(intent);
        finish();
    }

    private void failedLogin() {
        Intent intent = new Intent(MainActivity.this, LoginError.class);
        MainActivity.this.startActivity(intent);
        finish();
    }
}

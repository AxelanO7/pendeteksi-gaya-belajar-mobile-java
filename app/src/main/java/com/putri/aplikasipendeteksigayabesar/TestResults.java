package com.putri.aplikasipendeteksigayabesar;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


public class TestResults extends AppCompatActivity {

    TextView textAktif, textSensorik, textVisual, textSekuensial;
    DataHelper dbcenter1;
    Button backButton;
    private ListAdapterQuestion adapterInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_results);
        textAktif = findViewById(R.id.textView4);
        textSensorik = findViewById(R.id.textView5);
        textVisual = findViewById(R.id.textView6);
        textSekuensial = findViewById(R.id.textView7);
        textAktif.setText("Aktif : "+(String.format("%.1f",(ListAdapterQuestion.percent_d_aktif)))+" %");
        textSensorik.setText("Sensorik : "+(String.format("%.1f",(ListAdapterQuestion.percent_d_sensorik)))+" %");
        textVisual.setText("Visual : "+(String.format("%.1f",(ListAdapterQuestion.percent_d_visual)))+" %");
        textSekuensial.setText("Sekuensial : "+(String.format("%.1f",(ListAdapterQuestion.percent_d_sekuensial)))+" %");
        backButton = (Button) findViewById(R.id.button5);

        dbcenter1 = new DataHelper(this);
        SQLiteDatabase db = dbcenter1.getWritableDatabase();
        db.execSQL("INSERT INTO hasil (hasil_aktif, hasil_sensorik, hasil_visual, hasil_sekuensial, nama) values('" + (String.format("%.1f",(ListAdapterQuestion.percent_d_aktif))) + "', '" + (String.format("%.1f",(ListAdapterQuestion.percent_d_sensorik))) + "', '" + (String.format("%.1f",(ListAdapterQuestion.percent_d_visual))) + "', '" + (String.format("%.1f",(ListAdapterQuestion.percent_d_sekuensial))) + "', '" + StartPage.userName + "')");

        backButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ListAdapterQuestion.d_aktif_total = 0;
                ListAdapterQuestion.d_sensorik_total = 0;
                ListAdapterQuestion.d_visual_total = 0;
                ListAdapterQuestion.d_sekuensial_total = 0;
                Intent intent = new Intent(TestResults.this, MainActivity.class);
                TestResults.this.startActivity(intent);
                finish();
            }
        });
    }
}
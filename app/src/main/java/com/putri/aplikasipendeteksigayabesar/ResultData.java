package com.putri.aplikasipendeteksigayabesar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ResultData extends AppCompatActivity {

    String [] daftar;
    protected Cursor cursor;
    ListView lv1;
    protected Cursor cursor0;
    DataHelper dbcenter1;
    String [] no;
    String [] d_aktif;
    String [] d_sensorik;
    String [] d_visual;
    String [] d_sekuensial;
    String [] nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_data);
        dbcenter1 = new DataHelper(this);
        RefreshList();
    }
    public void RefreshList() {
        SQLiteDatabase db = dbcenter1.getReadableDatabase();

        cursor0 = db.rawQuery("SELECT * FROM hasil", null);

        daftar = new String[cursor0.getCount()];

        no = new String[cursor0.getCount()];
        d_aktif = new String[cursor0.getCount()];
        d_sensorik = new String[cursor0.getCount()];
        d_visual = new String[cursor0.getCount()];
        d_sekuensial = new String[cursor0.getCount()];
        nama = new String[cursor0.getCount()];
        cursor0.moveToFirst();
        for (int cc=0; cc < cursor0.getCount(); cc++){
            cursor0.moveToPosition(cc);
            daftar[cc] = cursor0.getString(1).toString();
            no[cc] = cursor0.getString(0).toString();
            d_aktif[cc] = cursor0.getString(1).toString();
            d_sensorik[cc] = cursor0.getString(2).toString();
            d_visual[cc] = cursor0.getString(3).toString();
            d_sekuensial[cc] = cursor0.getString(4).toString();
            nama[cc] = cursor0.getString(5).toString();
        }

        lv1 = findViewById(R.id.list_view);

        ListAdapterResult adapter = new ListAdapterResult(this, this.no, this.d_aktif, this.d_sensorik, this.d_visual, this.d_sekuensial, this.nama);
        lv1.setBackgroundColor(Color.argb(255, 92, 84, 112));
        lv1.setAdapter(adapter);
        lv1.setSelected(true);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

        public void onItemClick(AdapterView arg0, View arg1, int arg2, long arg3) {
            String selection = daftar[arg2]; //.getItemAtPosition(arg2).toString();
            final CharSequence[] dialogitem = {"Delete Data"};
            AlertDialog.Builder builder = new AlertDialog.Builder(ResultData.this);
            builder.setTitle("Option");
            builder.setItems(dialogitem, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int item) {
                    switch(item){
                        case 0 :
                            SQLiteDatabase db = dbcenter1.getWritableDatabase();
                            db.execSQL("DELETE FROM hasil WHERE hasil_aktif = '"+selection+"'");
                            Toast.makeText(getApplicationContext(), "successfully deleted", Toast.LENGTH_LONG).show();
                            RefreshList();
                            break;
                    }
                }
            });
            builder.create().show();
        }});
    }
    public void logout(View view){
        Intent intent = new Intent(ResultData.this, MainActivity.class);
        ResultData.this.startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(ResultData.this, HelloAdmin.class);
        ResultData.this.startActivity(intent);
        finish();
    }
}
package com.putri.aplikasipendeteksigayabesar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class QuestionData extends AppCompatActivity {

    String [] daftar;
    ListView lv1;
    protected Cursor cursor;
    DataHelper dbcenter;
    FloatingActionButton fab;
    AlertDialog.Builder dialog, dialog2, dialog3;
    LayoutInflater inflater, inflater2, inflater3;
    View dialogView, dialogView2, dialogView3;
    EditText txt_no_urut_add, txt_pertanyaan_add, txt_opt1_add, txt_opt2_add, txt_no_urut_update, txt_pertanyaan_update, txt_opt1_update, txt_opt2_update;
    TextView txt_pertanyaan_view, txt_no_urut_view, txt_opt1_view, txt_opt2_view, txt_dimen_view;
    public static QuestionData ma;
    String dimension;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_data);

        fab = findViewById(R.id.floatingActionButton1);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddQuestionData();
            }
        });

        ma = this;
        dbcenter = new DataHelper(this);
        RefreshList();
    }

    private void kosong(){
        txt_no_urut_add.setText(null);
        txt_pertanyaan_add.setText(null);
        txt_opt1_add.setText(null);
        txt_opt2_add.setText(null);
    }

    private void AddQuestionData(){
        dialog = new AlertDialog.Builder(QuestionData.this);
        inflater = getLayoutInflater();
        dialogView = inflater.inflate(R.layout.add_da,null);
        dialog.setView(dialogView);
        dialog.setCancelable(true);
        dialog.setTitle("Add Question Data");

        txt_no_urut_add = dialogView.findViewById(R.id.et1);
        txt_pertanyaan_add = dialogView.findViewById(R.id.et2);
        txt_opt1_add = dialogView.findViewById(R.id.et3);
        txt_opt2_add = dialogView.findViewById(R.id.et4);

        kosong();

        dialog.setPositiveButton("SUBMIT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (txt_no_urut_add == null || txt_pertanyaan_add == null || txt_opt1_add == null || txt_opt2_add == null || dimension == null){
                    Toast.makeText(getApplicationContext(), "add failed, fill all column", Toast.LENGTH_LONG).show();
                }
                else {
                    SQLiteDatabase db = dbcenter.getWritableDatabase();
                    db.execSQL("INSERT INTO soal(no_urut, pertanyaan, opt1, opt2, dimen) values('" + txt_no_urut_add.getText().toString() + "', '" + txt_pertanyaan_add.getText().toString() + "', '" + txt_opt1_add.getText().toString() + "', '" + txt_opt2_add.getText().toString() + "', '" + dimension + "')");
                    Toast.makeText(getApplicationContext(), "successfully added", Toast.LENGTH_LONG).show();
                    dialog.dismiss();
                    RefreshList();
                }
            }
        });

        dialog.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    public void onRadioButtonClickedAddQuestion(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.rb1:
                if (checked)
                    dimension = "Aktif";
                    break;
            case R.id.rb2:
                if (checked)
                    dimension = "Sensorik";
                    break;
            case R.id.rb3:
                if (checked)
                    dimension = "Visual";
                    break;
            case R.id.rb4:
                if (checked)
                    dimension = "Sekuensial";
                    break;
        }
    }

    private void ViewQuestionData(String[] daftar, int arg2) {
        dialog2 = new AlertDialog.Builder(QuestionData.this);
        inflater2 = getLayoutInflater();
        dialogView2 = inflater2.inflate(R.layout.view_da,null);
        dialog2.setView(dialogView2);
        dialog2.setCancelable(true);
        dialog2.setTitle("View Question Data");

        txt_no_urut_view = dialogView2.findViewById(R.id.tv1);
        txt_pertanyaan_view = dialogView2.findViewById(R.id.tv2);
        txt_opt1_view = dialogView2.findViewById(R.id.tv3);
        txt_opt2_view = dialogView2.findViewById(R.id.tv4);
        txt_dimen_view = dialogView2.findViewById(R.id.tv5);

        String selection = daftar[arg2];

        SQLiteDatabase db = dbcenter.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM soal WHERE pertanyaan = '" +
                selection + "'",null);
        cursor.moveToFirst();
        if (cursor.getCount()>0)
        {
            cursor.moveToPosition(0);
            txt_no_urut_view.setText(cursor.getString(1).toString());
            txt_pertanyaan_view.setText(cursor.getString(2).toString());
            txt_opt1_view.setText(cursor.getString(3).toString());
            txt_opt2_view.setText(cursor.getString(4).toString());
            txt_dimen_view.setText(cursor.getString(5).toString());
        }
            dialog2.setNegativeButton("CLOSE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        dialog2.show();
    }

    private void UpdateQuestionData(String[] daftar, int arg2) {
        dialog3 = new AlertDialog.Builder(QuestionData.this);
        inflater3 = getLayoutInflater();
        dialogView3 = inflater3.inflate(R.layout.edit_da,null);
        dialog3.setView(dialogView3);
        dialog3.setCancelable(true);
        dialog3.setTitle("Update Question Data");

        txt_no_urut_update = dialogView3.findViewById(R.id.et1);
        txt_pertanyaan_update = dialogView3.findViewById(R.id.et2);
        txt_opt1_update = dialogView3.findViewById(R.id.et3);
        txt_opt2_update = dialogView3.findViewById(R.id.et4);

        String selection = daftar[arg2];

        SQLiteDatabase db = dbcenter.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM soal WHERE pertanyaan = '" +
                selection + "'",null);
        cursor.moveToFirst();
        if (cursor.getCount()>0)
        {
            cursor.moveToPosition(0);
            txt_no_urut_update.setText(cursor.getString(1).toString());
            txt_pertanyaan_update.setText(cursor.getString(2).toString());
            txt_opt1_update.setText(cursor.getString(3).toString());
            txt_opt2_update.setText(cursor.getString(4).toString());
        }

        dialog3.setPositiveButton("UPDATE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                SQLiteDatabase db = dbcenter.getWritableDatabase();
                if (txt_no_urut_update == null || txt_pertanyaan_update == null || txt_opt1_update == null || txt_opt2_update == null || dimension == null){
                    Toast.makeText(getApplicationContext(), "update failed, fill all column", Toast.LENGTH_LONG).show();
                }
                else{
                    db.execSQL("UPDATE soal SET no_urut='" + txt_no_urut_update.getText().toString() + "', pertanyaan='" + txt_pertanyaan_update.getText().toString() + "', opt1='" + txt_opt1_update.getText().toString() + "', opt2='" + txt_opt2_update.getText().toString() + "', dimen='" + dimension +"' WHERE pertanyaan = '"+ selection +"'");
                    Toast.makeText(getApplicationContext(), "successfully updated", Toast.LENGTH_LONG).show();
                    dialog.dismiss();
                    RefreshList();
                }
            }
        });

        dialog3.setNegativeButton("CLOSE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        dialog3.show();
    }

    public void RefreshList(){
        SQLiteDatabase db = dbcenter.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM soal",null);
        daftar = new String[cursor.getCount()];
        cursor.moveToFirst();
        for (int cc=0; cc < cursor.getCount(); cc++){
            cursor.moveToPosition(cc);
            daftar[cc] = cursor.getString(2).toString();
        }
        lv1 = findViewById(R.id.list_view);
        lv1.setAdapter(new ArrayAdapter(this, R.layout.style_lv, daftar));
        lv1.setBackgroundColor(Color.argb(255,92,84,112));
        lv1.setSelected(true);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

        public void onItemClick(AdapterView arg0, View arg1, int arg2, long arg3) {
            String selection = daftar[arg2]; //.getItemAtPosition(arg2).toString();
            final CharSequence[] dialogitem = {"View Data", "Update Data", "Delete Data"};
            AlertDialog.Builder builder = new AlertDialog.Builder(QuestionData.this);
            builder.setTitle("Option");
            builder.setItems(dialogitem, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int item) {
                    switch(item){
                        case 0 :
                            ViewQuestionData(daftar, arg2);
                            break;
                        case 1 :
                            UpdateQuestionData(daftar, arg2);
                            break;
                        case 2 :
                            SQLiteDatabase db = dbcenter.getWritableDatabase();
                            db.execSQL("DELETE FROM soal WHERE pertanyaan = '"+selection+"'");
                            Toast.makeText(getApplicationContext(), "successfully deleted", Toast.LENGTH_LONG).show();
                            RefreshList();
                            break;
                    }
                }
            });
            builder.create().show();
        }});
    ((ArrayAdapter)lv1.getAdapter()).notifyDataSetInvalidated();}

    public void logout(View view) {
        Intent intent = new Intent(QuestionData.this, MainActivity.class);
        QuestionData.this.startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(QuestionData.this, HelloAdmin.class);
        QuestionData.this.startActivity(intent);
        finish();
    }

//    clearDatabase("soal");

//    public void clearDatabase(String soal) {
//        String clearDBQuery = "DELETE FROM "+soal;
//        SQLiteDatabase db = dbcenter.getWritableDatabase();
//        db.execSQL(clearDBQuery);
//        RefreshList();
//    }
}
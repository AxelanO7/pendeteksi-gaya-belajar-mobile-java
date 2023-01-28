package com.putri.aplikasipendeteksigayabesar;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class TestIndex1 extends AppCompatActivity {

    ListView lv1;
    protected Cursor cursor0;
    DataHelper dbcenter1;
    String [] d_no;
    String [] d_no_urut;
    String [] d_question;
    String [] d_opt1;
    String [] d_opt2;
    String [] d_dimen;
    ListAdapterQuestion d_aktif_total;
    ListAdapterQuestion d_sensorik_total;
    ListAdapterQuestion d_visual_total;
    ListAdapterQuestion d_sekuensial_total;
    private ListAdapterQuestion adapterInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_index1);
        dbcenter1 = new DataHelper(this);
        RefreshList();
    }

    public void RefreshList() {
        SQLiteDatabase db = dbcenter1.getReadableDatabase();

        cursor0 = db.rawQuery("SELECT * FROM soal", null);

        d_no = new String[cursor0.getCount()];
        d_no_urut = new String[cursor0.getCount()];
        d_question = new String[cursor0.getCount()];
        d_opt1 = new String[cursor0.getCount()];
        d_opt2 = new String[cursor0.getCount()];
        d_dimen = new String[cursor0.getCount()];
        cursor0.moveToFirst();
        for (int cc=0; cc < cursor0.getCount(); cc++){
            cursor0.moveToPosition(cc);
            d_no[cc] = cursor0.getString(0).toString();
            d_no_urut[cc] = cursor0.getString(1).toString();
            d_question[cc] = cursor0.getString(2).toString();
            d_opt1[cc] = cursor0.getString(3).toString();
            d_opt2[cc] = cursor0.getString(4).toString();
            d_dimen[cc] = cursor0.getString(5).toString();
        }

        lv1 = findViewById(R.id.list_view);

        ListAdapterQuestion adapter = new ListAdapterQuestion(this, this.d_no, this.d_no_urut, this.d_question, this.d_opt1, this.d_opt2, this.d_dimen);
        lv1.setBackgroundColor(Color.argb(255, 92, 84, 112));
        lv1.setAdapter(adapter);
    }

    public void sumDimension(View view)
    {
        ListAdapterQuestion.totalDimen();
        Intent intent = new Intent(TestIndex1.this, TestResults.class);
        TestIndex1.this.startActivity(intent);
        finish();
    }
}

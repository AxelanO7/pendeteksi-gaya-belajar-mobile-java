package com.putri.aplikasipendeteksigayabesar;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class ListAdapterResult extends ArrayAdapter {

    private final Activity context;
    private final String[] no;
    private final String[] hasil_aktif;
    private final String[] hasil_sensorik;
    private final String[] hasil_visual;
    private final String[] hasil_sekuensial;
    private final String[] nama;

    public ListAdapterResult(Activity context, String[] no, String[] hasil_aktif, String[] hasil_sensorik, String[] hasil_visual, String[] hasil_sekuensial, String[] nama) {
        super(context, R.layout.style_sq, no);
        // TODO Auto-generated constructor stub

        this.context = context;
        this.no = no;
        this.hasil_aktif = hasil_aktif;
        this.hasil_sensorik = hasil_sensorik;
        this.hasil_visual = hasil_visual;
        this.hasil_sekuensial = hasil_sekuensial;
        this.nama = nama;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View testSingleView = inflater.inflate(R.layout.style_sr, null, true);

        TextView namaText = testSingleView.findViewById(R.id.nama);
        TextView aktifText = testSingleView.findViewById(R.id.aktif);
        TextView sensorikText = testSingleView.findViewById(R.id.sensorik);
        TextView visualText = testSingleView.findViewById(R.id.visual);
        TextView sekuensialText = testSingleView.findViewById(R.id.sekuensial);

        namaText.setText("Name : "+nama[position]);
        aktifText.setText("Aktif : "+hasil_aktif[position]);
        sensorikText.setText("Sensorik : "+hasil_sensorik[position]);
        visualText.setText("Visual : "+hasil_visual[position]);
        sekuensialText.setText("Sekuensial : "+hasil_sekuensial[position]);



        return testSingleView;
    }
}

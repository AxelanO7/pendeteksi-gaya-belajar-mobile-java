package com.putri.aplikasipendeteksigayabesar;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Arrays;

public class ListAdapterQuestion extends ArrayAdapter {

    private final Activity context;
    private final String[] d_no, d_no_urut, d_question, d_opt1, d_opt2, d_dimen;

    static int[] d_aktif, d_sensorik, d_visual, d_sekuensial;

    public static int d_aktif_total;
    public static double percent_d_aktif;
    public static int d_sensorik_total;
    public static double percent_d_sensorik;
    public static int d_visual_total;
    public static double percent_d_visual;
    public static int d_sekuensial_total;
    public static double percent_d_sekuensial;

    private static double percentLeft;
    private static double plusPercent;

    int[] checked1;
    int[] checked2;
    int d_no_position;

    public ListAdapterQuestion(Activity context, String[] d_no, String[] d_no_urut, String[] d_question, String[] d_opt1, String[] d_opt2, String[] d_dimen) {
        super(context, R.layout.style_sq, d_no_urut);
        // TODO Auto-generated constructor stub

        this.context = context;
        this.d_no = d_no;
        this.d_no_urut = d_no_urut;
        this.d_question = d_question;
        this.d_opt1 = d_opt1;
        this.d_opt2 = d_opt2;
        this.d_dimen = d_dimen;
        int[] d_noInt = Arrays.stream(d_no_urut).mapToInt(Integer::parseInt).toArray();
        Arrays.fill(d_noInt, 0);
        d_aktif = d_noInt;
        d_sensorik = d_noInt;
        d_visual = d_noInt;
        d_sekuensial = d_noInt;
        checked1 = d_noInt;
        checked2 = d_noInt;
    }

    @Override
//    public String getItem(int id) {
//        return null;
//    }
//
//    @Override
//    public long getItemId(int id) {
//        return 0;
//    }

//    logic radio button dan view
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View testSingleView = inflater.inflate(R.layout.style_sq, null, true);

        TextView questionText = testSingleView.findViewById(R.id.question);
        RadioButton opt1Text = testSingleView.findViewById(R.id.rb1);
        RadioButton opt2Text = testSingleView.findViewById(R.id.rb2);
        TextView dimenText = testSingleView.findViewById(R.id.tv1);
        TextView timerText = testSingleView.findViewById(R.id.timer);

        d_no_position = Integer.parseInt(d_no_urut[position]);

        questionText.setText(d_question[position]);
        opt1Text.setText(d_opt1[position]);
        opt2Text.setText(d_opt2[position]);
        dimenText.setText(d_dimen[position]);
        timerText.setText("29.37");

        opt1Text.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if ((d_dimen[position].equals("Aktif")) && checked1[position] == 0) {
                    d_aktif_total += 1;
                    d_aktif[position] = 1;
                    checked1[position] = 1;
                } else if ((d_dimen[position].equals("Aktif")) && checked1[position] == 1) {
                    d_aktif[position] = 1;
                } else if ((d_dimen[position].equals("Sensorik")) && (checked1[position] == 0)) {
                    d_sensorik[position] = 1;
                    d_sensorik_total += 1;
                    checked1[position] = 1;
                } else if ((d_dimen[position].equals("Sensorik")) && (checked1[position] == 1)) {
                    d_sensorik[position] = 1;
                    checked1[position] = 1;
                } else if ((d_dimen[position].equals("Visual")) && (checked1[position] == 0)) {
                    d_visual[position] = 1;
                    d_visual_total += 1;
                    checked1[position] = 1;
                } else if ((d_dimen[position].equals("Visual")) && (checked1[position] == 1)) {
                    d_visual[position] = 1;
                    checked1[position] = 1;
                } else if ((d_dimen[position].equals("Sekuensial")) && (checked1[position] == 0)) {
                    d_sekuensial[position] = 1;
                    d_sekuensial_total += 1;
                    checked1[position] = 1;
                } else if ((d_dimen[position].equals("Sekuensial")) && (checked1[position] == 1)) {
                    d_sekuensial[position] = 1;
                    checked1[position] = 1;
                }
//                if (d_dimen[position].equals("Aktif")){
//                    d_aktif_total += 1;
//                }
//                if (checked1[position] == 0){
//                    d_aktif_total += 1;
//                }
            }
        });
        opt2Text.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if ((d_dimen[position].equals("Aktif")) && checked1[position] == 1) {
                    d_aktif_total -= 1;
                    d_aktif[position] = 0;
                    checked1[position] = 0;
                    checked2[position] = 1;
                } else if ((d_dimen[position].equals("Aktif")) && checked2[position] == 1) {
                    d_aktif[position] = 0;
                } else if ((d_dimen[position].equals("Sensorik")) && (checked1[position] == 1)) {
                    d_sensorik[position] = 0;
                    d_sensorik_total -= 1;
                    checked1[position] = 1;
                    checked2[position] = 1;
                } else if ((d_dimen[position].equals("Sensorik")) && (checked2[position] == 1)) {
                    d_sensorik[position] = 0;
                    checked1[position] = 1;
                } else if ((d_dimen[position].equals("Visual")) && (checked1[position] == 1)) {
                    d_visual[position] = 0;
                    d_visual_total -= 1;
                    checked1[position] = 1;
                    checked2[position] = 1;
                } else if ((d_dimen[position].equals("Visual")) && (checked2[position] == 1)) {
                    d_visual[position] = 0;
                    checked1[position] = 1;
                } else if ((d_dimen[position].equals("Sekuensial")) && (checked1[position] == 1)) {
                    d_sekuensial[position] = 1;
                    d_sekuensial_total -= 1;
                    checked1[position] = 1;
                    checked2[position] = 1;
                } else if ((d_dimen[position].equals("Sekuensial")) && (checked2[position] == 1)) {
                    d_sekuensial[position] = 1;
                    checked1[position] = 1;
                }
            }
        });
//        up1(position);
        return testSingleView;
    }

    //    logic total 4 dimen
    public static void totalDimen() {
        percentTotalDimen(d_aktif_total, d_sensorik_total, d_visual_total, d_sekuensial_total);
    }

    //    logic merubah nilai menjadi persen
    public static void percentTotalDimen(int d_aktif_total, int d_sensorik_total, int d_visual_total, int d_sekuensial_total) {
        switch (d_aktif_total) {
            case 11:
                percent_d_aktif = 25;
                break;
            case 10:
                percent_d_aktif = 22.7;
                break;
            case 9:
                percent_d_aktif = 20.4;
                break;
            case 8:
                percent_d_aktif = 18.1;
                break;
            case 7:
                percent_d_aktif = 15.9;
                break;
            case 6:
                percent_d_aktif = 13.6;
                break;
            case 5:
                percent_d_aktif = 11.3;
                break;
            case 4:
                percent_d_aktif = 9.0;
                break;
            case 3:
                percent_d_aktif = 6.8;
                break;
            case 2:
                percent_d_aktif = 4.5;
                break;
            case 1:
                percent_d_aktif = 2.2;
                break;
            case 0:
                percent_d_aktif = 0;
                break;
            default:
                percent_d_aktif = 0;
        }

        switch (d_sensorik_total) {
            case 11:
                percent_d_sensorik = 25;
                break;
            case 10:
                percent_d_sensorik = 22.7;
                break;
            case 9:
                percent_d_sensorik = 20.4;
                break;
            case 8:
                percent_d_sensorik = 18.1;
                break;
            case 7:
                percent_d_sensorik = 15.9;
                break;
            case 6:
                percent_d_sensorik = 13.6;
                break;
            case 5:
                percent_d_sensorik = 11.3;
                break;
            case 4:
                percent_d_sensorik = 9.0;
                break;
            case 3:
                percent_d_sensorik = 6.8;
                break;
            case 2:
                percent_d_sensorik = 4.5;
                break;
            case 1:
                percent_d_sensorik = 2.2;
                break;
            case 0:
                percent_d_sensorik = 0;
                break;
            default:
                percent_d_sensorik = 0;
        }

        switch (d_visual_total) {
            case 11:
                percent_d_visual = 25;
                break;
            case 10:
                percent_d_visual = 22.7;
                break;
            case 9:
                percent_d_visual = 20.4;
                break;
            case 8:
                percent_d_visual = 18.1;
                break;
            case 7:
                percent_d_visual = 15.9;
                break;
            case 6:
                percent_d_visual = 13.6;
                break;
            case 5:
                percent_d_visual = 11.3;
                break;
            case 4:
                percent_d_visual = 9.0;
                break;
            case 3:
                percent_d_visual = 6.8;
                break;
            case 2:
                percent_d_visual = 4.5;
                break;
            case 1:
                percent_d_visual = 2.2;
                break;
            case 0:
                percent_d_visual = 0;
                break;
            default:
                percent_d_visual = 0;
        }

        switch (d_sekuensial_total) {
            case 11:
                percent_d_sekuensial = 25;
                break;
            case 10:
                percent_d_sekuensial = 22.7;
                break;
            case 9:
                percent_d_sekuensial = 20.4;
                break;
            case 8:
                percent_d_sekuensial = 18.1;
                break;
            case 7:
                percent_d_sekuensial = 15.9;
                break;
            case 6:
                percent_d_sekuensial = 13.6;
                break;
            case 5:
                percent_d_sekuensial = 11.3;
                break;
            case 4:
                percent_d_sekuensial = 9.0;
                break;
            case 3:
                percent_d_sekuensial = 6.8;
                break;
            case 2:
                percent_d_sekuensial = 4.5;
                break;
            case 1:
                percent_d_sekuensial = 2.2;
                break;
            case 0:
                percent_d_sekuensial = 0;
                break;
            default:
                percent_d_sekuensial = 0;
        }

//            logic 25%
        percentLeft = 100 - percent_d_aktif - percent_d_sensorik - percent_d_visual - percent_d_sekuensial;
        plusPercent = percentLeft /= 4;
        percent_d_aktif += plusPercent;
        percent_d_sensorik += plusPercent;
        percent_d_visual += plusPercent;
        percent_d_sekuensial += plusPercent;
    }
}
//package com.putri.aplikasipendeteksigayabesar;
//
//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
//import android.os.CountDownTimer;
//import android.view.View;
//import android.widget.RadioButton;
//import android.widget.RadioGroup;
//import android.widget.TextView;
//import android.widget.Toast;
//
//public class TestIndex extends AppCompatActivity {
//    public int counter = 5;
//    public int counter2 = 5;
//    public int counter3 = 5;
//    public int counter4 = 5;
//    public int counter5 = 5;
//    public int counter6 = 5;
//    public int counter7 = 5;
//    public int counter8 = 5;
//    public int counter9 = 5;
//    public int counter10 = 5;
//    public int counter11 = 5;
//    public int counter12 = 5;
//    public int counter13 = 5;
//    public int counter14 = 5;
//    public int counter15 = 5;
//    public int counter16 = 5;
//    public int counter17 = 5;
//    public int counter18 = 5;
//    public int counter19 = 5;
//    public int counter20 = 5;
//    public int counter21 = 5;
//    public int counter22 = 5;
//    public int counter23 = 5;
//    public int counter24 = 5;
//    public int counter25 = 5;
//    public int counter26 = 5;
//    public int counter27 = 5;
//    public int counter28 = 5;
//    public int counter29 = 5;
//    public int counter30 = 5;
//    public int counter31 = 5;
//    public int counter32 = 5;
//    public int counter33 = 5;
//    public int counter34 = 5;
//    public int counter35 = 5;
//    public int counter36 = 5;
//    public int counter37 = 5;
//    public int counter38 = 5;
//    public int counter39 = 5;
//    public int counter40 = 5;
//    public int counter41 = 5;
//    public int counter42 = 5;
//    public int counter43 = 5;
//    public int counter44 = 5;
//    public String sec = " Sec";
//    public boolean alreadycheck;
//
//    //start timer soal 1
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_test_index);
//        final TextView countTime=findViewById(R.id.timer1);
//        new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime.setText(String.valueOf(counter+sec));
//                    counter--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime.setText("Time up");
//                    counter=0;
//                    timerStart2();
//                }
//            }.start();
//    }
//
//    //on clik soal 1
//    public void onRadioButtonClicked1(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton1_1:
//            case R.id.radioButton1_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart2();
//                break;
//        }
//    }
//
//    // start timer soal 2
//    public void timerStart2(){
//        if (counter2 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime2=findViewById(R.id.timer2);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime2.setText(String.valueOf(counter2+sec));
//                    counter2--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime2.setText("Time up");
//                    counter2=0;
//                    timerStart3();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 2
//    public void onRadioButtonClicked2(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton2_1:
//            case R.id.radioButton2_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart3();
//                break;
//        }
//    }
//
//    // start timer soal 3
//    public void timerStart3(){
//        if (counter3 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime3=findViewById(R.id.timer3);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime3.setText(String.valueOf(counter3+sec));
//                    counter3--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime3.setText("Time up");
//                    counter3=0;
//                    timerStart4();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 3
//    public void onRadioButtonClicked3(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton3_1:
//            case R.id.radioButton3_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart4();
//                break;
//        }
//    }
//
//    // start timer soal 4
//    public void timerStart4(){
//        if (counter4 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime4=findViewById(R.id.timer4);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime4.setText(String.valueOf(counter4+sec));
//                    counter4--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime4.setText("Time up");
//                    counter4=0;
//                    timerStart5();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 4
//    public void onRadioButtonClicked4(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton4_1:
//            case R.id.radioButton4_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart5();
//                break;
//        }
//    }
//
//    // start timer soal 5
//    public void timerStart5(){
//        if (counter5 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime5=findViewById(R.id.timer5);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime5.setText(String.valueOf(counter5+sec));
//                    counter5--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime5.setText("Time up");
//                    counter5=0;
//                    timerStart6();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 5
//    public void onRadioButtonClicked5(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton5_1:
//            case R.id.radioButton5_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart6();
//                break;
//        }
//    }
//
//    // start timer soal 6
//    public void timerStart6(){
//        if (counter6 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime6=findViewById(R.id.timer6);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime6.setText(String.valueOf(counter6+sec));
//                    counter6--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime6.setText("Time up");
//                    counter6=0;
//                    timerStart7();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 6
//    public void onRadioButtonClicked6(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton6_1:
//            case R.id.radioButton6_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart7();
//                break;
//        }
//    }
//
//    // start timer soal 7
//    public void timerStart7(){
//        if (counter7 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime7=findViewById(R.id.timer7);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime7.setText(String.valueOf(counter7+sec));
//                    counter7--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime7.setText("Time up");
//                    counter7=0;
//                    timerStart8();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 7
//    public void onRadioButtonClicked7(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton7_1:
//            case R.id.radioButton7_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart8();
//                break;
//        }
//    }
//
//    // start timer soal 8
//    public void timerStart8(){
//        if (counter8 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime8=findViewById(R.id.timer8);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime8.setText(String.valueOf(counter8+sec));
//                    counter8--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime8.setText("Time up");
//                    counter8=0;
//                    timerStart9();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 8
//    public void onRadioButtonClicked8(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton8_1:
//            case R.id.radioButton8_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart9();
//                break;
//        }
//    }
//
//    // start timer soal 9
//    public void timerStart9(){
//        if (counter9 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime9=findViewById(R.id.timer9);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime9.setText(String.valueOf(counter9+sec));
//                    counter9--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime9.setText("Time up");
//                    counter9=0;
//                    timerStart10();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 9
//    public void onRadioButtonClicked9(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton9_1:
//            case R.id.radioButton9_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart10();
//                break;
//        }
//    }
//
//    // start timer soal 10
//    public void timerStart10(){
//        if (counter10 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime10=findViewById(R.id.timer10);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime10.setText(String.valueOf(counter10+sec));
//                    counter10--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime10.setText("Time up");
//                    counter10=0;
//                    timerStart11();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 10
//    public void onRadioButtonClicked10(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton10_1:
//            case R.id.radioButton10_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart11();
//                break;
//        }
//    }
//
//    // start timer soal 11
//    public void timerStart11(){
//        if (counter11 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime11=findViewById(R.id.timer11);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime11.setText(String.valueOf(counter11+sec));
//                    counter11--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime11.setText("Time up");
//                    counter11=0;
//                    timerStart12();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 11
//    public void onRadioButtonClicked11(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton11_1:
//            case R.id.radioButton11_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart12();
//                break;
//        }
//    }
//
//    // start timer soal 12
//    public void timerStart12(){
//        if (counter12 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime12=findViewById(R.id.timer12);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime12.setText(String.valueOf(counter12+sec));
//                    counter12--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime12.setText("Time up");
//                    counter12=0;
//                    timerStart13();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 12
//    public void onRadioButtonClicked12(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton12_1:
//            case R.id.radioButton12_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart13();
//                break;
//        }
//    }
//
//    // start timer soal 13
//    public void timerStart13(){
//        if (counter13 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime13=findViewById(R.id.timer13);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime13.setText(String.valueOf(counter13+sec));
//                    counter13--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime13.setText("Time up");
//                    counter13=0;
//                    timerStart14();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 13
//    public void onRadioButtonClicked13(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton13_1:
//            case R.id.radioButton13_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart14();
//                break;
//        }
//    }
//
//    // start timer soal 14
//    public void timerStart14(){
//        if (counter14 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime14=findViewById(R.id.timer14);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime14.setText(String.valueOf(counter14+sec));
//                    counter14--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime14.setText("Time up");
//                    counter14=0;
//                    timerStart15();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 14
//    public void onRadioButtonClicked14(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton14_1:
//            case R.id.radioButton14_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart15();
//                break;
//        }
//    }
//
//    // start timer soal 15
//    public void timerStart15(){
//        if (counter15 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime15=findViewById(R.id.timer15);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime15.setText(String.valueOf(counter15+sec));
//                    counter15--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime15.setText("Time up");
//                    counter15=0;
//                    timerStart16();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 15
//    public void onRadioButtonClicked15(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton15_1:
//            case R.id.radioButton15_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart16();
//                break;
//        }
//    }
//
//    // start timer soal 16
//    public void timerStart16(){
//        if (counter16 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime16=findViewById(R.id.timer16);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime16.setText(String.valueOf(counter16+sec));
//                    counter16--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime16.setText("Time up");
//                    counter16=0;
//                    timerStart17();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 16
//    public void onRadioButtonClicked16(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton16_1:
//            case R.id.radioButton16_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart17();
//                break;
//        }
//    }
//
//    // start timer soal 17
//    public void timerStart17(){
//        if (counter17 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime17=findViewById(R.id.timer17);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime17.setText(String.valueOf(counter17+sec));
//                    counter17--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime17.setText("Time up");
//                    counter17=0;
//                    timerStart18();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 17
//    public void onRadioButtonClicked17(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton17_1:
//            case R.id.radioButton17_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart18();
//                break;
//        }
//    }
//
//    // start timer soal 18
//    public void timerStart18(){
//        if (counter18 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime18=findViewById(R.id.timer18);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime18.setText(String.valueOf(counter18+sec));
//                    counter18--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime18.setText("Time up");
//                    counter18=0;
//                    timerStart19();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 18
//    public void onRadioButtonClicked18(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton18_1:
//            case R.id.radioButton18_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart19();
//                break;
//        }
//    }
//
//    // start timer soal 19
//    public void timerStart19(){
//        if (counter19 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime19=findViewById(R.id.timer19);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime19.setText(String.valueOf(counter19+sec));
//                    counter19--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime19.setText("Time up");
//                    counter19=0;
//                    timerStart20();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 19
//    public void onRadioButtonClicked19(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton19_1:
//            case R.id.radioButton19_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart20();
//                break;
//        }
//    }
//
//    // start timer soal 20
//    public void timerStart20(){
//        if (counter20 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime20=findViewById(R.id.timer20);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime20.setText(String.valueOf(counter20+sec));
//                    counter20--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime20.setText("Time up");
//                    counter20=0;
//                    timerStart21();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 20
//    public void onRadioButtonClicked20(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton20_1:
//            case R.id.radioButton20_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart21();
//                break;
//        }
//    }
//
//    // start timer soal 21
//    public void timerStart21(){
//        if (counter21 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime21=findViewById(R.id.timer21);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime21.setText(String.valueOf(counter21+sec));
//                    counter21--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime21.setText("Time up");
//                    counter21=0;
//                    timerStart22();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 21
//    public void onRadioButtonClicked21(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton21_1:
//            case R.id.radioButton21_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart22();
//                break;
//        }
//    }
//
//    // start timer soal 22
//    public void timerStart22(){
//        if (counter22 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime22=findViewById(R.id.timer22);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime22.setText(String.valueOf(counter22+sec));
//                    counter22--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime22.setText("Time up");
//                    counter22=0;
//                    timerStart23();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 22
//    public void onRadioButtonClicked22(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton22_1:
//            case R.id.radioButton22_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart23();
//                break;
//        }
//    }
//
//    // start timer soal 23
//    public void timerStart23(){
//        if (counter23 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime23=findViewById(R.id.timer23);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime23.setText(String.valueOf(counter23+sec));
//                    counter23--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime23.setText("Time up");
//                    counter23=0;
//                    timerStart24();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 23
//    public void onRadioButtonClicked23(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton23_1:
//            case R.id.radioButton23_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart24();
//                break;
//        }
//    }
//
//    // start timer soal 24
//    public void timerStart24(){
//        if (counter24 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime24=findViewById(R.id.timer24);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime24.setText(String.valueOf(counter24+sec));
//                    counter24--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime24.setText("Time up");
//                    counter24=0;
//                    timerStart25();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 24
//    public void onRadioButtonClicked24(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton24_1:
//            case R.id.radioButton24_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart25();
//                break;
//        }
//    }
//
//    // start timer soal 25
//    public void timerStart25(){
//        if (counter25 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime25=findViewById(R.id.timer25);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime25.setText(String.valueOf(counter25+sec));
//                    counter25--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime25.setText("Time up");
//                    counter25=0;
//                    timerStart26();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 25
//    public void onRadioButtonClicked25(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton25_1:
//            case R.id.radioButton25_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart26();
//                break;
//        }
//    }
//
//    // start timer soal 26
//    public void timerStart26(){
//        if (counter26 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime26=findViewById(R.id.timer26);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime26.setText(String.valueOf(counter26+sec));
//                    counter26--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime26.setText("Time up");
//                    counter26=0;
//                    timerStart27();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 26
//    public void onRadioButtonClicked26(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton26_1:
//            case R.id.radioButton26_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart27();
//                break;
//        }
//    }
//
//    // start timer soal 27
//    public void timerStart27(){
//        if (counter27 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime27=findViewById(R.id.timer27);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime27.setText(String.valueOf(counter27+sec));
//                    counter27--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime27.setText("Time up");
//                    counter27=0;
//                    timerStart28();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 27
//    public void onRadioButtonClicked27(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton27_1:
//            case R.id.radioButton27_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart28();
//                break;
//        }
//    }
//
//    // start timer soal 28
//    public void timerStart28(){
//        if (counter28 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime28=findViewById(R.id.timer28);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime28.setText(String.valueOf(counter28+sec));
//                    counter28--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime28.setText("Time up");
//                    counter28=0;
//                    timerStart29();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 28
//    public void onRadioButtonClicked28(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton28_1:
//            case R.id.radioButton28_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart29();
//                break;
//        }
//    }
//
//    // start timer soal 29
//    public void timerStart29(){
//        if (counter29 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime29=findViewById(R.id.timer29);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime29.setText(String.valueOf(counter29+sec));
//                    counter29--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime29.setText("Time up");
//                    counter29=0;
//                    timerStart30();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 29
//    public void onRadioButtonClicked29(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton29_1:
//            case R.id.radioButton29_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart30();
//                break;
//        }
//    }
//
//    // start timer soal 30
//    public void timerStart30(){
//        if (counter30 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime30=findViewById(R.id.timer30);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime30.setText(String.valueOf(counter30+sec));
//                    counter30--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime30.setText("Time up");
//                    counter30=0;
//                    timerStart31();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 30
//    public void onRadioButtonClicked30(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton30_1:
//            case R.id.radioButton30_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart31();
//                break;
//        }
//    }
//
//    // start timer soal 31
//    public void timerStart31(){
//        if (counter31 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime31=findViewById(R.id.timer31);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime31.setText(String.valueOf(counter31+sec));
//                    counter31--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime31.setText("Time up");
//                    counter31=0;
//                    timerStart32();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 31
//    public void onRadioButtonClicked31(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton31_1:
//            case R.id.radioButton31_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart32();
//                break;
//        }
//    }
//
//    // start timer soal 32
//    public void timerStart32(){
//        if (counter32 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime32=findViewById(R.id.timer32);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime32.setText(String.valueOf(counter32+sec));
//                    counter32--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime32.setText("Time up");
//                    counter32=0;
//                    timerStart33();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 32
//    public void onRadioButtonClicked32(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton32_1:
//            case R.id.radioButton32_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart33();
//                break;
//        }
//    }
//
//    // start timer soal 33
//    public void timerStart33(){
//        if (counter33 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime33=findViewById(R.id.timer33);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime33.setText(String.valueOf(counter33+sec));
//                    counter33--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime33.setText("Time up");
//                    counter33=0;
//                    timerStart34();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 33
//    public void onRadioButtonClicked33(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton33_1:
//            case R.id.radioButton33_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart34();
//                break;
//        }
//    }
//
//    // start timer soal 34
//    public void timerStart34(){
//        if (counter34 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime34=findViewById(R.id.timer34);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime34.setText(String.valueOf(counter34+sec));
//                    counter34--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime34.setText("Time up");
//                    counter34=0;
//                    timerStart35();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 34
//    public void onRadioButtonClicked34(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton34_1:
//            case R.id.radioButton34_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart35();
//                break;
//        }
//    }
//
//    // start timer soal 35
//    public void timerStart35(){
//        if (counter35 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime35=findViewById(R.id.timer35);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime35.setText(String.valueOf(counter35+sec));
//                    counter35--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime35.setText("Time up");
//                    counter35=0;
//                    timerStart36();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 35
//    public void onRadioButtonClicked35(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton35_1:
//            case R.id.radioButton35_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart36();
//                break;
//        }
//    }
//
//    // start timer soal 36
//    public void timerStart36(){
//        if (counter36 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime36=findViewById(R.id.timer36);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime36.setText(String.valueOf(counter36+sec));
//                    counter36--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime36.setText("Time up");
//                    counter36=0;
//                    timerStart37();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 36
//    public void onRadioButtonClicked36(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton36_1:
//            case R.id.radioButton36_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart37();
//                break;
//        }
//    }
//
//    // start timer soal 37
//    public void timerStart37(){
//        if (counter37 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime37=findViewById(R.id.timer37);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime37.setText(String.valueOf(counter37+sec));
//                    counter37--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime37.setText("Time up");
//                    counter37=0;
//                    timerStart38();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 37
//    public void onRadioButtonClicked37(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton37_1:
//            case R.id.radioButton37_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart38();
//                break;
//        }
//    }
//
//    // start timer soal 38
//    public void timerStart38(){
//        if (counter38 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime38=findViewById(R.id.timer38);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime38.setText(String.valueOf(counter38+sec));
//                    counter38--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime38.setText("Time up");
//                    counter38=0;
//                    timerStart39();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 38
//    public void onRadioButtonClicked38(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton38_1:
//            case R.id.radioButton38_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart39();
//                break;
//        }
//    }
//
//    // start timer soal 39
//    public void timerStart39(){
//        if (counter39 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime39=findViewById(R.id.timer39);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime39.setText(String.valueOf(counter39+sec));
//                    counter39--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime39.setText("Time up");
//                    counter39=0;
//                    timerStart40();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 39
//    public void onRadioButtonClicked39(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton39_1:
//            case R.id.radioButton39_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart40();
//                break;
//        }
//    }
//
//    // start timer soal 40
//    public void timerStart40(){
//        if (counter40 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime40=findViewById(R.id.timer40);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime40.setText(String.valueOf(counter40+sec));
//                    counter40--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime40.setText("Time up");
//                    counter40=0;
//                    timerStart41();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 40
//    public void onRadioButtonClicked40(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton40_1:
//            case R.id.radioButton40_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart41();
//                break;
//        }
//    }
//
//    // start timer soal 41
//    public void timerStart41(){
//        if (counter41 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime41=findViewById(R.id.timer41);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime41.setText(String.valueOf(counter41+sec));
//                    counter41--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime41.setText("Time up");
//                    counter41=0;
//                    timerStart42();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 41
//    public void onRadioButtonClicked41(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton41_1:
//            case R.id.radioButton41_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart42();
//                break;
//        }
//    }
//
//    // start timer soal 42
//    public void timerStart42(){
//        if (counter42 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime42=findViewById(R.id.timer42);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime42.setText(String.valueOf(counter42+sec));
//                    counter42--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime42.setText("Time up");
//                    counter42=0;
//                    timerStart43();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 42
//    public void onRadioButtonClicked42(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton42_1:
//            case R.id.radioButton42_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart43();
//                break;
//        }
//    }
//
//    // start timer soal 43
//    public void timerStart43(){
//        if (counter43 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime43=findViewById(R.id.timer43);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime43.setText(String.valueOf(counter43+sec));
//                    counter43--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime43.setText("Time up");
//                    counter43=0;
//                    timerStart44();
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 43
//    public void onRadioButtonClicked43(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton43_1:
//            case R.id.radioButton43_2:
//                if (checked)
//                    alreadycheck = true;
//                timerStart44();
//                break;
//        }
//    }
//
//    // start timer soal 44
//    public void timerStart44(){
//        if (counter44 < 5){
//        }else{
//            alreadycheck = false;
//            final TextView countTime44=findViewById(R.id.timer44);
//            new CountDownTimer(5000,1000) {
//                @Override
//                public void onTick(long millisUntilFinished) {
//                    countTime44.setText(String.valueOf(counter44+sec));
//                    counter44--;
//                }
//                @Override
//                public void onFinish() {
//                    countTime44.setText("Time up");
//                    counter44=0;
//                }
//            }.start();
//        }
//    }
//
//    //on clik soal 44
//    public void onRadioButtonClicked44(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        switch(view.getId()) {
//            case R.id.radioButton44_1:
//            case R.id.radioButton44_2:
//                if (checked)
//                    alreadycheck = true;
//                break;
//        }
//    }
//}
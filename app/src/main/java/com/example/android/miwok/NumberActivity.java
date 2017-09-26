package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        String arry[]=new String[10];
        arry[0]="one";
        arry[1]="two";
        arry[2]="three";
        arry[3]="four";
        arry[4]="five";
        arry[5]="sixe";
        arry[6]="seven";
        arry[7]="eight";
        arry[8]="nine";
        arry[9]="ten";
        Log.d("numberActivity","word at index 0" + arry[0]);
        Toast.makeText(this , "numberActivity ord at index 0" + arry[0],Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("numberActivity","word at index 0");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

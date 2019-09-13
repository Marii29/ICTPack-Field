package com.example.marii.signup;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import java.lang.String;
import java.util.Arrays;

import android.view.inputmethod.InputConnection;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;


public class Top_up_account extends AppCompatActivity {
    private ImageView airtel, tigo, ttcl, vodacom, halotel, visa, mastercard, zantel;
    private Context mContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_up_account);

        airtel = (ImageView)findViewById(R.id.airtel);
        tigo = (ImageView)findViewById(R.id.tigo);
        ttcl = (ImageView)findViewById(R.id.ttcl);
        vodacom = (ImageView)findViewById(R.id.vodacom);
        halotel = (ImageView)findViewById(R.id.halotel);
        visa = (ImageView)findViewById(R.id.visa);
        mastercard = (ImageView)findViewById(R.id.mastercard);
        zantel = (ImageView)findViewById(R.id.zantel);

    }


    public void onClickAirtel(View view){
        openDialer1();
    }
    public void openDialer1(){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + "*150*60#"));
        startActivity(intent);
    }


    public void onClickHalotel(View view){
        openDialer2();
    }
    public void openDialer2(){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + "*148*60#"));
        startActivity(intent);
    }

    public void onClickVodacom(View view){
        openDialer3();
    }
    public void openDialer3(){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + "*150*00#"));
        startActivity(intent);
    }

    public void onClickTigo(View view){
        openDialer4();
    }
    public void openDialer4(){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + "*149*00#"));
        startActivity(intent);
    }

    public void onClickTtcl(View view){
        openDialer5();
    }
    public void openDialer5(){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + "*150*30#"));
        startActivity(intent);
    }

    public void onClickZantel(View view){
        openDialer6();
    }
    public void openDialer6(){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + "*160*60#"));
        startActivity(intent);
    }
}

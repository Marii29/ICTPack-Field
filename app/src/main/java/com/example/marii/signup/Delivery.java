package com.example.marii.signup;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Delivery extends AppCompatActivity {
    Button proceed;
    ImageView map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_delivery);

        //proceed=(Button)findViewById(R.id.proceed);
        //map=(ImageView) findViewById(R.id.map);

        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Delivery.this,LogInFragment.class).putExtra("from","delivery");
                startActivity(intent);
            }


        });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent=new Intent(Delivery.this,Map.class);
                //startActivity(intent);
            }
        });


    }
}
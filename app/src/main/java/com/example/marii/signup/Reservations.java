package com.example.marii.signup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class Reservations extends AppCompatActivity {
    CardView table1,table2,table3,table4,table5,table6,table7,table8,table9,table10,table11,table12,table13,table14,table15,table16,table17,table18,table19,table20,table21;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservations);

        table1=(CardView)findViewById(R.id.table1);
        table2=(CardView)findViewById(R.id.table2);
        table3=(CardView)findViewById(R.id.table3);
        table4=(CardView)findViewById(R.id.table4);
        table5=(CardView)findViewById(R.id.table5);
        table6=(CardView)findViewById(R.id.table6);
        table7=(CardView)findViewById(R.id.table7);
        table8=(CardView)findViewById(R.id.table8);
        table9=(CardView)findViewById(R.id.table9);
        table10=(CardView)findViewById(R.id.table10);
        table11=(CardView)findViewById(R.id.table11);
        table12=(CardView)findViewById(R.id.table12);
        table13=(CardView)findViewById(R.id.table13);
        table14=(CardView)findViewById(R.id.table14);
        table15=(CardView)findViewById(R.id.table15);
        table16=(CardView)findViewById(R.id.table16);
        table17=(CardView)findViewById(R.id.table17);
        table18=(CardView)findViewById(R.id.table18);
        table19=(CardView)findViewById(R.id.table19);
        table20=(CardView)findViewById(R.id.table20);
        table21=(CardView)findViewById(R.id.table21);

        table1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Reservations.this,LogInFragment.class).putExtra("from","tables");
                Toast.makeText(getApplicationContext(), "Thank you!! you have already reserved table number 1 at the restaurant, Welcome.", Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });

        table2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Reservations.this,LogInFragment.class).putExtra("from","tables");
                Toast.makeText(getApplicationContext(), "Thank you!! you have already reserved table number 2 at the restaurant, Welcome.", Toast.LENGTH_LONG).show();

                startActivity(intent);
            }
        });

        table3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Reservations.this,LogInFragment.class).putExtra("from","tables");
                Toast.makeText(getApplicationContext(), "Thank you!! you have already reserved table number 3 at the restaurant, Welcome.", Toast.LENGTH_LONG).show();

                startActivity(intent);
            }
        });

        table4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Reservations.this,LogInFragment.class).putExtra("from","tables");
                Toast.makeText(getApplicationContext(), "Thank you!! you have already reserved table number 4 at the restaurant, Welcome.", Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });

        table5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Reservations.this,LogInFragment.class).putExtra("from","tables");
                Toast.makeText(getApplicationContext(), "Thank you!! you have already reserved table number 5 at the restaurant, Welcome.", Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });

        table6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Reservations.this,LogInFragment.class).putExtra("from","tables");
                Toast.makeText(getApplicationContext(), "Thank you!! you have already reserved table number 6 at the restaurant, Welcome.", Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });

        table7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Reservations.this,LogInFragment.class).putExtra("from","tables");
                Toast.makeText(getApplicationContext(), "Thank you!! you have already reserved table number 7 at the restaurant, Welcome.", Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });

        table8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Reservations.this,LogInFragment.class).putExtra("from","tables");
                Toast.makeText(getApplicationContext(), "Thank you!! you have already reserved table number 8 at the restaurant, Welcome.", Toast.LENGTH_LONG).show();

                startActivity(intent);
            }
        });

        table9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Reservations.this,LogInFragment.class).putExtra("from","tables");
                Toast.makeText(getApplicationContext(), "Thank you!! you have already reserved table number 9 at the restaurant, Welcome.", Toast.LENGTH_LONG).show();

                startActivity(intent);
            }
        });

        table10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Reservations.this,LogInFragment.class).putExtra("from","tables");
                Toast.makeText(getApplicationContext(), "Thank you!! you have already reserved table number 10 at the restaurant, Welcome.", Toast.LENGTH_LONG).show();

                startActivity(intent);
            }
        });

        table11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Reservations.this,LogInFragment.class).putExtra("from","tables");
                Toast.makeText(getApplicationContext(), "Thank you!! you have already reserved table number 11 at the restaurant, Welcome.", Toast.LENGTH_LONG).show();

                startActivity(intent);
            }
        });

        table12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Reservations.this,LogInFragment.class).putExtra("from","tables");
                Toast.makeText(getApplicationContext(), "Thank you!! you have already reserved table number 12 at the restaurant, Welcome.", Toast.LENGTH_LONG).show();

                startActivity(intent);
            }
        });

        table13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Reservations.this,LogInFragment.class).putExtra("from","tables");
                Toast.makeText(getApplicationContext(), "Thank you!! you have already reserved table number 13 at the restaurant, Welcome.", Toast.LENGTH_LONG).show();

                startActivity(intent);
            }
        });

        table14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Reservations.this,LogInFragment.class).putExtra("from","tables");
                Toast.makeText(getApplicationContext(), "Thank you!! you have already reserved table number 14 at the restaurant, Welcome.", Toast.LENGTH_LONG).show();

                startActivity(intent);
            }
        });

        table15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Reservations.this,LogInFragment.class).putExtra("from","tables");
                Toast.makeText(getApplicationContext(), "Thank you!! you have already reserved table number 15 at the restaurant, Welcome.", Toast.LENGTH_LONG).show();

                startActivity(intent);
            }
        });

        table16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Reservations.this,LogInFragment.class).putExtra("from","tables");
                Toast.makeText(getApplicationContext(), "Thank you!! you have already reserved table number 16 at the restaurant, Welcome.", Toast.LENGTH_LONG).show();

                startActivity(intent);
            }
        });

        table17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Reservations.this,LogInFragment.class).putExtra("from","tables");
                Toast.makeText(getApplicationContext(), "Thank you!! you have already reserved table number 17 at the restaurant, Welcome.", Toast.LENGTH_LONG).show();

                startActivity(intent);
            }
        });

        table18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Reservations.this,LogInFragment.class).putExtra("from","tables");
                Toast.makeText(getApplicationContext(), "Thank you!! you have already reserved table number 18 at the restaurant, Welcome.", Toast.LENGTH_LONG).show();

                startActivity(intent);
            }
        });

        table19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Reservations.this,LogInFragment.class).putExtra("from","tables");
                Toast.makeText(getApplicationContext(), "Thank you!! you have already reserved table number 19 at the restaurant, Welcome.", Toast.LENGTH_LONG).show();

                startActivity(intent);
            }
        });

        table20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Reservations.this,LogInFragment.class).putExtra("from","tables");
                Toast.makeText(getApplicationContext(), "Thank you!! you have already reserved table number 20 at the restaurant, Welcome.", Toast.LENGTH_LONG).show();

                startActivity(intent);
            }
        });

        table21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Reservations.this,LogInFragment.class).putExtra("from","tables");
                Toast.makeText(getApplicationContext(), "Thank you!! you have already reserved table number 21 at the restaurant, Welcome.", Toast.LENGTH_LONG).show();

                startActivity(intent);
            }
        });

    }
}


package com.example.marii.signup;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class Send_friend_money extends AppCompatActivity {
    //Toolbar toolbar;
    //private DrawerLayout drawerLayout;
    //private ActionBarDrawerToggle toggle;

    private EditText amount;
    private Button number1;
    private Button number2;
    private Button number3;
    private Button number4;
    private Button number5;
    private Button number6;
    private Button number7;
    private Button number8;
    private Button number9;
    private Button number0;
    private Button delete;
    private Button enter;
    private Spinner contacts;

    String[] contactNames = {"John Dino", "AbouJnr", "Dyjah19","Choose a number from your contacts"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_friend_money);

        /*NavigationView mNavigationView = (NavigationView) findViewById(R.id.design_navigation_view);
        if(mNavigationView != null){
            mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    int id = menuItem.getItemId();
                    if(id == R.id.nav1){
                        Intent intent= new Intent(Send_friend_money.this,Send_friend_money.class);
                        startActivity(intent);
                        //Toast.makeText(getApplicationContext(),"hi", Toast.LENGTH_SHORT).show();
                    }
                    if(id == R.id.nav2){
                        Intent intent2= new Intent(Send_friend_money.this,Top_up_account.class);
                        startActivity(intent2);
                    }
                    if(id == R.id.nav3){
                        Intent intent3= new Intent(Send_friend_money.this,Invite_Friends.class);
                        startActivity(intent3);
                    }
                    if(id == R.id.nav4){
                        Toast.makeText(getApplicationContext(), "Hi there..", Toast.LENGTH_SHORT).show();
                    }
                    if(id == R.id.nav5){
                        Toast.makeText(getApplicationContext(), "Hi there..", Toast.LENGTH_SHORT).show();
                    }
                    if(id == R.id.nav6){
                        Toast.makeText(getApplicationContext(), "Hi there..", Toast.LENGTH_SHORT).show();
                    }
                    return false;
                }
            });
        }

        toolbar = (android.support.v7.widget.Toolbar)findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(Gravity.START);
            }
        });

        drawerLayout=(DrawerLayout)findViewById(R.id.drawerLayout);
        drawerLayout.addDrawerListener(toggle);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/

        number1=(Button) findViewById(R.id.n1);
        number2=(Button) findViewById(R.id.n2);
        number3=(Button) findViewById(R.id.n3);
        number4=(Button) findViewById(R.id.n4);
        number5=(Button) findViewById(R.id.n5);
        number6=(Button) findViewById(R.id.n6);
        number7=(Button) findViewById(R.id.n7);
        number8=(Button) findViewById(R.id.n8);
        number9=(Button) findViewById(R.id.n9);
        delete=(Button) findViewById(R.id.delete);
        number0=(Button) findViewById(R.id.n0);
        enter=(Button) findViewById(R.id.enter);
        amount=(EditText) findViewById(R.id.amount);
        contacts = (Spinner)findViewById(R.id.contact);

        number1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount.setText(amount.getText().insert(amount.getText().length(), "1"));
            }
        });

        number2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount.setText(amount.getText().insert(amount.getText().length(), "2"));
            }
        });

        number3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount.setText(amount.getText().insert(amount.getText().length(), "3"));
            }
        });

        number4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount.setText(amount.getText().insert(amount.getText().length(), "4"));
            }
        });

        number5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount.setText(amount.getText().insert(amount.getText().length(), "5"));
            }
        });

        number6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount.setText(amount.getText().insert(amount.getText().length(), "6"));
            }
        });

        number7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount.setText(amount.getText().insert(amount.getText().length(), "7"));
            }
        });
        number8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount.setText(amount.getText().insert(amount.getText().length(), "8"));
            }
        });

        number9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount.setText(amount.getText().insert(amount.getText().length(), "9"));
            }
        });

        number0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount.setText(amount.getText().insert(amount.getText().length(), "0"));
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amount.setText(amount.getText().delete(amount.getText().length()-1, amount.getText().length()));
            }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Congratulations the money has been sent!", Toast.LENGTH_SHORT).show();
            }
        });

        contacts.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, contactNames);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        contacts.setAdapter(arrayAdapter);


    }
}
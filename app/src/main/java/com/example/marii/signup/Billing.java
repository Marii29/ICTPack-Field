package com.example.marii.signup;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import static com.example.marii.signup.R.color.grey;

public class Billing extends AppCompatActivity {
    private Spinner payMethod;
    public Button logIn;
    private Button delivery;
    private Button reservation;
    String[] methods = {"Pay with Visa", "Pay with Mastercard", "Pay with Airtel Money", "Pay with M-Pesa", "Pay with Tigo Pesa", "Pay with T-Pesa", "Pay with Ezy-pesa", "Pay from digital wallet", "Other"};

    public static PreConfig preConfig;
    public static ApiInterface apiInterface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billing);


        preConfig = new PreConfig(this);
        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);

        /*if (findViewById(R.id.login_layout) != null){
            if (savedInstanceState != null){
            return ;
            }
            if (preConfig.readLogInStatus()){
                logIn.setEnabled(false);
            }
            else{
                delivery.setEnabled(false);
                reservation.setEnabled(false);
            }
        }*/

        String message = MainActivity.preConfig.readName();

        reservation = (Button)findViewById(R.id.reservation);

        if (message.equals("User")){
            logIn.setBackgroundColor(getResources().getColor(R.color.grey));
            logIn.setEnabled(false);
        }
        reservation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentres = new Intent(Billing.this, Reservations.class);
                startActivity(intentres);
            }
        });

        delivery = (Button)findViewById(R.id.delivery);
        if (message.equals("User")){
            logIn.setBackgroundColor(getResources().getColor(R.color.grey));
            logIn.setEnabled(false);
        }

        delivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentdel = new Intent(Billing.this, Delivery.class);
                startActivity(intentdel);
            }
        });

        logIn = (Button)findViewById(R.id.log_in);

        if (!message.equals("User")){
            logIn.setBackgroundColor(getResources().getColor(R.color.grey));
            logIn.setEnabled(false);
        }

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        payMethod = (Spinner)findViewById(R.id.payment_method);

        payMethod.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, methods);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        payMethod.setAdapter(arrayAdapter);

    }
}

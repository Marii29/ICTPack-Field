package com.example.marii.signup;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity  implements LogInFragment.OnLoginFormActivityListener, LogOutFragment.OnLogOutListener, NavigationView.OnNavigationItemSelectedListener{

    android.support.v7.widget.Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;

    //database
    public static PreConfig preConfig;
    public static ApiInterface apiInterface;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //database

        preConfig = new PreConfig(this);
        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);

        if (findViewById(R.id.fragment_container) != null){

            if (savedInstanceState != null){
                return;
            }
            if (preConfig.readLogInStatus()){
                getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, new FragmentFood()).commit();
            }
            else {
                getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, new LogInFragment()).commit();
            }
        }


        //navigation drawer things

        NavigationView mNavigationView = (NavigationView) findViewById(R.id.design_navigation_view);
        if(mNavigationView != null) {
            mNavigationView.setNavigationItemSelectedListener(this);
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

        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);




        //bottom navigation fragments

        BottomNavigationView bottomNavigation = findViewById(R.id.bottom_navigation);
        bottomNavigation.setOnNavigationItemSelectedListener(navigationItemSelectedListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new FragmentFood()).commit();

    }


    //navigation drawer listeners

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();
        String message = MainActivity.preConfig.readName();
        if (message.equals("User")){
            AlertDialog.Builder builder  = new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("You are not logged in... Please Log in!");
            builder.setTitle("Information");
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }
        else {

            if (id == R.id.nav1) {
                Intent intent = new Intent(MainActivity.this, Send_friend_money.class);
                startActivity(intent);
                //Toast.makeText(getApplicationContext(),"hi", Toast.LENGTH_SHORT).show();
            }
            if (id == R.id.nav2) {
                Intent intent2 = new Intent(MainActivity.this, Top_up_account.class);
                startActivity(intent2);
            }
            if (id == R.id.nav3) {
                Intent intent3 = new Intent(MainActivity.this, Invite_Friends.class);
                startActivity(intent3);
            }
            if (id == R.id.nav4) {
                Intent intent4 = new Intent(MainActivity.this, UserProfile.class);
                startActivity(intent4);
            }
            if (id == R.id.nav5) {
                Intent intent5 = new Intent(MainActivity.this, Settings.class);
                startActivity(intent5);
            }
        }
        return false;
    }


    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragment = null;

                    switch (menuItem.getItemId()){

                        case R.id.nav_food:
                            selectedFragment = new FragmentFood();
                            break;

                        case R.id.nav_cart:
                            selectedFragment = new FragmentYourCart();
                            break;

                        case R.id.nav_login:
                            selectedFragment = new LogInFragment();
                            break;

                        case R.id.nav_signup:
                            selectedFragment = new SignUpFragment();
                            break;

                        case R.id.nav_logout:
                            selectedFragment = new LogOutFragment();
                            break;

                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();

                    return true;
                }
            };

    @Override
    public void performRegister() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SignUpFragment()).addToBackStack(null).commit();
    }

    @Override
    public void performLogin(String name) {
        preConfig.writeName(name);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new FragmentFood()).commit();
    }

    @Override
    public void logoutPerformed() {
        preConfig.writeLogInStatus(false);
        preConfig.writeName("User");
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new LogInFragment()).commit();
    }


    /*public void onButtonPressed(String message){
        FragmentYourCart obj = (FragmentYourCart)getSupportFragmentManager().findFragmentById(R.id.fragment_container);
    }*/
}

package com.example.marii.signup;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Home extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    public static PreConfig preConfig;
    public static ApiInterface apiInterface;


    android.support.v7.widget.Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private boolean isUserInteracting;
    final Context context = this;
    Button proceed;

    //creating the multi-wateva
    String[] listItems;
    boolean[] checkedItems;
    ArrayList<Integer> userItems = new ArrayList<>();


    //String[] spinnerTitles = {"Samosa","Egg chop", "Chapati", "Beef Sausage", "Kachori", "Muffin", "Short cake", "Half cake", "Bread", "Pork sausage", "Omelette", "Poached egg", "Kitumbua", "Kashata", "Mushrooms", "Oats", "Red beans", "Pancakes", "Azam andazi", "Marie biscuits", "Boiled sweet potato", "Fried sweet potato", "Smoked fish"};
    //String[] spinnerPrices = {"1500", "450", "400", "200", "600", "590", "350", "88", "88", "88", "88", "888", "88", "88", "88", "88", "88", "88", "88", "88", "88", "88","88"};
    //int[] spinnerImages = {R.drawable.samosa, R.drawable.eggchop, R.drawable.chapati, R.drawable.sausage, R.drawable.kachori, R.drawable.muffin, R.drawable.shortcake, R.drawable.halfcake, R.drawable.bread, R.drawable.sausage, R.drawable.omelette, R.drawable.poached_egg, R.drawable.kitumbua, R.drawable.kashata, R.drawable.mushrooms, R.drawable.oats, R.drawable.red_beans, R.drawable.pancakes, R.drawable.andazi, R.drawable.biscuits, R.drawable.sweet_potato, R.drawable.fried_potato, R.drawable.fish};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        preConfig = new PreConfig(this);
        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);



        Toast.makeText(getApplicationContext(), "Welcome" + Home.preConfig.readName(), Toast.LENGTH_SHORT).show();

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




        //creating the multi-wateva
        listItems = getResources().getStringArray(R.array.breakfast_items);
        checkedItems = new boolean[listItems.length];


        proceed = (Button)findViewById(R.id.proceed);
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Billing.class);
                //String item = (String) spinner.getSelectedItem();
                //intent.putExtra("item", item);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();
        if(id == R.id.nav1){
            Intent intent= new Intent(Home.this,Send_friend_money.class);
            startActivity(intent);
            //Toast.makeText(getApplicationContext(),"hi", Toast.LENGTH_SHORT).show();
        }
        if(id == R.id.nav2){
            Intent intent2= new Intent(Home.this,Top_up_account.class);
            startActivity(intent2);
        }
        if(id == R.id.nav3){
            Intent intent3= new Intent(Home.this,Invite_Friends.class);
            startActivity(intent3);
        }
        if(id == R.id.nav4){
            Intent intent4 = new Intent(Home.this, UserProfile.class);
            startActivity(intent4);
        }
        if(id == R.id.nav5){
            Intent intent5 = new Intent(Home.this, Settings.class);
            startActivity(intent5);
        }
        if(id == R.id.nav6){
            preConfig.writeLogInStatus(false);
            preConfig.writeName("User");

            Toast.makeText(getApplicationContext(), "Logged out", Toast.LENGTH_SHORT).show();
        }

        return false;
    }

    /*@Override
        public void onUserInteraction(){
            super.onUserInteraction();
            isUserInteracting = true;
    }*/



    //creating the multi-wateva

    public void onClick10(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(Home.this);
        LayoutInflater inflater = (LayoutInflater)this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.row_item, null);
        ListView listView = (ListView)row.findViewById(R.id.dialog_list);
        listView.setAdapter(new CustomAdapter(this));

        //builder.setView(row);

        builder.setTitle("Choose a Breakfast Option");
        builder.setMultiChoiceItems(listItems, checkedItems, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int position, boolean isChecked) {
                if (isChecked){
                    if (!userItems.contains(position)){
                        userItems.add(position);
                    }
                }
                else if (userItems.contains(position)){
                    userItems.remove(position);
                }
            }
        }).setView(row);

        builder.setCancelable(false);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String item = "";
                for (int i = 0; i<userItems.size(); i++){
                    item = item + listItems[userItems.get(i)];
                    if (i!= userItems.size() -1){
                        item = item + ",";
                    }
                }

            }
        });

        builder.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builder.setNeutralButton("Clear All", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                for (int i = 0; i<checkedItems.length; i++){
                    checkedItems[i] = false;
                    userItems.clear();
                }
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }




}


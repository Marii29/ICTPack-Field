package com.example.marii.signup;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

public class PreConfig {
    private SharedPreferences sharedPreferences;
    private Context context;

    public PreConfig(Context context){
        this.context = context;
        sharedPreferences = context.getSharedPreferences(context.getString(R.string.pref_file), Context.MODE_PRIVATE);


    }

    public void writeLogInStatus(boolean status){

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getString(R.string.pref_login_status), status);
        editor.commit();

    }

    public boolean readLogInStatus(){

        return sharedPreferences.getBoolean(context.getString(R.string.pref_login_status), false);

    }

    public void writeName(String name){

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(context.getString(R.string.pref_user_name), name);
        editor.commit();

    }

    public String readName(){
        return sharedPreferences.getString(context.getString(R.string.pref_user_name), "User");
    }

    public void displayToast(String message){

        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}

package com.example.marii.signup;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.marii.signup.MainActivity.apiInterface;


/**
 * A simple {@link Fragment} subclass.
 */
public class LogInFragment extends Fragment {

    private Button register, login;
    private EditText Name, Password;


    OnLoginFormActivityListener loginFormActivityListener;
    public interface OnLoginFormActivityListener{
        public void performRegister();
        public void performLogin(String name);
    }


    public LogInFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_log_in, container, false);

        register = (Button)view.findViewById(R.id.register_btn);
        Name = (EditText)view.findViewById(R.id.name2);
        Password = (EditText)view.findViewById(R.id.password2);
        login = (Button)view.findViewById(R.id.login2);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performLogin();
            }
        });


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                loginFormActivityListener.performRegister();
            }
        });



        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity activity = (Activity)context;
        loginFormActivityListener = (OnLoginFormActivityListener)activity;
    }

    public void performLogin(){
        String name = Name.getText().toString().trim();
        String password = Password.getText().toString().trim();

        Call<User> call = MainActivity.apiInterface.performLogin(name, password);
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {

                    if (response.body().getResponse().equals("ok")){

                        MainActivity.preConfig.writeLogInStatus(true);
                        loginFormActivityListener.performLogin(response.body().getName());
                        login.setEnabled(false);

                    }
                    else if (response.body().getResponse().equals("failed")){
                        MainActivity.preConfig.displayToast("Login failed.. Please try again");
                    }
                }


            @Override
            public void onFailure(Call<User> call, Throwable t) {

            }
        });
        Name.setText("");
        Password.setText("");

    }
}

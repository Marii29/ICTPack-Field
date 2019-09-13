package com.example.marii.signup;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * A simple {@link Fragment} subclass.
 */
public class SignUpFragment extends Fragment {

    private EditText Name, Password, E_mail, Phone_no;
    private Button sign_up;


    public SignUpFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sign_up, container, false);

        Name = (EditText)view.findViewById(R.id.name1);
        Password = (EditText)view.findViewById(R.id.password1);
        E_mail = (EditText)view.findViewById(R.id.e_mail1);
        Phone_no = (EditText)view.findViewById(R.id.phone_no1);
        sign_up = (Button) view.findViewById(R.id.signupbtn1);


        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performRegistration();
            }
        });



        return view;
    }

    public void performRegistration(){

        String name = Name.getText().toString();
        String password = Password.getText().toString();
        String e_mail = E_mail.getText().toString();
        String phone_no = Phone_no.getText().toString();


        Call<User> call = MainActivity.apiInterface.performRegistration(name, password, e_mail, phone_no);

        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {

                if (response.body().getResponse().equals("ok")){
                    MainActivity.preConfig.displayToast("Registration success...");
                }
                else if (response.body().getResponse().equals("exist")){
                    MainActivity.preConfig.displayToast("User already exists...");
                }
                else if (response.body().getResponse().equals("error")){
                    MainActivity.preConfig.displayToast("Something went wrong...");
                }

            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

            }
        });
        Name.setText("");
        Password.setText("");
        E_mail.setText("");
        Phone_no.setText("");
    }

}

package com.example.marii.signup;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class LogOutFragment extends Fragment {

    private Button logout;

    OnLogOutListener onLogOutListener;


    public interface OnLogOutListener{
        public void logoutPerformed();
    }


    public LogOutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_log_out, container, false);

        logout = (Button)view.findViewById(R.id.log_out);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onLogOutListener.logoutPerformed();
            }
        });



        return view;
    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        Activity activity = (Activity)context;
        onLogOutListener = (OnLogOutListener)activity;
    }

}

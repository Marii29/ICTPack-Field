package com.example.marii.signup;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FragmentYourCart extends Fragment {

    CustomAdapter adapter;
    String[] listItems;


    private List<SingleRow> listOrder;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View row = inflater.inflate(R.layout.fragment_your_cart, container, false);

        ListView listView = (ListView)row.findViewById(R.id.list_cart);
        listView.setAdapter(adapter);

        TextView textView = new TextView(row.getContext());
        TextView textView1 = new TextView(row.getContext());

        textView1.setText("750");
        textView.setText("maandazi");
        listView.addFooterView(textView);
        listView.addHeaderView(textView1);



        Button billing = (Button)row.findViewById(R.id.button);
        billing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Billing.class);
                startActivity(intent);
            }
        });

        return row;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listOrder = new ArrayList<>();
        listOrder.add(new SingleRow("muffin", "750", "3", R.drawable.muffin));


    }
}

package com.example.marii.signup;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class DinnerFragment extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Food> listFood;


    public DinnerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v =  inflater.inflate(R.layout.fragment_breakfast, container, false);
        myrecyclerview = (RecyclerView)v.findViewById(R.id.breakfast_recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), listFood);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerViewAdapter);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listFood = new ArrayList<>();
        listFood.add(new Food("Blueberry Muffin", "Blueberry raisins, no artificial colors", "Tsh.750", R.drawable.muffin));
        listFood.add(new Food("Samosa", "Cow cow wraps, beef minced meat, red onions", "Tsh.500", R.drawable.samosa));
        listFood.add(new Food("Blueberry Muffin", "Blueberry raisins, no artificial colors", "Tsh.750", R.drawable.muffin));
        listFood.add(new Food("Blueberry Muffin", "Blueberry raisins, no artificial colors", "Tsh.750", R.drawable.muffin));
        listFood.add(new Food("Blueberry Muffin", "Blueberry raisins, no artificial colors", "Tsh.750", R.drawable.muffin));
        listFood.add(new Food("Blueberry Muffin", "Blueberry raisins, no artificial colors", "Tsh.750", R.drawable.muffin));
        listFood.add(new Food("Blueberry Muffin", "Blueberry raisins, no artificial colors", "Tsh.750", R.drawable.muffin));
        listFood.add(new Food("Blueberry Muffin", "Blueberry raisins, no artificial colors", "Tsh.750", R.drawable.muffin));
        listFood.add(new Food("Blueberry Muffin", "Blueberry raisins, no artificial colors", "Tsh.750", R.drawable.muffin));
        listFood.add(new Food("Blueberry Muffin", "Blueberry raisins, no artificial colors", "Tsh.750", R.drawable.muffin));
        listFood.add(new Food("Blueberry Muffin", "Blueberry raisins, no artificial colors", "Tsh.750", R.drawable.muffin));
        listFood.add(new Food("Blueberry Muffin", "Blueberry raisins, no artificial colors", "Tsh.750", R.drawable.muffin));

    }
}

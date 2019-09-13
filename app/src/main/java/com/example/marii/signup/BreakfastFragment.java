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
public class BreakfastFragment extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Food> listFood;


    public BreakfastFragment() {
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
        listFood.add(new Food("Oats", "Oat grains, Low-fat milk", "Tsh.750", R.drawable.oats));
        listFood.add(new Food("Kachori", "Mashed potatoes, red onions, grainless wheat flour", "Tsh.750", R.drawable.kachori));
        listFood.add(new Food("Kashata", "Nuts, low-fat milk, honey, no artificial colors", "Tsh.750", R.drawable.kashata));
        listFood.add(new Food("Sausage", "Beef, Pork, Chicken, no artificial additives", "Tsh.750", R.drawable.sausage));
        listFood.add(new Food("Marie Biscuits", "Chocolate and vanilla covered, no artificial colors", "Tsh.750", R.drawable.biscuits));
        listFood.add(new Food("Chapati", "Made from scratch by fine chefs, no artificial colors", "Tsh.750", R.drawable.chapati));
        listFood.add(new Food("Short Cake", "Blueberry raisins, no artificial colors", "Tsh.750", R.drawable.shortcake));
        listFood.add(new Food("Pancakes", "Covered with butter, jam, honey", "Tsh.750", R.drawable.pancakes));
        listFood.add(new Food("Andazi", "Azam 100% organic flour, no preservatives added", "Tsh.750", R.drawable.andazi));
        listFood.add(new Food("Bread", "Brown, oat, white and with raisins, no artificial colors", "Tsh.750", R.drawable.bread));

    }
}

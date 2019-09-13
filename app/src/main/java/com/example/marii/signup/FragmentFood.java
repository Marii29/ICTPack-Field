package com.example.marii.signup;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class FragmentFood extends Fragment {

    View myFragment;
    ViewPager viewPager;
    TabLayout tabLayout;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myFragment = inflater.inflate(R.layout.fragment_food, container, false);

        viewPager = myFragment.findViewById(R.id.viewPager);
        tabLayout = myFragment.findViewById(R.id.tabLayout);

        Toast.makeText(getContext(), "Welcome " + MainActivity.preConfig.readName(), Toast.LENGTH_SHORT).show();




        return myFragment;

    }


    public void  onActivityCreated(@Nullable Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setUpViewPager(ViewPager viewPager) {
        SectionPagerAdapter adapter = new SectionPagerAdapter(getChildFragmentManager());

        adapter.addFragment(new BreakfastFragment(), "Breakfast");
        adapter.addFragment(new LunchFragment(), "Lunch");
        adapter.addFragment(new DinnerFragment(), "Dinner");
        adapter.addFragment(new SpecialsFragment(), "Specials");
        adapter.addFragment(new DrinksFragment(), "Drinks");
        adapter.addFragment(new ExtrasFragment(), "Extras");

        viewPager.setAdapter(adapter);
    }
}

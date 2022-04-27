package com.example.foodsecurityproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment1 extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);

        view.findViewById(R.id.button_rice_statistics).setOnClickListener(view1 -> {
            Navigation.findNavController(view).navigate(R.id.to_riceStats);
        });
        view.findViewById(R.id.button_water_statistics).setOnClickListener(view1 -> {
            Navigation.findNavController(view).navigate(R.id.to_waterStats);
        });
        view.findViewById(R.id.button_wheat_statistics).setOnClickListener(view1 -> {
            Navigation.findNavController(view).navigate(R.id.to_wheatStats);
        });

        return view;
    }
}
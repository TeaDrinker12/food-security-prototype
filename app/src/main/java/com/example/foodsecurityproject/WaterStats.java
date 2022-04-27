package com.example.foodsecurityproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class WaterStats extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_water_stats, container, false);

        view.findViewById(R.id.water_region_button).setOnClickListener(v -> {
            Navigation.findNavController(view).navigate(R.id.to_regionalUse);
        });
        view.findViewById(R.id.water_desalination_button).setOnClickListener(v -> {
            Navigation.findNavController(view).navigate(R.id.to_desalinationPlants);
        });

        return view;
    }
}
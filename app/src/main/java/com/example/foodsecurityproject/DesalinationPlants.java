package com.example.foodsecurityproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DesalinationPlants extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_desalination_plants, container, false);

        view.findViewById(R.id.done_button).setOnClickListener(v -> {
            Navigation.findNavController(view).popBackStack();
        });

        return view;
    }
}
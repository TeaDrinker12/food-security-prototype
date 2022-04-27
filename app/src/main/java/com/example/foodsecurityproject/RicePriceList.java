package com.example.foodsecurityproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class RicePriceList extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_rice_price_list, container, false);

        view.findViewById(R.id.done_button).setOnClickListener(v -> {
            Navigation.findNavController(view).popBackStack();
        });

        Spinner spinner = view.findViewById(R.id.regionSpinner);

        String[] regionList = {
                "Al-Hasa",
                "Dammam",
                "Dhahran",
                "Najran",
                "Madinah",
                "Makkah",
                "Riyadh"
        };

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getContext(), androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, regionList);
        spinner.setAdapter(arrayAdapter);
        return view;
    }
}
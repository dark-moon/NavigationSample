package com.example.navigationsample;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class RedFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_red, container, false);
        Button btnBlue = root.findViewById(R.id.blue_button);

        NavController navController = NavHostFragment.findNavController(this);

        btnBlue.setOnClickListener(v -> {
            navController.navigate(R.id.action_redFragment_to_blueFragment);
        });

        // Inflate the layout for this fragment
        return root;
    }
}
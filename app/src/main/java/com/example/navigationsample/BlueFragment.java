package com.example.navigationsample;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class BlueFragment extends Fragment {

    private Button redButton;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_blue, container, false);
        redButton = root.findViewById(R.id.red_button);

        NavController navController = NavHostFragment.findNavController(this);

        redButton.setOnClickListener(v -> {
            navController.navigate(R.id.action_blueFragment_to_redFragment);
        });
        // Inflate the layout for this fragment
        return root;
    }
}
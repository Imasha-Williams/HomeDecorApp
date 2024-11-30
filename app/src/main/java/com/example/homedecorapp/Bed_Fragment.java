package com.example.homedecorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Bed_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Bed_Fragment extends Fragment {

    // Parameter arguments for the fragment
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public Bed_Fragment() {
        // Required empty public constructor
    }

    // Factory method to create a new instance of this fragment
    public static Bed_Fragment newInstance(String param1, String param2) {
        Bed_Fragment fragment = new Bed_Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bed_, container, false);

        // Find the ImageView by its ID
        ImageView bedImageView1 = view.findViewById(R.id.bedImage01);
        ImageView bedImageView2 = view.findViewById(R.id.bedImage02);
        ImageView bedImageView3 = view.findViewById(R.id.bedImage03);
        ImageView bedImageView4 = view.findViewById(R.id.bedImage04);

        // Set an OnClickListener to the ImageView
        bedImageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Use requireContext() to get a valid Context
                Intent intent = new Intent(requireContext(), BedDetails.class);
                startActivity(intent);
            }
        });

        bedImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Use requireContext() to get a valid Context
                Intent intent = new Intent(requireContext(), BedDetails.class);
                startActivity(intent);
            }
        });

        bedImageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Use requireContext() to get a valid Context
                Intent intent = new Intent(requireContext(), BedDetails.class);
                startActivity(intent);
            }
        });

        bedImageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Use requireContext() to get a valid Context
                Intent intent = new Intent(requireContext(), BedDetails.class);
                startActivity(intent);
            }
        });

        return view;
    }
}

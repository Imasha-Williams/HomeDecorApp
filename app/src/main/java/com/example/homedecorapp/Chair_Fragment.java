package com.example.homedecorapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Chair_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Chair_Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Chair_Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Chair_Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Chair_Fragment newInstance(String param1, String param2) {
        Chair_Fragment fragment = new Chair_Fragment();
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

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chair_, container, false);

        // Find the ImageView by its ID
        ImageView chairImageView1 = view.findViewById(R.id.chairImage01);
        ImageView chairImageView2 = view.findViewById(R.id.chairImage02);
        ImageView chairImageView3 = view.findViewById(R.id.chairImage03);
        ImageView chairImageView4 = view.findViewById(R.id.chairImage04);

        // Set an OnClickListener to the ImageView
        chairImageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Use requireContext() to get a valid Context
                Intent intent = new Intent(requireContext(), ChairDetails.class);
                startActivity(intent);
            }
        });

        chairImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Use requireContext() to get a valid Context
                Intent intent = new Intent(requireContext(), ChairDetails.class);
                startActivity(intent);
            }
        });

        chairImageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Use requireContext() to get a valid Context
                Intent intent = new Intent(requireContext(), ChairDetails.class);
                startActivity(intent);
            }
        });

        chairImageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Use requireContext() to get a valid Context
                Intent intent = new Intent(requireContext(), ChairDetails.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
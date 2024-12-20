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
 * Use the {@link Cabinet_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Cabinet_Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Cabinet_Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Cabinet_Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Cabinet_Fragment newInstance(String param1, String param2) {
        Cabinet_Fragment fragment = new Cabinet_Fragment();
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
        View view = inflater.inflate(R.layout.fragment_cabinet_, container, false);

        // Find the ImageView by its ID
        ImageView cabinetImageView1 = view.findViewById(R.id.cabinetImage01);
        ImageView cabinetImageView2 = view.findViewById(R.id.cabinetImage02);
        ImageView cabinetImageView3 = view.findViewById(R.id.cabinetImage03);
        ImageView cabinetImageView4 = view.findViewById(R.id.cabinetImage04);

        // Set an OnClickListener to the ImageView
        cabinetImageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Use requireContext() to get a valid Context
                Intent intent = new Intent(requireContext(), CabinetDetails.class);
                startActivity(intent);
            }
        });

        cabinetImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Use requireContext() to get a valid Context
                Intent intent = new Intent(requireContext(), CabinetDetails.class);
                startActivity(intent);
            }
        });

        cabinetImageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Use requireContext() to get a valid Context
                Intent intent = new Intent(requireContext(), CabinetDetails.class);
                startActivity(intent);
            }
        });

        cabinetImageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Use requireContext() to get a valid Context
                Intent intent = new Intent(requireContext(), CabinetDetails.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
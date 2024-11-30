package com.example.homedecorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ChairDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chair_details);

        // Button click to navigate to Cart
        Button btn = findViewById(R.id.AddToCartBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(ChairDetails.this, Cart.class);
                startActivity(intent);
            }
        });

        // Image click to navigate to another page
        ImageView bedImage = findViewById(R.id.backArrowImg);
        bedImage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(ChairDetails.this, Dashboard.class);
                startActivity(intent);
            }
        });
    }
}
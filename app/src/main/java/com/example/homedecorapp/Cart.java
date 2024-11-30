package com.example.homedecorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Cart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        ImageView backArrow = findViewById(R.id.backArrowImg);

        // Set a click listener for the profile icon
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirect to the Profile activity
                Intent intent = new Intent(Cart.this, Dashboard.class);
                startActivity(intent);
            }
        });

        Button btn = findViewById(R.id.checkOut);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Cart.this, Dashboard.class);
                startActivity(intent);
            }
        });
    }
}
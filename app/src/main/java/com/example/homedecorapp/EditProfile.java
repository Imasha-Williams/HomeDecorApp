package com.example.homedecorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        Button btn = findViewById(R.id.button5);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(EditProfile.this, Dashboard.class);
                startActivity(intent);
            }
        });

        Button btn1 = findViewById(R.id.button6);
        btn1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(EditProfile.this, Profile.class);
                startActivity(intent);
            }
        });
    }
}
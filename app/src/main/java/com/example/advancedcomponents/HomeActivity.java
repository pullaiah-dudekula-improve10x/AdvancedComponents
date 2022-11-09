package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setTitle("Home");

        Button luckyNumberBtn = findViewById(R.id.lucky_number_btn);
        luckyNumberBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, LuckyNumberActivity.class);
            startActivity(intent);
        });

        Button locationBtn = findViewById(R.id.location_btn);
        locationBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, LocationActivity.class);
            startActivity(intent);
        });

        Button dateOfBirthBtn = findViewById(R.id.date_of_birth_btn);
        dateOfBirthBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, DateOfBirthActivity.class);
            startActivity(intent);
        });

        Button teamBtn = findViewById(R.id.team_btn);
        teamBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, TeamActivity.class);
            startActivity(intent);
        });

        Button teamMembersBtn = findViewById(R.id.team_members_btn);
        teamMembersBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, TeamMembersActivity.class);
            startActivity(intent);

        });
    }
}
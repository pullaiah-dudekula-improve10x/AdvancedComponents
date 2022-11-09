package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class LocationActivity extends AppCompatActivity {
    public ArrayList<String> statesList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        getSupportActionBar().setTitle("Location");
        setUpData();
        setUpStates();
    }

    private void setUpData() {
        statesList = new ArrayList<>();
        statesList.add("Andhra Pradesh");
        statesList.add("Arunachal Pradesh");
        statesList.add("Assam");
        statesList.add("Bihar");
        statesList.add("Chhattisgarh");
        statesList.add("Goa");
        statesList.add("Gujarat");
        statesList.add("Himachal Pradesh");
        statesList.add("Jammu and Kashmir");
        statesList.add("Jharkhand");
        statesList.add("Karnataka");
        statesList.add("Kerala");
        statesList.add("Madhya Pradesh");
        statesList.add("Maharashtra");
        statesList.add("Manipur");
        statesList.add("Mizoram");
        statesList.add("Nagaland");
        statesList.add("Odisha");
        statesList.add("Punjab");
        statesList.add("Rajasthan");
        statesList.add("Sikkim");
        statesList.add("TamilNadu");
        statesList.add("Telangana");
        statesList.add("Tripura");
        statesList.add("UttarPradesh");
        statesList.add("Uttarakhand");
        statesList.add("West Bengal");
    }

    public void setUpStates() {
        Spinner locationSp = findViewById(R.id.location_sp);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.states_item, statesList);
        locationSp.setAdapter(arrayAdapter);
    }
}

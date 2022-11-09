package com.example.advancedcomponents;

import static android.R.layout.simple_list_item_activated_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import org.w3c.dom.NameList;

import java.util.ArrayList;

public class TeamActivity extends AppCompatActivity {
    public ArrayList<String> namesList;
    public Spinner teamNameSp;
    public ArrayAdapter<String>arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
        getSupportActionBar().setTitle("Team");
        setUpData();
        setUpNames();
        handleAdd();
    }

    private void setUpData() {
            namesList = new ArrayList<>();
            namesList.add("Renuka");
            namesList.add("Viswanath");
        }

    public void handleAdd() {
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(view -> {
            EditText nameTxt = findViewById(R.id.name_txt);
            String name = nameTxt.getText().toString();
            if(name.equals("") == false) {
                arrayAdapter.add(name);
                arrayAdapter.notifyDataSetChanged();
            }
            nameTxt.setText("");
        });
    }

    public void setUpNames() {
        teamNameSp = findViewById(R.id.team_sp);
         arrayAdapter = new ArrayAdapter<String>(
                 this, android.R.layout.simple_list_item_1, namesList);
        teamNameSp.setAdapter(arrayAdapter);

    }
}
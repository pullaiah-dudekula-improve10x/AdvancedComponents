package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class TeamListActivity extends AppCompatActivity {
    public ArrayList<String> membersList;
    public ListView listViewLv;
    public ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_list);
        getSupportActionBar().setTitle("Team List");
        setUpData();
        setupListview();
        handleAdd();
    }

    public void setupListview() {
         listViewLv = findViewById(R.id.listview_lv);
        arrayAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, membersList);
        listViewLv.setAdapter(arrayAdapter);

    }
    public void setUpData() {
        membersList = new ArrayList<>();
        membersList.add("Viswanath");
        membersList.add("Renuka");
    }

    public void handleAdd() {
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(view -> {
            EditText enterNameTxt = findViewById(R.id.enter_name_txt);
            String name = enterNameTxt.getText().toString();
            if(name.equals("") == false) {
                arrayAdapter.add(name);
                arrayAdapter.notifyDataSetChanged();
            }
            enterNameTxt.setText("");
        });
    }
}
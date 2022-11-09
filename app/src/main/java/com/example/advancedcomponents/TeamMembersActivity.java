package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class TeamMembersActivity extends AppCompatActivity {
    public ArrayList<String> selectTeam;
    public ArrayList<String> allMembers;
    public ArrayList<String> teamA;
    public ArrayList<String> teamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_members);
        getSupportActionBar().setTitle("Team Members");
        setUpSelectTeamData();
        setUpSelectTeam();
        setUpAllMembers();
        setUpTeamA();
        setUpTeamB();
    }

    public void setUpSelectTeamData() {
        selectTeam = new ArrayList<>();
        selectTeam.add("Viswanath");
        selectTeam.add("Renuka");
    }

    public void setUpSelectTeam() {
        Spinner selectTeamSp = findViewById(R.id.select_team_sp);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, selectTeam);
        selectTeamSp.setAdapter(arrayAdapter);

    }

    public void setUpAllMembers() {
        Spinner allMembersSp = findViewById(R.id.all_members_sp);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, allMembers);
        allMembersSp.setAdapter(arrayAdapter);

    }

    public void setUpTeamA(){
        Spinner teamASp = findViewById(R.id.teama_sp);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,teamA);
        teamASp.setAdapter(arrayAdapter);
    }

    public void setUpTeamB() {
        Spinner teamBSp = findViewById(R.id.teamb_sp);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,teamB);
        teamBSp.setAdapter(arrayAdapter);
    }
}
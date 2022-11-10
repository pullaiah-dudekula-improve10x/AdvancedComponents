package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ContactActivity extends AppCompatActivity {
    public ArrayList<Contacts> contactsList;
    public ArrayAdapter<Contacts> arrayAdapter;
    public ListView contactsLv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        getSupportActionBar().setTitle("Contacts");
        setUpData();
        setUpDataContactsLv();
    }

    public void setUpDataContactsLv() {
         contactsLv = findViewById(R.id.contacts_lv);
        arrayAdapter = new ArrayAdapter<Contacts>(
                this, R.layout.contacts_item, contactsList);
    }

    private void setUpData() {
        contactsList = new ArrayList<>();
        Contacts contact = new Contacts();
        contact.name = ("Viswanath");
        contact.phoneNumber = ("+91 7013754415");
        contactsList.add(contact);

        Contacts contact1 = new Contacts();
        contact1.name = ("Renuka");
        contact1.phoneNumber = ("+91 9154539293");
        contactsList.add(contact1);
    }
}
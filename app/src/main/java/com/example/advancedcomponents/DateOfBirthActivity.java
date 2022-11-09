package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class DateOfBirthActivity extends AppCompatActivity {
    public ArrayList<Integer> datesList;
    public ArrayList<String> monthsList;
    public ArrayList<Integer> yearList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_of_birth);
        getSupportActionBar().setTitle("Date of Birth");
        setUpDatesData();
        setUpMonthsData();
        setUpYearsData();
        setUpDates();
        setUpMonth();
        setUpYear();
    }
    public void setUpDatesData() {
        datesList = new ArrayList<>();
        datesList.add(1);
        datesList.add(2);
        datesList.add(3);
        datesList.add(4);
        datesList.add(5);
        datesList.add(6);
        datesList.add(7);
        datesList.add(8);
        datesList.add(9);
        datesList.add(10);
        datesList.add(11);
        datesList.add(12);
        datesList.add(13);
        datesList.add(13);
        datesList.add(14);
        datesList.add(15);
        datesList.add(16);
        datesList.add(17);
        datesList.add(18);
        datesList.add(19);
        datesList.add(20);
        datesList.add(21);
        datesList.add(22);
        datesList.add(23);
        datesList.add(24);
        datesList.add(25);
        datesList.add(26);
        datesList.add(27);
        datesList.add(28);
        datesList.add(29);
        datesList.add(30);
        datesList.add(31);


    }

    public void setUpMonthsData() {
        monthsList = new ArrayList<>();
        monthsList.add("January");
        monthsList.add("February");
        monthsList.add("March");
        monthsList.add("April");
        monthsList.add("May");
        monthsList.add("June");
        monthsList.add("July");
        monthsList.add("August");
        monthsList.add("September");
        monthsList.add("October");
        monthsList.add("November");
        monthsList.add("December");
    }

    public void setUpYearsData() {
        yearList = new ArrayList<>();
        yearList.add(1960);
        yearList.add(1962);
        yearList.add(1963);
        yearList.add(1964);
        yearList.add(1965);
        yearList.add(1966);
        yearList.add(1967);
        yearList.add(1968);
        yearList.add(1969);
        yearList.add(1970);
        yearList.add(1971);
        yearList.add(1972);
        yearList.add(1973);
        yearList.add(1974);
        yearList.add(1975);
        yearList.add(1976);
        yearList.add(1977);
        yearList.add(1978);
        yearList.add(1979);
        yearList.add(1980);
        yearList.add(1981);
        yearList.add(1982);
        yearList.add(1983);
        yearList.add(1984);
        yearList.add(1985);
        yearList.add(1986);
        yearList.add(1987);
        yearList.add(1988);
        yearList.add(1989);
        yearList.add(1990);
        yearList.add(1991);
        yearList.add(1992);
        yearList.add(1993);
        yearList.add(1994);
        yearList.add(1995);
        yearList.add(1996);
        yearList.add(1997);
        yearList.add(1998);
        yearList.add(1999);
        yearList.add(2000);
        yearList.add(2001);
        yearList.add(2002);
        yearList.add(2003);
        yearList.add(2004);
        yearList.add(2005);
        yearList.add(2006);
        yearList.add(2007);
        yearList.add(2008);
        yearList.add(2009);
        yearList.add(2010);
        yearList.add(2011);
        yearList.add(2012);
        yearList.add(2013);
        yearList.add(2014);
        yearList.add(2015);
        yearList.add(2016);
        yearList.add(2017);
        yearList.add(2018);
        yearList.add(2019);
        yearList.add(2020);
    }

    public void setUpDates() {
         Spinner dateSp = findViewById(R.id.date_sp);
        ArrayAdapter<Integer> arrayAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_activated_1, datesList);
         dateSp.setAdapter(arrayAdapter);

     }

     public void setUpMonth() {
        Spinner monthSp = findViewById(R.id.month_sp);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.months_item, monthsList);
        monthSp.setAdapter(arrayAdapter);
     }

     public void setUpYear() {
        Spinner yearSp = findViewById(R.id.year_sp);
        ArrayAdapter<Integer> arrayAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_activated_1, yearList);
        yearSp.setAdapter(arrayAdapter);

     }
}

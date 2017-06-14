package com.example.leapa.autotask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinnerapplist;
    Spinner conditionlist;
    Spinner onoff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Intent launchYouTube = getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
        //startActivity(launchYouTube);
        spinnerapplist=(Spinner)findViewById(R.id.AppList);
        final ArrayList<String> arrayapp=new ArrayList<String>();
        arrayapp.add("Facebook");
        arrayapp.add("Youtube");
        arrayapp.add("Google map");
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,arrayapp);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerapplist.setAdapter(arrayAdapter);


        ////////
        conditionlist=(Spinner)findViewById(R.id.CondList);
        final ArrayList<String> arraycond=new ArrayList<String>();
        arraycond.add("WIFI");
        arraycond.add("BLUETOOTH");
        arraycond.add("6 p.m");
        ArrayAdapter arrayAdapter1=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,arraycond);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        conditionlist.setAdapter(arrayAdapter1);

        /////
        onoff=(Spinner)findViewById(R.id.Onoff);
        final ArrayList<String> arrayonoff=new ArrayList<String>();
        arrayonoff.add("ON");
        arrayonoff.add("OFF");
        ArrayAdapter arrayAdapter2=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,arrayonoff);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        onoff.setAdapter(arrayAdapter2);

//        Spinner spinner = (Spinner) findViewById(R.id.spinner);
//        spinner.setOnItemSelectedListener(this);

   }
}

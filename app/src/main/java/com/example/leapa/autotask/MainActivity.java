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
 //       arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinnerapplist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, arrayapp.get(position),Toast.LENGTH_SHORT).show();
//            }
//        });
        spinnerapplist.setAdapter(arrayAdapter);


   }
}

package com.vanguardswift.vanguardapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Random;

public class SectionE extends AppCompatActivity {

    RadioGroup rg_inventive;
    RadioGroup rg_expanded_output;
    RadioGroup rg_quick_decisions;
    RadioGroup rg_set_goals;
    RadioGroup rg_schedule_tasks;
    RadioGroup rg_seek_out_info;
    EditText collectors_name_text;


    String inventive= "";
    String expanded_output= "";
    String quick_decisions= "";
    String set_goals= "";
    String schedule_tasks= "";
    String seek_out_info= "";

    String collectors_name = "";

    DatabaseReference vanguardDb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_e);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        vanguardDb = FirebaseDatabase.getInstance().getReference("");


        rg_inventive = findViewById(R.id.rg_inventive);
        rg_expanded_output = findViewById(R.id.rg_expanded_output);
        rg_quick_decisions = findViewById(R.id.rg_quick_decisions);
        rg_set_goals = findViewById(R.id.rg_set_goals);
        rg_schedule_tasks = findViewById(R.id.rg_schedule_tasks);
        rg_seek_out_info = findViewById(R.id.rg_seek_out_info);
        collectors_name_text = findViewById(R.id.collectors_name_text);



    }

    public void rg_inventive(View v) {

        int radioId = rg_inventive.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        inventive = genderButton.getText().toString();
    }

    public void rg_expanded_output(View v) {
        int radioId = rg_expanded_output.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        expanded_output = genderButton.getText().toString();
    }

    public void rg_quick_decisions(View v) {
        int radioId = rg_quick_decisions.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        quick_decisions = genderButton.getText().toString();
    }

    public void rg_set_goals(View v) {
        int radioId = rg_set_goals.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        set_goals = genderButton.getText().toString();
    }

    public void rg_schedule_tasks(View v) {
        int radioId = rg_schedule_tasks.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        schedule_tasks = genderButton.getText().toString();
    }

    public void rg_seek_out_info(View v) {
        int radioId = rg_seek_out_info.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        seek_out_info = genderButton.getText().toString();
    }

    public void onSubmit(View v){

        collectors_name = collectors_name_text.getText().toString();
        
        ResponseE response = new ResponseE(  inventive,
         expanded_output,
         quick_decisions,
         set_goals,
         schedule_tasks,
         seek_out_info,
                collectors_name);

        SharedPreferences preferences = this.getSharedPreferences("com.vanguardswift.vanguardapp", Context.MODE_PRIVATE);
        String responseId = preferences.getString("responseId", String.valueOf((new Random()).nextInt(10000)));

        vanguardDb.child(responseId).child("sectionE").setValue(response);


        Intent intent = new Intent(SectionE.this, Complete.class);
        SectionE.this.startActivity(intent);
    }



}

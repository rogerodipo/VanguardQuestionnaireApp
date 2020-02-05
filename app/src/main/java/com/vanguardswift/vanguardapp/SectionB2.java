package com.vanguardswift.vanguardapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Random;

public class SectionB2 extends AppCompatActivity {

    RadioGroup rg_replace;
    RadioGroup rg_disinfect;
    RadioGroup rg_clean_before;
    RadioGroup rg_clean_after;
    RadioGroup rg_wash;
    RadioGroup rg_clear;
    RadioGroup rg_inspect;
    RadioGroup rg_ipm;
    RadioGroup rg_inspect_freq;
    RadioGroup rg_bee_hive_inspection_duty;
    RadioGroup rg_apiary_inspection_duty;
    RadioGroup rg_harvesting_duty;
    RadioGroup rg_installation_duty;
    RadioGroup rg_manager_gender;
    RadioGroup rg_forage_B2;
    RadioGroup rg_water_source;

    String replace = "";
    String disinfect = "";
    String clean_before = "";
    String clean_after = "";
    String wash = "";
    String clear = "";
    String inspect = "";
    String ipm = "";
    String inspect_freq = "";
    String bee_hive_inspection_duty = "";
    String apiary_inspection_duty = "";
    String harvesting_duty = "";
    String installation_duty = "";
    String manager_gender = "";
    String forage_B2 = "";
    String water_source = "";

    DatabaseReference vanguardDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_b2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        vanguardDb = FirebaseDatabase.getInstance().getReference("");


        rg_replace = findViewById(R.id.rg_replace);
        rg_disinfect = findViewById(R.id.rg_disinfect);
        rg_clean_before = findViewById(R.id.rg_clean_before);
        rg_clean_after = findViewById(R.id.rg_clean_after);
        rg_wash = findViewById(R.id.rg_wash);
        rg_clear = findViewById(R.id.rg_clear);
        rg_inspect = findViewById(R.id.rg_inspect);
        rg_ipm = findViewById(R.id.rg_ipm);
        rg_inspect_freq = findViewById(R.id.rg_inspect_freq);
        rg_bee_hive_inspection_duty = findViewById(R.id.rg_bee_hive_inspection_duty);
        rg_apiary_inspection_duty = findViewById(R.id.rg_apiary_inspection_duty);
        rg_harvesting_duty = findViewById(R.id.rg_harvesting_duty);
        rg_installation_duty = findViewById(R.id.rg_installation_duty);
        rg_manager_gender = findViewById(R.id.rg_manager_gender);
        rg_forage_B2 = findViewById(R.id.rg_forage_B2);
        rg_water_source = findViewById(R.id.rg_water_source);


    }

    public void rg_replace(View view) {
        int radioId = rg_replace.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        replace = genderButton.getText().toString();
    }

    public void rg_disinfect(View view) {
        int radioId = rg_disinfect.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        disinfect = genderButton.getText().toString();
    }

    public void rg_clean_before(View view) {

        int radioId = rg_clean_before.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        clean_before = genderButton.getText().toString();
    }

    public void rg_clean_after(View view) {

        int radioId = rg_clean_after.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        clean_after = genderButton.getText().toString();
    }

    public void rg_wash(View view) {

        int radioId = rg_wash.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        wash = genderButton.getText().toString();
    }

    public void rg_clear(View view) {

        int radioId = rg_clear.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        clear = genderButton.getText().toString();
    }

    public void rg_inspect(View view) {

        int radioId = rg_inspect.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        inspect = genderButton.getText().toString();
    }

    public void rg_ipm(View view) {

        int radioId = rg_ipm.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        ipm = genderButton.getText().toString();
    }

    public void rg_inspect_freq(View view) {

        int radioId = rg_inspect_freq.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        inspect_freq = genderButton.getText().toString();
    }

    public void rg_bee_hive_inspection_duty(View view) {
        int radioId = rg_bee_hive_inspection_duty.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        bee_hive_inspection_duty = genderButton.getText().toString();
    }

    public void rg_apiary_inspection_duty(View view) {
        int radioId = rg_apiary_inspection_duty.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        apiary_inspection_duty = genderButton.getText().toString();
    }

    public void rg_harvesting_duty(View view) {
        int radioId = rg_harvesting_duty.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        harvesting_duty = genderButton.getText().toString();
    }

    public void rg_installation_duty(View view) {

        int radioId = rg_installation_duty.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        installation_duty = genderButton.getText().toString();
    }

    public void rg_manager_gender(View view) {
        int radioId = rg_manager_gender.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        manager_gender = genderButton.getText().toString();
    }

    public void rg_forage_B2(View view) {
        int radioId = rg_forage_B2.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        forage_B2 = genderButton.getText().toString();
    }

    public void rg_water_source(View view) {
        int radioId = rg_water_source.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        water_source = genderButton.getText().toString();

    }
    public void onSubmit(View v){


        
        ResponseB2 responseB2 = new ResponseB2(  disinfect,
         replace,
         clean_before,
         clean_after,
         wash,
         clear,
         inspect,
         ipm,
         inspect_freq,
         bee_hive_inspection_duty,
         apiary_inspection_duty,
         harvesting_duty,
         installation_duty,
         manager_gender,
         forage_B2,
         water_source);

        SharedPreferences preferences = this.getSharedPreferences("com.vanguardswift.vanguardapp", Context.MODE_PRIVATE);
        String responseId = preferences.getString("responseId", String.valueOf((new Random()).nextInt(10000)));

        vanguardDb.child(responseId).child("sectionB2").setValue(responseB2);


        Intent intent = new Intent(SectionB2.this, SectionC.class);
        SectionB2.this.startActivity(intent);
    }
}

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

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Random;

public class SectionC extends AppCompatActivity {

RadioGroup rg_profitable;
RadioGroup rg_desire_more_income;
RadioGroup rg_for_market;
RadioGroup rg_new_markets;

String profitable = "";
String desire_more_income = "";
String for_market = "";
String new_markets = "";


    DatabaseReference vanguardDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_c);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Section C: Psychological Factors");

        vanguardDb = FirebaseDatabase.getInstance().getReference("");

         rg_profitable = findViewById(R.id.rg_profitable);
         rg_desire_more_income = findViewById(R.id.rg_desire_more_income);
         rg_for_market = findViewById(R.id.rg_for_market);
         rg_new_markets = findViewById(R.id.rg_new_markets);


    }

    public void rg_profitable(View view) {
        int radioId = rg_profitable.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        profitable = button.getText().toString();
    }

    public void rg_desire_more_income(View view) {
        int radioId = rg_desire_more_income.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        desire_more_income = button.getText().toString();
    }

    public void rg_for_market(View view) {
        int radioId = rg_for_market.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        for_market = button.getText().toString();
    }

    public void rg_new_markets(View view) {
        int radioId = rg_new_markets.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        new_markets = button.getText().toString();
    }




    public void onSubmit(View v) {


        ResponseC response = new ResponseC(profitable, desire_more_income, for_market, new_markets);

        SharedPreferences preferences = this.getSharedPreferences("com.vanguardswift.vanguardapp", Context.MODE_PRIVATE);
        String responseId = preferences.getString("responseId", String.valueOf((new Random()).nextInt(10000)));

        vanguardDb.child(responseId).child("sectionC").setValue(response);
        Intent intent = new Intent(SectionC.this, SectionD.class);
        SectionC.this.startActivity(intent);
    }


}

package com.vanguardswift.vanguardapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Random;

public class SectionB extends AppCompatActivity {

    EditText beeKeepingIncomeEditText;
    EditText otherFarmIncomeEditText;
    EditText offFarmIncomeEditText;
    EditText farmSizeEditText;

    String beeKeepingIncome = "";
    String otherFarmIncome = "";
    String offFarmIncome = "";
    String farmSize = "";

    RadioGroup rg_social_bee_farmers;
    RadioGroup rg_social_co_op;
    RadioGroup rg_social_farmers_group;
    RadioGroup rg_social_ngo;
    RadioGroup rg_social_savings_group;
    RadioGroup rg_beekeeping_training;
    RadioGroup rg_field_visits;
    RadioGroup rg_demonstration;
    RadioGroup rg_business;

    String socialBeeFarmers = "";
    String socialCoOp = "";
    String socialFarmersGroup= "";
    String socialNGO = "";
    String socialSavingsGroup = "";
    String beekeepingTraining = "";
    String fieldVisits= "";
    String demonstrations = "";
    String business = "";


    DatabaseReference vanguardDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_b);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        vanguardDb = FirebaseDatabase.getInstance().getReference("");

        beeKeepingIncomeEditText = findViewById(R.id.bee_keeping);
        otherFarmIncomeEditText = findViewById(R.id.other_farming_activities);
        offFarmIncomeEditText = findViewById(R.id.off_farm_activities_text);
        farmSizeEditText = findViewById(R.id.farm_size_text);

        rg_social_bee_farmers = findViewById(R.id.rg_social_bee_farmers);
        rg_social_co_op = findViewById(R.id.rg_social_co_op);
        rg_social_farmers_group = findViewById(R.id.rg_social_farmers_group);
        rg_social_ngo = findViewById(R.id.rg_social_ngo);
        rg_social_savings_group = findViewById(R.id.rg_social_savings_group);
        rg_beekeeping_training = findViewById(R.id.rg_beekeeping_training);
        rg_field_visits = findViewById(R.id.rg_field_visits);
        rg_demonstration = findViewById(R.id.rg_demonstration);
        rg_business = findViewById(R.id.rg_business);

    }

    public void rg_social_bee_farmers(View view) {
        int radioId = rg_social_bee_farmers.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        socialBeeFarmers = button.getText().toString();
    }

    public void rg_social_co_op(View view) {
        int radioId = rg_social_co_op.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        socialCoOp = button.getText().toString();
    }

    public void rg_social_farmers_group(View view) {
        int radioId = rg_social_farmers_group.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        socialFarmersGroup = button.getText().toString();
    }

    public void rg_social_ngo(View view) {
        int radioId = rg_social_ngo.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        socialNGO = button.getText().toString();
    }

    public void rg_social_savings_group(View view) {
        int radioId = rg_social_savings_group.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        socialSavingsGroup = button.getText().toString();
    }

    public void rg_beekeeping_training(View view) {
        int radioId = rg_beekeeping_training.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        beekeepingTraining = button.getText().toString();
    }

    public void rg_field_visits(View view) {
        int radioId = rg_field_visits.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        fieldVisits = button.getText().toString();
    }

    public void rg_demonstration(View view) {
        int radioId = rg_demonstration.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        demonstrations = button.getText().toString();
    }

    public void rg_business(View view) {
        int radioId = rg_business.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        business = button.getText().toString();
    }





    public void onSubmit(View v) {

        beeKeepingIncome = beeKeepingIncomeEditText.getText().toString();
        otherFarmIncome = otherFarmIncomeEditText.getText().toString();
        offFarmIncome = offFarmIncomeEditText.getText().toString();
        farmSize = farmSizeEditText.getText().toString();


        SharedPreferences preferences = this.getSharedPreferences("com.vanguardswift.vanguardapp", Context.MODE_PRIVATE);
        String responseId = preferences.getString("responseId", String.valueOf((new Random()).nextInt(10000)));

        ResponseB response = new ResponseB(beeKeepingIncome,
                otherFarmIncome,
                offFarmIncome,
                farmSize,
                socialBeeFarmers,
                socialCoOp,
                socialFarmersGroup,
                socialNGO,
                socialSavingsGroup,
                beekeepingTraining,
                fieldVisits,
                demonstrations,
                business
                );

        vanguardDb.child(responseId).child("sectionB").setValue(response);


        Intent intent = new Intent(SectionB.this, SectionC.class);
        SectionB.this.startActivity(intent);

    }


}

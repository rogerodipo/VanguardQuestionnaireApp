package com.vanguardswift.vanguardapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Random;

public class SectionC extends AppCompatActivity {

    RadioGroup rg_training;
    RadioGroup rg_visited_farms;
    RadioGroup rg_entrepreneurship_training;
    RadioGroup rg_farmers_group_member;
    RadioGroup rg_attendance_freq;
    RadioGroup rg_need_credit;
    RadioGroup rg_use_brush;
    RadioGroup rg_sufficient_credit;
    RadioGroup rg_credit_source;
    RadioGroup rg_network_effect;
    RadioGroup rg_cultural_effect;
    RadioGroup rg_social_effect;
    RadioGroup rg_credit_effect;
    RadioGroup rg_partnership_effect;

    CheckBox cb_farmer_to_farmer_groups;
    CheckBox cb_government;
    CheckBox cb_pvt;
    CheckBox cb_ngo;
    CheckBox cb_other;

    String farmer_to_farmer_groups = "";
    String government = "";
    String pvt = "";
    String ngo = "";
    String other = "";


    String training = "";
    String visited_farms = "";
    String entrepreneurship_training = "";
    String farmers_group_member = "";
    String attendance_freq = "";
    String need_credit = "";
    String use_brush = "";
    String sufficient_credit = "";
    String credit_source = "";
    String network_effect = "";
    String cultural_effect = "";
    String social_effect = "";
    String credit_effect = "";
    String partnership_effect = "";

    DatabaseReference vanguardDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_c);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        vanguardDb = FirebaseDatabase.getInstance().getReference("");


        rg_training = findViewById(R.id.rg_training);
        rg_visited_farms = findViewById(R.id.rg_visited_farms);
        rg_entrepreneurship_training = findViewById(R.id.rg_entrepreneurship_training);
        rg_farmers_group_member = findViewById(R.id.rg_farmers_group_member);
        rg_attendance_freq = findViewById(R.id.rg_attendance_freq);
        rg_need_credit = findViewById(R.id.rg_need_credit);
        rg_use_brush = findViewById(R.id.rg_use_brush);
        rg_sufficient_credit = findViewById(R.id.rg_sufficient_credit);
        rg_credit_source = findViewById(R.id.rg_credit_source);
        rg_network_effect = findViewById(R.id.rg_network_effect);
        rg_cultural_effect = findViewById(R.id.rg_cultural_effect);
        rg_social_effect = findViewById(R.id.rg_social_effect);
        rg_credit_effect = findViewById(R.id.rg_credit_effect);
        rg_partnership_effect = findViewById(R.id.rg_partnership_effect);

        cb_farmer_to_farmer_groups = findViewById(R.id.cb_farmer_to_farmer_groups);
        cb_government = findViewById(R.id.cb_government);
        cb_pvt = findViewById(R.id.cb_pvt);
        cb_ngo = findViewById(R.id.cb_ngo);
        cb_other = findViewById(R.id.cb_other);

    }

    public void rg_training(View view) {
        int radioId = rg_training.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        training = genderButton.getText().toString();
    }

    public void rg_visited_farms(View view) {
        int radioId = rg_visited_farms.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        visited_farms = genderButton.getText().toString();
    }

    public void rg_entrepreneurship_training(View view) {
        int radioId = rg_entrepreneurship_training.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        entrepreneurship_training = genderButton.getText().toString();
    }

    public void rg_farmers_group_member(View view) {
        int radioId = rg_farmers_group_member.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        farmers_group_member = genderButton.getText().toString();
    }

    public void rg_attendance_freq(View view) {
        int radioId = rg_attendance_freq.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        attendance_freq = genderButton.getText().toString();
    }

    public void rg_need_credit(View view) {
        int radioId = rg_need_credit.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        need_credit = genderButton.getText().toString();
    }

    public void rg_use_brush(View view) {
        int radioId = rg_use_brush.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        use_brush = genderButton.getText().toString();
    }

    public void rg_sufficient_credit(View view) {
        int radioId = rg_sufficient_credit.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        sufficient_credit = genderButton.getText().toString();
    }

    public void rg_credit_source(View view) {
        int radioId = rg_credit_source.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        credit_source = genderButton.getText().toString();
    }

    public void rg_network_effect(View view) {
        int radioId = rg_network_effect.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        network_effect = genderButton.getText().toString();
    }

    public void rg_cultural_effect(View view) {
        int radioId = rg_cultural_effect.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        cultural_effect = genderButton.getText().toString();
    }

    public void rg_social_effect(View view) {
        int radioId = rg_social_effect.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        social_effect = genderButton.getText().toString();
    }

    public void rg_credit_effect(View view) {
        int radioId = rg_credit_effect.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        credit_effect = genderButton.getText().toString();
    }

    public void partnership_effect(View view) {
        int radioId = rg_partnership_effect.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        partnership_effect = genderButton.getText().toString();
    }


    public void onSubmit(View v) {

        farmer_to_farmer_groups = (cb_farmer_to_farmer_groups.isChecked())? "Yes" : "No";
        government = (cb_government.isChecked())? "Yes" : "No";
        pvt = (cb_pvt.isChecked())? "Yes" : "No";
        ngo = (cb_ngo.isChecked())? "Yes" : "No";
        other = (cb_other.isChecked())? "Yes" : "No";


        ResponseC response = new ResponseC(training,
                visited_farms,
                entrepreneurship_training,
                farmers_group_member,
                attendance_freq,
                farmer_to_farmer_groups,
                government,
                pvt,
                ngo,
                other,
                need_credit,
                use_brush,
                sufficient_credit,
                credit_source,
                network_effect,
                cultural_effect,
                social_effect,
                credit_effect,
                partnership_effect);

        SharedPreferences preferences = this.getSharedPreferences("com.vanguardswift.vanguardapp", Context.MODE_PRIVATE);
        String responseId = preferences.getString("responseId", String.valueOf((new Random()).nextInt(10000)));

        vanguardDb.child(responseId).child("sectionC").setValue(response);
        Intent intent = new Intent(SectionC.this, SectionD.class);
        SectionC.this.startActivity(intent);
    }


}

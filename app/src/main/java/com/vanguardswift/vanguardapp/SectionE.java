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
import android.widget.Toast;

import java.util.Random;

public class SectionE extends AppCompatActivity {

    RadioGroup rg_create_value;
    RadioGroup rg_apply_new;
    RadioGroup rg_expand;
    RadioGroup rg_invest;
    RadioGroup rg_decisions;
    RadioGroup rg_options;
    RadioGroup rg_goals;
    RadioGroup rg_hard_work;
    RadioGroup rg_schedule;
    RadioGroup rg_anticipate;
    RadioGroup rg_seek_out_info;
    RadioGroup rg_many_sources;

    EditText collectors_name_text;

    String create_value = "";
    String apply_new = "";
    String expand = "";
    String invest = "";
    String decisions = "";
    String options = "";
    String goals = "";
    String hard_work = "";
    String schedule = "";
    String anticipate = "";
    String seek_out_info = "";
    String many_sources = "";
    String collectors_name = "";


    DatabaseReference vanguardDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_e);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Section E: Entrepreneurial Behaviour");


        vanguardDb = FirebaseDatabase.getInstance().getReference("");

        rg_create_value = findViewById(R.id.rg_create_value);
        rg_apply_new = findViewById(R.id.rg_apply_new);
        rg_expand = findViewById(R.id.rg_expand);
        rg_invest = findViewById(R.id.rg_invest);
        rg_decisions = findViewById(R.id.rg_decisions);
        rg_options = findViewById(R.id.rg_options);
        rg_goals = findViewById(R.id.rg_goals);
        rg_hard_work = findViewById(R.id.rg_hard_work);
        rg_schedule = findViewById(R.id.rg_schedule);
        rg_anticipate = findViewById(R.id.rg_anticipate);
        rg_seek_out_info = findViewById(R.id.rg_seek_out_info);
        rg_many_sources = findViewById(R.id.rg_many_sources);

        collectors_name_text = findViewById(R.id.collectors_name_text);


    }

    public void rg_create_value(View v) {
        int radioId = rg_create_value.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        create_value = button.getText().toString();
    }

    public void rg_apply_new(View v) {
        int radioId = rg_apply_new.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        apply_new = button.getText().toString();
    }

    public void rg_expand(View v) {
        int radioId = rg_expand.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        expand = button.getText().toString();
    }

    public void rg_invest(View v) {
        int radioId = rg_invest.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        invest = button.getText().toString();
    }

    public void rg_decisions(View v) {
        int radioId = rg_decisions.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        decisions = button.getText().toString();
    }

    public void rg_options(View v) {
        int radioId = rg_options.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        options = button.getText().toString();
    }

    public void rg_goals(View v) {
        int radioId = rg_goals.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        goals = button.getText().toString();
    }

    public void rg_hard_work(View v) {
        int radioId = rg_hard_work.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        hard_work = button.getText().toString();
    }

    public void rg_schedule(View v) {
        int radioId = rg_schedule.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        schedule = button.getText().toString();
    }


    public void rg_anticipate(View v) {
        int radioId = rg_anticipate.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        anticipate = button.getText().toString();
    }

    public void rg_seek_out_info(View v) {
        int radioId = rg_seek_out_info.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        seek_out_info = button.getText().toString();
    }

    public void rg_many_sources(View v) {
        int radioId = rg_many_sources.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        many_sources = button.getText().toString();
    }


    public void onSubmit(View v) {

        collectors_name = collectors_name_text.getText().toString();

        if (collectors_name.isEmpty()) {
            Toast.makeText(SectionE.this, "Please enter your name", Toast.LENGTH_SHORT).show();
        } else {
            ResponseE response = new ResponseE(create_value,
                    apply_new,
                    expand,
                    invest,
                    decisions,
                    options,
                    goals,
                    hard_work,
                    schedule,
                    anticipate,
                    seek_out_info,
                    many_sources,
                    collectors_name);

            SharedPreferences preferences = this.getSharedPreferences("com.vanguardswift.vanguardapp", Context.MODE_PRIVATE);
            String responseId = preferences.getString("responseId", String.valueOf((new Random()).nextInt(10000)));

            vanguardDb.child(responseId).child("sectionE").setValue(response);


            Intent intent = new Intent(SectionE.this, Complete.class);
            SectionE.this.startActivity(intent);

        }
    }


}

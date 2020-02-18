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
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Random;

public class SectionD extends AppCompatActivity {

    RadioGroup rg_apiary;
    EditText traditional_number_of_hives_text;
    EditText kenya_top_number_of_hives_text;
    EditText langstroth_number_of_hives_text;
    EditText kal_number_of_hives_text;

    EditText traditional_yield_s1_text;
    EditText traditional_yield_s2_text;

    EditText langstroth_yield_s1_text;
    EditText langstroth_yield_s2_text;

    EditText kenya_top_yield_s1_text;
    EditText kenya_top_yield_s2_text;

    EditText kal_yield_s1_text;
    EditText kal_yield_s2_text;

    RadioGroup rg_use_tools;
    RadioGroup rg_protective_suit;
    RadioGroup rg_clean;
    RadioGroup rg_clear_bushes;
    RadioGroup rg_inspection;
    RadioGroup rg_ipm;
    RadioGroup rg_water_for_bees;
    RadioGroup rg_supp_sugar;
    RadioGroup rg_forage;

    String apiary = "";
    String traditional_number_of_hives = "";
    String kenya_top_number_of_hives = "";
    String langstroth_number_of_hives = "";
    String kal_number_of_hives = "";
    String traditional_yield_s1 = "";
    String traditional_yield_s2 = "";
    String langstroth_yield_s1 = "";
    String langstroth_yield_s2 = "";
    String kenya_top_yeild_s1 = "";
    String kenya_top_yeild_s2 = "";
    String kal_yield_s1 = "";
    String kal_yield_s2 = "";
    String use_tools = "";
    String protective_suit = "";
    String clean = "";
    String clear_bushes = "";
    String inspection = "";
    String ipm = "";
    String water_for_bees = "";
    String supp_sugar = "";
    String forage = "";


    DatabaseReference vanguardDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_d);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        vanguardDb = FirebaseDatabase.getInstance().getReference("");

        rg_apiary = findViewById(R.id.rg_apiary);
        traditional_number_of_hives_text = findViewById(R.id.traditional_number_of_hives);
        kenya_top_number_of_hives_text = findViewById(R.id.kenya_top_number_of_hives);
        langstroth_number_of_hives_text = findViewById(R.id.langstroth_number_of_hives);
        kal_number_of_hives_text = findViewById(R.id.kal_number_of_hives);

        traditional_yield_s1_text = findViewById(R.id.traditional_yield_s1);
        traditional_yield_s2_text = findViewById(R.id.traditional_yield_s2);

        langstroth_yield_s1_text = findViewById(R.id.langstroth_yield_s1);
        langstroth_yield_s2_text = findViewById(R.id.langstroth_yield_s2);

        kenya_top_yield_s1_text = findViewById(R.id.kenya_top_yield_s1);
        kenya_top_yield_s2_text = findViewById(R.id.kenya_top_yield_s2);

        kal_yield_s1_text = findViewById(R.id.kal_yield_s1);
        kal_yield_s2_text = findViewById(R.id.kal_yield_s2);

        rg_use_tools = findViewById(R.id.rg_use_tools);
        rg_protective_suit = findViewById(R.id.rg_protective_suit);
        rg_clean = findViewById(R.id.rg_clean);
        rg_clear_bushes = findViewById(R.id.rg_clear_bushes);
        rg_inspection = findViewById(R.id.rg_inspection);
        rg_ipm = findViewById(R.id.rg_ipm);
        rg_water_for_bees = findViewById(R.id.rg_water_for_bees);
        rg_supp_sugar = findViewById(R.id.rg_supp_sugar);
        rg_forage = findViewById(R.id.rg_forage);


    }

    public void rg_apiary(View view) {
        int radioId = rg_apiary.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        apiary = button.getText().toString();
    }

    public void rg_use_tools(View view) {
        int radioId = rg_use_tools.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        use_tools = button.getText().toString();
    }

    public void rg_protective_suit(View view) {
        int radioId = rg_protective_suit.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        protective_suit = button.getText().toString();
    }

    public void rg_clean(View view) {
        int radioId = rg_clean.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        clean = button.getText().toString();
    }

    public void rg_clear_bushes(View view) {
        int radioId = rg_clear_bushes.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        clear_bushes = button.getText().toString();
    }

    public void rg_inspection(View view) {
        int radioId = rg_inspection.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        inspection = button.getText().toString();
    }

    public void rg_ipm(View view) {
        int radioId = rg_ipm.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        ipm = button.getText().toString();
    }

    public void rg_water_for_bees(View view) {
        int radioId = rg_water_for_bees.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        water_for_bees = button.getText().toString();
    }

    public void rg_supp_sugar(View view) {
        int radioId = rg_supp_sugar.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        supp_sugar = button.getText().toString();
    }


    public void rg_forage(View view) {
        int radioId = rg_forage.getCheckedRadioButtonId();
        RadioButton button = findViewById(radioId);
        forage = button.getText().toString();
    }

    public void onSubmit(View v) {

        traditional_number_of_hives = traditional_number_of_hives_text.getText().toString();
        kenya_top_number_of_hives = kenya_top_number_of_hives_text.getText().toString();
        langstroth_number_of_hives = langstroth_number_of_hives_text.getText().toString();
        kal_number_of_hives = kal_number_of_hives_text.getText().toString();
        traditional_yield_s1 = traditional_yield_s1_text.getText().toString();
        traditional_yield_s2 = traditional_yield_s2_text.getText().toString();
        kenya_top_yeild_s1 = kenya_top_yield_s1_text.getText().toString();
        kenya_top_yeild_s2 = kenya_top_yield_s2_text.getText().toString();
        langstroth_yield_s1 = langstroth_yield_s1_text.getText().toString();
        langstroth_yield_s2 = langstroth_yield_s2_text.getText().toString();
        kal_yield_s1 = kal_yield_s1_text.getText().toString();
        kal_yield_s2 = kal_yield_s2_text.getText().toString();

        ResponseD response = new ResponseD(apiary,
                traditional_number_of_hives,
                kenya_top_number_of_hives,
                langstroth_number_of_hives,
                kal_number_of_hives,
                traditional_yield_s1,
                traditional_yield_s2,
                langstroth_yield_s1,
                langstroth_yield_s2,
                kenya_top_yeild_s1,
                kenya_top_yeild_s2,
                kal_yield_s1,
                kal_yield_s2,
                use_tools,
                protective_suit,
                clean,
                clear_bushes,
                inspection,
                ipm,
                water_for_bees,
                supp_sugar,
                forage);

        SharedPreferences preferences = this.getSharedPreferences("com.vanguardswift.vanguardapp", Context.MODE_PRIVATE);
        String responseId = preferences.getString("responseId", String.valueOf((new Random()).nextInt(10000)));

        vanguardDb.child(responseId).child("sectionD").setValue(response);

        Intent intent = new Intent(SectionD.this, SectionE.class);
        SectionD.this.startActivity(intent);
    }


}

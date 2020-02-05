package com.vanguardswift.vanguardapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SectionA extends AppCompatActivity {

    String responseId;

    String age = "" ;
    EditText ageEditText;
    String gender = "";
    RadioGroup genderGroup;
    String schoolYears= "" ;
    EditText schoolYearsEditText;
    String familySizeMen = "";
    EditText familySizeMenEditText;
    String familySizeWomen = "";
    EditText familySizeWomenEditText;
    String familySizeChildren = "";
    EditText familySizeChildrenEditText;
    String farmSize = "";
    EditText farmSizeEditText;
    String beeKeepingIncomeS1 = "";
    EditText beeKeepingIncomeS1EditText;
    String beeKeepingIncomeS2 = "";
    EditText beeKeepingIncomeS2EditText;
    String otherActivitiesIncomeS1= "" ;
    EditText otherActivitiesS1EditText;
    String otherActivitiesIncomeS2 = "";
    EditText otherActivitiesS2EditText;
    String offFarmActivitiesIncome = "";
    EditText offFarmActivitiesEditText;
    String yearsFarming = "";
    EditText yearsFarmingEditText;

    DatabaseReference vanguardDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_a);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        vanguardDb = FirebaseDatabase.getInstance().getReference("");


        ageEditText = findViewById(R.id.age);
        genderGroup =  findViewById(R.id.rg_gender);
        schoolYearsEditText =  findViewById(R.id.school_years);
        familySizeMenEditText =  findViewById(R.id.men);
        familySizeWomenEditText =  findViewById(R.id.women);
        familySizeChildrenEditText =  findViewById(R.id.children);
        farmSizeEditText = findViewById(R.id.farm_size);
        beeKeepingIncomeS1EditText = findViewById(R.id.bee_keeping_s1);
        beeKeepingIncomeS2EditText = findViewById(R.id.bee_keeping_s2);
        otherActivitiesS1EditText = findViewById(R.id.other_farming_activities_s1);
        otherActivitiesS2EditText = findViewById(R.id.other_farming_activities_s2);
        offFarmActivitiesEditText = findViewById(R.id.off_farm_activities);
        yearsFarmingEditText = findViewById(R.id.years_farming);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void selectGender(View view) {
        int radioId = genderGroup.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        gender = genderButton.getText().toString();
    }

    public int onSubmit(View v) {
        age = ageEditText.getText().toString();
        schoolYears = schoolYearsEditText.getText().toString();
        familySizeMen = familySizeMenEditText.getText().toString();
        familySizeWomen = familySizeWomenEditText.getText().toString();
        familySizeChildren = familySizeChildrenEditText.getText().toString();
        farmSize = farmSizeEditText.getText().toString();
        beeKeepingIncomeS1 = beeKeepingIncomeS1EditText.getText().toString();
        beeKeepingIncomeS2 = beeKeepingIncomeS2EditText.getText().toString();
        otherActivitiesIncomeS1 = otherActivitiesS1EditText.getText().toString();
        otherActivitiesIncomeS2 = otherActivitiesS2EditText.getText().toString();
        offFarmActivitiesIncome = offFarmActivitiesEditText.getText().toString();
        yearsFarming = yearsFarmingEditText.getText().toString();

        responseId = vanguardDb.push().getKey();
        SharedPreferences preferences = this.getSharedPreferences("com.vanguardswift.vanguardapp", Context.MODE_PRIVATE);
        preferences.edit().putString("responseId",responseId).apply();

        ResponseA response = new ResponseA(age, gender, schoolYears, familySizeMen, familySizeWomen, familySizeChildren, farmSize, beeKeepingIncomeS1, beeKeepingIncomeS2, otherActivitiesIncomeS1, otherActivitiesIncomeS2, offFarmActivitiesIncome, yearsFarming);
        vanguardDb.child(responseId).child("sectionA").setValue(response);

        Intent intent = new Intent(SectionA.this, SectionB.class);
        SectionA.this.startActivity(intent);


        return 0;
    }
    @Override
    public void onBackPressed(){
        finishAffinity();
        finish();
    }

}

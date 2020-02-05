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

    RadioGroup apiaryGroup;
    String apiary= "";
    EditText traditionalNumberOfHivesEditText;
    EditText traditionalHoneyYieldS1EditText;
    EditText traditionalHoneyYieldS2EditText;
    EditText traditionalHarvestsPerYearEditText;

    String traditionalNumberOfHives= "";
    String traditionalHoneyYieldS1= "";
    String traditionalHoneyYieldS2= "";
    String traditionalHarvestsPerYear= "";

    EditText langNumberOfHivesEditText;
    EditText langHoneyYieldS1EditText;
    EditText langHoneyYieldS2EditText;
    EditText langHarvestsPerYearEditText;

    String langNumberOfHives= "";
    String langHoneyYieldS1= "";
    String langHoneyYieldS2= "";
    String langHarvestsPerYear= "";

    EditText kenyaTopNumberOfHivesEditText;
    EditText kenyaTopHoneyYieldS1EditText;
    EditText kenyaTopHoneyYieldS2EditText;
    EditText kenyaTopHarvestsPerYearEditText;

    String kenyaTopNumberOfHives= "";
    String kenyaTopHoneyYieldS1= "";
    String kenyaTopHoneyYieldS2= "";
    String kenyaTopHarvestsPerYear= "";

    EditText kalNumberOfHivesEditText;
    EditText kalHoneyYieldS1EditText;
    EditText kalHoneyYieldS2EditText;
    EditText kalHarvestsPerYearEditText;

    String kalNumberOfHives= "";
    String kalHoneyYieldS1= "";
    String kalHoneyYieldS2= "";
    String kalHarvestsPerYear= "";

    RadioGroup useBeeSmokerGroup;
    RadioGroup getBeeSmokerGroup;

    String useBeeSmoker= "";
    String getBeeSmoker= "";

    RadioGroup useBrushGroup;
    RadioGroup getBrushGroup;

    String useBrush= "";
    String getBrush= "";

    RadioGroup useKnifeGroup;
    RadioGroup getKnifeGroup;

    String useKnife= "";
    String getKnife= "";

    RadioGroup useSuitGroup;
    RadioGroup getSuitGroup;

    String useSuit= "";
    String getSuit= "";

    RadioGroup useBootsGroup;
    RadioGroup getBootsGroup;

    String useBoots= "";
    String getBoots= "";

    RadioGroup useContainersGroup;
    RadioGroup getContainersGroup;

    String useContainers= "";
    String getContainers= "";

    RadioGroup useExtractorGroup;
    RadioGroup getExtractorGroup;

    String useExtractor= "";
    String getExtractor= "";

    EditText otherEquipmentEditText;
    String otherEquipment= "";

    DatabaseReference vanguardDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_b);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        vanguardDb = FirebaseDatabase.getInstance().getReference("");


        apiaryGroup = findViewById(R.id.rg_apiary);
        traditionalNumberOfHivesEditText = findViewById(R.id.traditional_number_of_hives);
        traditionalHoneyYieldS1EditText = findViewById(R.id.traditional_yield_s1);
        traditionalHoneyYieldS2EditText = findViewById(R.id.traditional_yield_s2);
        traditionalHarvestsPerYearEditText = findViewById(R.id.traditional_harvests_per_year);

        langNumberOfHivesEditText = findViewById(R.id.langstroth_number_of_hives);
        langHoneyYieldS1EditText = findViewById(R.id.langstroth_yield_s1);
        langHoneyYieldS2EditText = findViewById(R.id.langstroth_yield_s2);
        langHarvestsPerYearEditText = findViewById(R.id.langstroth_harvests_per_year);

        kenyaTopNumberOfHivesEditText = findViewById(R.id.kenya_top_number_of_hives);
        kenyaTopHoneyYieldS1EditText = findViewById(R.id.kenya_top_yield_s1);
        kenyaTopHoneyYieldS2EditText = findViewById(R.id.kenya_top_yield_s2);
        kenyaTopHarvestsPerYearEditText = findViewById(R.id.kenya_top_harvests_per_year);

        kalNumberOfHivesEditText = findViewById(R.id.kal_number_of_hives);
        kalHoneyYieldS1EditText = findViewById(R.id.kal_yield_s1);
        kalHoneyYieldS2EditText = findViewById(R.id.kal_yield_s2);
        kalHarvestsPerYearEditText = findViewById(R.id.kal_harvests_per_year);

        useBeeSmokerGroup = findViewById(R.id.rg_use_bee_smoker);
        useBootsGroup = findViewById(R.id.rg_use_boots);
        useBrushGroup = findViewById(R.id.rg_use_brush);
        useContainersGroup = findViewById(R.id.rg_use_containers);
        useExtractorGroup = findViewById(R.id.rg_use_extractor);
        useKnifeGroup = findViewById(R.id.rg_use_knife);
        useSuitGroup = findViewById(R.id.rg_use_suit);

        getBeeSmokerGroup = findViewById(R.id.rg_get_bee_smoker);
        getBootsGroup = findViewById(R.id.rg_get_boots);
        getBrushGroup = findViewById(R.id.rg_get_brush);
        getContainersGroup = findViewById(R.id.rg_get_containers);
        getExtractorGroup = findViewById(R.id.rg_get_extractor);
        getKnifeGroup = findViewById(R.id.rg_get_knife);
        getSuitGroup = findViewById(R.id.rg_get_suit);

        otherEquipmentEditText = findViewById(R.id.other_equipment_text);


    }

    public void rg_apiary(View view) {
        int radioId = apiaryGroup.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        apiary = genderButton.getText().toString();


    }

    public void rg_use_bee_smoker(View view) {
        int radioId = useBeeSmokerGroup.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        useBeeSmoker = genderButton.getText().toString();

    }

    public void rg_get_bee_smoker(View view) {
        int radioId = getBeeSmokerGroup.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        getBeeSmoker = genderButton.getText().toString();

    }

    public void rg_use_brush(View view) {
        int radioId = useBrushGroup.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        useBrush = genderButton.getText().toString();

    }

    public void rg_get_brush(View view) {

        int radioId = getBrushGroup.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        getBrush = genderButton.getText().toString();

    }

    public void rg_use_knife(View view) {

        int radioId = useKnifeGroup.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        useKnife = genderButton.getText().toString();

    }

    public void rg_get_knife(View view) {
        int radioId = getKnifeGroup.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        getKnife = genderButton.getText().toString();

    }

    public void rg_use_suit(View view) {
        int radioId = useSuitGroup.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        useSuit = genderButton.getText().toString();

    }

    public void rg_get_suit(View view) {
        int radioId = getSuitGroup.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        getSuit = genderButton.getText().toString();

    }

    public void rg_use_boots(View view) {
        int radioId = useBootsGroup.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        useBoots = genderButton.getText().toString();

    }

    public void rg_get_boots(View view) {
        int radioId = getBootsGroup.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        getBoots = genderButton.getText().toString();
    }

    public void rg_use_containers(View view) {

        int radioId = useContainersGroup.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        useContainers = genderButton.getText().toString();
    }

    public void rg_get_containers(View view) {

        int radioId = getContainersGroup.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        getContainers = genderButton.getText().toString();

    }

    public void rg_use_extractor(View view) {
        int radioId = useExtractorGroup.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        useExtractor = genderButton.getText().toString();
    }

    public void rg_get_extractor(View view) {
        int radioId = getExtractorGroup.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        getExtractor = genderButton.getText().toString();

    }

    public void onSubmit(View v) {
        traditionalNumberOfHives = traditionalNumberOfHivesEditText.getText().toString();
        traditionalHoneyYieldS1 = traditionalHoneyYieldS1EditText.getText().toString();
        traditionalHoneyYieldS2 = traditionalHoneyYieldS2EditText.getText().toString();
        traditionalHarvestsPerYear = traditionalHarvestsPerYearEditText.getText().toString();
        langNumberOfHives = langNumberOfHivesEditText.getText().toString();
        langHoneyYieldS1 = langHoneyYieldS1EditText.getText().toString();
        langHoneyYieldS2 = langHoneyYieldS2EditText.getText().toString();
        langHarvestsPerYear = langHarvestsPerYearEditText.getText().toString();

        kenyaTopNumberOfHives = kenyaTopNumberOfHivesEditText.getText().toString();
        kenyaTopHoneyYieldS1 = kenyaTopHoneyYieldS1EditText.getText().toString();
        kenyaTopHoneyYieldS2 = kenyaTopHoneyYieldS2EditText.getText().toString();
        kenyaTopHarvestsPerYear = kenyaTopHarvestsPerYearEditText.getText().toString();

        kalNumberOfHives = kalNumberOfHivesEditText.getText().toString();
        kalHoneyYieldS1 = kalHoneyYieldS1EditText.getText().toString();
        kalHoneyYieldS2 = kalHoneyYieldS2EditText.getText().toString();
        kalHarvestsPerYear = kalHarvestsPerYearEditText.getText().toString();
        otherEquipment = otherEquipmentEditText.getText().toString();

        SharedPreferences preferences = this.getSharedPreferences("com.vanguardswift.vanguardapp", Context.MODE_PRIVATE);
        String responseId = preferences.getString("responseId", String.valueOf((new Random()).nextInt(10000)));

        ResponseB response = new ResponseB(apiary,
                traditionalNumberOfHives,
                traditionalHoneyYieldS1,
                traditionalHoneyYieldS2,
                traditionalHarvestsPerYear,
                langNumberOfHives,
                langHoneyYieldS1,
                langHoneyYieldS2,
                langHarvestsPerYear,
                kenyaTopNumberOfHives,
                kenyaTopHoneyYieldS1,
                kenyaTopHoneyYieldS2,
                kenyaTopHarvestsPerYear,
                kalNumberOfHives,
                kalHoneyYieldS1,
                kalHoneyYieldS2,
                kalHarvestsPerYear,
                useBeeSmoker,
                getBeeSmoker,
                useBrush,
                getBrush,
                useKnife,
                getKnife,
                useSuit,
                getSuit,
                useBoots,
                getBoots,
                useContainers,
                getContainers,
                useExtractor,
                getExtractor,
                otherEquipment);

        vanguardDb.child(responseId).child("sectionB").setValue(response);


        Intent intent = new Intent(SectionB.this, SectionB2.class);
        SectionB.this.startActivity(intent);


    }


}

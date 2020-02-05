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

    RadioGroup rg_motivation;
    RadioGroup rg_knowledge_src;
    RadioGroup rg_honey_sales;
    RadioGroup rg_other_products;
    RadioGroup rg_planning_b4_season;
    RadioGroup rg_write_planning;
    RadioGroup rg_maintain_records;
    RadioGroup rg_desire_more_income;
    RadioGroup rg_beekeeping_is_profitable;
    RadioGroup rg_desire_to_reach_new_markets;
    RadioGroup rg_planning_is_important;
    RadioGroup rg_knowledge_is_adequate;
    RadioGroup rg_would_like_deeper_understanding;

    EditText motivation_to_start_text;
    EditText other_knowledge_src_text;
    CheckBox cb_beeswax;
    CheckBox cb_propolis;
    EditText other_bee_products_text;

    CheckBox cb_sell_within_village;
    CheckBox cb_sell_to_broker;
    CheckBox cb_direct_to_consumer;
    CheckBox cb_honey_processor;
    CheckBox cb_cooperative;

    EditText other_places_to_sell_text;

    CheckBox cb_newspapers;
    CheckBox cb_television;
    CheckBox cb_radio;
    CheckBox cb_internet;
    CheckBox cb_social_media;
    CheckBox cb_fellow_farmers;
    CheckBox cb_farmer_groups;
    CheckBox cb_extension_workers;
    CheckBox cb_private_sector;
    CheckBox cb_ngo_institutions;

    EditText other_sources_of_info_text;

    String motivation= "";
    String knowledge_src= "";
    String honey_sales= "";
    String other_products= "";
    String planning_b4_season= "";
    String write_planning= "";
    String maintain_records= "";
    String desire_more_income= "";
    String beekeeping_is_profitable= "";
    String desire_to_reach_new_markets= "";
    String planning_is_important= "";
    String knowledge_is_adequate= "";
    String would_like_deeper_understanding= "";

    String  motivation_to_start= "";
    String  other_knowledge_src= "";
    String beeswax= "";
    String propolis= "";
    String  other_bee_products= "";

    String sell_within_village= "";
    String sell_to_broker= "";
    String direct_to_consumer= "";
    String honey_processor= "";
    String cooperative= "";

    String  other_places_to_sell= "";

    String newspapers= "";
    String television= "";
    String radio= "";
    String internet= "";
    String social_media= "";
    String fellow_farmers= "";
    String farmer_groups= "";
    String extension_workers= "";
    String private_sector= "";
    String ngo_institutions= "";

    String  other_sources_of_info= "";

    DatabaseReference vanguardDb;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_d);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        vanguardDb = FirebaseDatabase.getInstance().getReference("");


         rg_motivation= findViewById(R.id.rg_motivation);
         rg_knowledge_src= findViewById(R.id.rg_knowledge_src);
         rg_honey_sales= findViewById(R.id.rg_honey_sales);
         rg_other_products= findViewById(R.id.rg_other_products);
         rg_planning_b4_season= findViewById(R.id.rg_planning_b4_season);
         rg_write_planning= findViewById(R.id.rg_write_planning);
         rg_maintain_records= findViewById(R.id.rg_maintain_records);
         rg_desire_more_income= findViewById(R.id.rg_desire_more_income);
         rg_beekeeping_is_profitable= findViewById(R.id.rg_beekeeping_is_profitable);
         rg_desire_to_reach_new_markets= findViewById(R.id.rg_desire_to_reach_new_markets);
         rg_planning_is_important= findViewById(R.id.rg_planning_is_important);
         rg_knowledge_is_adequate= findViewById(R.id.rg_knowledge_is_adequate);
         rg_would_like_deeper_understanding= findViewById(R.id.rg_would_like_deeper_understanding);

        cb_beeswax= findViewById(R.id.cb_beeswax);
        cb_propolis= findViewById(R.id.cb_propolis);
        other_bee_products_text= findViewById(R.id.other_bee_products_text);

        cb_sell_within_village= findViewById(R.id.cb_sell_within_village);
        cb_sell_to_broker= findViewById(R.id.cb_sell_to_broker);
        cb_direct_to_consumer= findViewById(R.id.cb_direct_to_consumer);
        cb_honey_processor= findViewById(R.id.cb_honey_processor);
        cb_cooperative= findViewById(R.id.cb_cooperative);

        other_places_to_sell_text= findViewById(R.id.other_places_to_sell_text);
        motivation_to_start_text = findViewById(R.id.motivation_to_start_text);
        other_knowledge_src_text = findViewById(R.id.other_knowledge_src_text);

        cb_newspapers= findViewById(R.id.cb_newspapers);
        cb_television= findViewById(R.id.cb_television);
        cb_radio= findViewById(R.id.cb_radio);
        cb_internet= findViewById(R.id.cb_internet);
        cb_social_media= findViewById(R.id.cb_social_media);
        cb_fellow_farmers= findViewById(R.id.cb_fellow_farmers);
        cb_farmer_groups= findViewById(R.id.cb_farmer_groups);
        cb_extension_workers= findViewById(R.id.cb_extension_workers);
        cb_private_sector= findViewById(R.id.cb_private_sector);
        cb_ngo_institutions= findViewById(R.id.cb_ngo_institutions);

        other_sources_of_info_text= findViewById(R.id.other_sources_of_info_text);



    }

    public void rg_motivation(View view) {
        int radioId = rg_motivation.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        motivation = genderButton.getText().toString();
    }

    public void rg_knowledge_src(View view) {
        int radioId = rg_knowledge_src.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        knowledge_src = genderButton.getText().toString();
    }

    public void rg_honey_sales(View view) {
        int radioId = rg_honey_sales.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        honey_sales = genderButton.getText().toString();
    }

    public void rg_other_products(View view) {
        int radioId = rg_other_products.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        other_products = genderButton.getText().toString();
    }

    public void rg_planning_b4_season(View view) {
        int radioId = rg_planning_b4_season.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        planning_b4_season = genderButton.getText().toString();
    }

    public void rg_write_planning(View view) {
        int radioId = rg_write_planning.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        write_planning = genderButton.getText().toString();
    }

    public void rg_maintain_records(View view) {

        int radioId = rg_maintain_records.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        maintain_records = genderButton.getText().toString();
    }

    public void rg_desire_more_income(View view) {
        int radioId = rg_desire_more_income.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        desire_more_income = genderButton.getText().toString();
    }

    public void rg_beekeeping_is_profitable(View view) {
        int radioId = rg_beekeeping_is_profitable.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        beekeeping_is_profitable = genderButton.getText().toString();
    }

    public void rg_desire_to_reach_new_markets(View view) {
        int radioId = rg_desire_to_reach_new_markets.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        desire_to_reach_new_markets = genderButton.getText().toString();
    }

    public void rg_planning_is_important(View view) {

        int radioId = rg_planning_is_important.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        planning_is_important = genderButton.getText().toString();
    }

    public void rg_knowledge_is_adequate(View view) {
        int radioId = rg_knowledge_is_adequate.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        knowledge_is_adequate = genderButton.getText().toString();
    }

    public void rg_would_like_deeper_understanding(View view) {
        int radioId = rg_would_like_deeper_understanding.getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(radioId);
        would_like_deeper_understanding = genderButton.getText().toString();
    }


    public void onSubmit(View v){

        beeswax = String.valueOf(cb_beeswax.isChecked());
        propolis = String.valueOf(cb_propolis.isChecked());

        sell_within_village = String.valueOf(cb_sell_within_village.isChecked());
        sell_to_broker = String.valueOf(cb_sell_to_broker.isChecked());
        direct_to_consumer = String.valueOf(cb_direct_to_consumer.isChecked());
        honey_processor = String.valueOf(cb_honey_processor.isChecked());
        cooperative = String.valueOf(cb_cooperative.isChecked());

        newspapers = String.valueOf(cb_newspapers.isChecked());
        television = String.valueOf(cb_television.isChecked());
        radio = String.valueOf(cb_radio.isChecked());
        internet = String.valueOf(cb_internet.isChecked());
        social_media = String.valueOf(cb_social_media.isChecked());
        fellow_farmers = String.valueOf(cb_fellow_farmers.isChecked());
        farmer_groups = String.valueOf(cb_farmer_groups.isChecked());
        extension_workers = String.valueOf(cb_extension_workers.isChecked());
        private_sector = String.valueOf(cb_private_sector.isChecked());
        ngo_institutions = String.valueOf(cb_ngo_institutions .isChecked());


        motivation_to_start = motivation_to_start_text.getText().toString();
        other_knowledge_src = other_knowledge_src_text.getText().toString();
        other_bee_products = other_bee_products_text.getText().toString();
        other_places_to_sell = other_places_to_sell_text.getText().toString();
        other_sources_of_info = other_sources_of_info_text.getText().toString();
        
        ResponseD response = new ResponseD( motivation,
                knowledge_src,
                honey_sales,
                other_products,
                beeswax,
                propolis,
                other_bee_products,
                sell_within_village,
                sell_to_broker,
                direct_to_consumer,
                honey_processor,
                cooperative,
                other_places_to_sell,
                planning_b4_season,
                write_planning,
                maintain_records,
                newspapers,
                television,
                radio,
                internet,
                social_media,
                fellow_farmers,
                farmer_groups,
                extension_workers,
                private_sector,
                ngo_institutions,
                other_sources_of_info,
                desire_more_income,
                beekeeping_is_profitable,
                desire_to_reach_new_markets,
                planning_is_important,
                knowledge_is_adequate,
                would_like_deeper_understanding);

        SharedPreferences preferences = this.getSharedPreferences("com.vanguardswift.vanguardapp", Context.MODE_PRIVATE);
        String responseId = preferences.getString("responseId", String.valueOf((new Random()).nextInt(10000)));

        vanguardDb.child(responseId).child("sectionD").setValue(response);

        Intent intent = new Intent(SectionD.this, SectionE.class);
        SectionD.this.startActivity(intent);
    }



}

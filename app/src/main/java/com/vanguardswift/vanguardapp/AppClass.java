package com.vanguardswift.vanguardapp;


import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

public class AppClass extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
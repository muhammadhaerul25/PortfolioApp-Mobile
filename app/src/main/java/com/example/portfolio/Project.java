package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Project extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);
    }

    public void ProjectToHome(View view) {
        Intent pjToH = new Intent(this, MainActivity.class);
        startActivity(pjToH);
    }

    public void ProjectToProfile(View view) {
        Intent pjToPf = new Intent(this, Profile.class);
        startActivity(pjToPf);
    }
}
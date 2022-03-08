package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void viewProfile(View view) {
        Intent profile = new Intent(this, Profile.class);
        startActivity(profile);
    }

    public void viewProject(View view) {
        Intent project = new Intent(this, Project.class);
        startActivity(project);
    }
}
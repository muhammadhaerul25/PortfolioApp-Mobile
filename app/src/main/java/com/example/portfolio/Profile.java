package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }


    public void profileToHome(View view) {
        Intent pToH = new Intent(this, MainActivity.class);
        startActivity(pToH);
    }

    public void profileToProject(View view) {
        Intent pToPj = new Intent(this, Project.class);
        startActivity(pToPj);
    }
}
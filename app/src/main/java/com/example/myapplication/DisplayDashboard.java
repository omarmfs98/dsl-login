package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_dashboard);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.USERNAME);

        TextView textView = findViewById(R.id.welcomeUser);
        textView.setText("Bienvenido " + message);
    }
}

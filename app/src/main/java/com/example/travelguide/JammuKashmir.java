package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JammuKashmir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jammu_kashmir);

        Button button = findViewById(R.id.hisjam);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(JammuKashmir.this, HistoricalJammu.class);
                startActivity(in);

            }
        });

        Button button1 = findViewById(R.id.parkjam);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(JammuKashmir.this, ParkJammu.class);
                startActivity(in);

            }
        });

        Button button2 = findViewById(R.id.museumjam);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(JammuKashmir.this, MuseumJammu.class);
                startActivity(in);

            }
        });

        Button button3 = findViewById(R.id.reljam);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(JammuKashmir.this, ReligiousJammu.class);
                startActivity(in);

            }
        });

        Button button4 = findViewById(R.id.hoteljam);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(JammuKashmir.this, HtelJammu.class);
                startActivity(in);

            }
        });
    }
}

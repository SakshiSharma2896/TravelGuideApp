package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TempRecommendation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_recommendation);



        CardView button1 = findViewById(R.id.hotid);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TempRecommendation.this, HotPlaces.class));
            }
        });
        CardView button2 = findViewById(R.id.coolid);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TempRecommendation.this, ColdPlaces.class));
            }
        });
        CardView button3 = findViewById(R.id.soloid);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TempRecommendation.this, SoloPlace.class));
            }
        });
        CardView button4 = findViewById(R.id.familyid);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TempRecommendation.this, FamilyTrip.class));
            }
        });
        CardView button5 = findViewById(R.id.plainaid);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TempRecommendation.this, PlainPlaces.class));
            }
        });
        CardView button6 = findViewById(R.id.hillyid);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TempRecommendation.this, HillyAreas.class));
            }
        });
        CardView button7 = findViewById(R.id.adventurousid);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TempRecommendation.this, AdventurePlace.class));
            }
        });
        CardView button8 = findViewById(R.id.educationalid);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TempRecommendation.this, EducationPlaces.class));
            }
        });
    }
}
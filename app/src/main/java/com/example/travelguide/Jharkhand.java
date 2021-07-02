package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Jharkhand extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jharkhand);

        Button button = findViewById(R.id.hisjhar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Jharkhand.this,HistoricalJharkhand.class);
                startActivity(in);

            }
        });

        Button button1 = findViewById(R.id.parkjhar);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Jharkhand.this,ParkJharkhand.class);
                startActivity(in);

            }
        });

        Button button2 = findViewById(R.id.museumjhar);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Jharkhand.this,MuseumJharkhand.class);
                startActivity(in);

            }
        });


        Button button3 = findViewById(R.id.reljhar);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Jharkhand.this,ReligiousJharkhand.class);
                startActivity(in);

            }
        });


        Button button4 = findViewById(R.id.hoteljhar);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Jharkhand.this,HotelJharkhand.class);
                startActivity(in);

            }
        });


    }
}

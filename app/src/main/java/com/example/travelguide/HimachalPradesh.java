package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HimachalPradesh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_himachal_pradesh);

        Button button = findViewById(R.id.hishim);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(HimachalPradesh.this,HistoricalHimachal.class);
                startActivity(in);

            }
        });

        Button button1 = findViewById(R.id.parkhim);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(HimachalPradesh.this,ParkHimachal.class);
                startActivity(in);

            }
        });

        Button button2 = findViewById(R.id.museumhim);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(HimachalPradesh.this,MuseumHimachal.class);
                startActivity(in);

            }
        });

        Button button3 = findViewById(R.id.relhim);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(HimachalPradesh.this,ReligiousHimachal.class);
                startActivity(in);

            }
        });

        Button button4 = findViewById(R.id.hotelhim);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(HimachalPradesh.this,HotelHimachal.class);
                startActivity(in);

            }
        });

    }
}

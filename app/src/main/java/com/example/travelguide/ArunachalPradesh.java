package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ArunachalPradesh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arunachal_pradesh);

        Button button = findViewById(R.id.historicalar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(ArunachalPradesh.this,HistoricalArunachal.class);
                startActivity(in);

            }
        });

        Button button1= findViewById(R.id.parkar);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(ArunachalPradesh.this,ParkArunachal.class);
                startActivity(in);

            }
        });



        Button button2 = findViewById(R.id.museumar);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(ArunachalPradesh.this,MuseumArunachal.class);
                startActivity(in);

            }
        });


        Button button3 = findViewById(R.id.religiousar);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(ArunachalPradesh.this,ReligiousArunachal.class);
                startActivity(in);

            }
        });

        Button button4 = findViewById(R.id.hotelar);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(ArunachalPradesh.this,HotelArunachal.class);
                startActivity(in);

            }
        });
    }
}

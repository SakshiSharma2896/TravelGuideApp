package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Assam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assam);

        Button button = findViewById(R.id.historicalassam);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Assam.this,HistoricalAssam.class);
                startActivity(in);

            }
        });

        Button button1= findViewById(R.id.parkassam);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Assam.this,ParkAssam.class);
                startActivity(in);

            }
        });



        Button button2 = findViewById(R.id.museumassam);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Assam.this,MuseumAssam.class);
                startActivity(in);

            }
        });


        Button button3 = findViewById(R.id.religiousassam);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Assam.this,ReligiousAssam.class);
                startActivity(in);

            }
        });

        Button button4 = findViewById(R.id.hotelassam);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Assam.this,HotelAssam.class);
                startActivity(in);

            }
        });




    }
}

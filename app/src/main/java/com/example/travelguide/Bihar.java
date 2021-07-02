package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bihar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bihar);

        Button button = findViewById(R.id.historicalbihar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Bihar.this,HistoricalBihar.class);
                startActivity(in);

            }
        });

        Button button1= findViewById(R.id.parkbihar);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Bihar.this,ParkBihar.class);
                startActivity(in);

            }
        });



        Button button2 = findViewById(R.id.museumbihar);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Bihar.this,MuseumBihar.class);
                startActivity(in);

            }
        });


        Button button3 = findViewById(R.id.religiousbihar);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Bihar.this,ReligiousBihar.class);
                startActivity(in);

            }
        });

        Button button4 = findViewById(R.id.hotelbihar);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Bihar.this, HotelBihar.class);
                startActivity(in);

            }
        });



    }
}

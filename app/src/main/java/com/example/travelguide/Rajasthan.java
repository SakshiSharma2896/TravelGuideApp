package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rajasthan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajasthan);

        Button button = findViewById(R.id.hisraj);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Rajasthan.this,HistoricalRajasthan.class);
                startActivity(in);

            }
        });

        Button button1 = findViewById(R.id.parkraj);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Rajasthan.this,ParkRajasthan.class);
                startActivity(in);

            }
        });

        Button button2 = findViewById(R.id.museumraj);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Rajasthan.this,MuseumRajasthan.class);
                startActivity(in);

            }
        });


        Button button3 = findViewById(R.id.relraj);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Rajasthan.this,ReligiousRajasthan.class);
                startActivity(in);

            }
        });


        Button button4 = findViewById(R.id.hotelraj);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Rajasthan.this,HotelRajasthan.class);
                startActivity(in);

            }
        });



    }
}

package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kerala extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerala);


        Button button = findViewById(R.id.hisker);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Kerala.this,HistoricalKarnataka.class);
                startActivity(in);

            }
        });


        Button button1 = findViewById(R.id.parkker);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Kerala.this,ParkKarnataka.class);
                startActivity(in);

            }
        });

        Button button2 = findViewById(R.id.museumker);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Kerala.this,MuseumKarnataka.class);
                startActivity(in);

            }
        });


        Button button3 = findViewById(R.id.relker);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Kerala.this,ReligiousKarnataka.class);
                startActivity(in);

            }
        });


        Button button4 = findViewById(R.id.hotelker);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Kerala.this,HotelKarnataka.class);
                startActivity(in);

            }
        });

    }
}

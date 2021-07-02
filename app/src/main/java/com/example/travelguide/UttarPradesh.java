package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UttarPradesh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uttar_pradesh);

        Button button = findViewById(R.id.hisup);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(UttarPradesh.this,HistoricalUttar.class);
                startActivity(in);

            }
        });

        Button button1= findViewById(R.id.parkup);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(UttarPradesh.this,ParkUttar.class);
                startActivity(in);

            }
        });



        Button button2 = findViewById(R.id.museumup);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(UttarPradesh.this,MuseumUttar.class);
                startActivity(in);

            }
        });


        Button button3 = findViewById(R.id.relup);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(UttarPradesh.this,ReligiousUttar.class);
                startActivity(in);

            }
        });

        Button button4 = findViewById(R.id.hotelup);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(UttarPradesh.this,HotelUttar.class);
                startActivity(in);

            }
        });
    }
}

package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mizoram extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mizoram);


        Button button = findViewById(R.id.hismizo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Mizoram.this,HistoricalKarnataka.class);
                startActivity(in);

            }
        });


        Button button1 = findViewById(R.id.parkmizo);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Mizoram.this,ParkKarnataka.class);
                startActivity(in);

            }
        });

        Button button2 = findViewById(R.id.museummizo);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Mizoram.this,MuseumKarnataka.class);
                startActivity(in);

            }
        });


        Button button3 = findViewById(R.id.relmizo);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Mizoram.this,ReligiousKarnataka.class);
                startActivity(in);

            }
        });


        Button button4 = findViewById(R.id.hotelmizo);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Mizoram.this,HotelKarnataka.class);
                startActivity(in);

            }
        });

    }
}

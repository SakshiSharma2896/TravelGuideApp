package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Karnataka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karnataka);

        Button button = findViewById(R.id.hiskar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Karnataka.this,HistoricalKarnataka.class);
                startActivity(in);

            }
        });


        Button button1 = findViewById(R.id.parkkar);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Karnataka.this,ParkKarnataka.class);
                startActivity(in);

            }
        });

        Button button2 = findViewById(R.id.museumkar);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Karnataka.this,MuseumKarnataka.class);
                startActivity(in);

            }
        });


        Button button3 = findViewById(R.id.relkar);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Karnataka.this,ReligiousKarnataka.class);
                startActivity(in);

            }
        });


        Button button4 = findViewById(R.id.hotelkar);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Karnataka.this,HotelKarnataka.class);
                startActivity(in);

            }
        });



    }
}

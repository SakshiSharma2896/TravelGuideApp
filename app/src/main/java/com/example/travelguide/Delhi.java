package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Delhi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delhi);

        Button button = findViewById(R.id.historicaldelhi);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Delhi.this,HistoricalDelhi.class);
                startActivity(in);

            }
        });

        Button button1= findViewById(R.id.parkdelhi);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Delhi.this,ParkDelhi.class);
                startActivity(in);

            }
        });



        Button button2 = findViewById(R.id.museumdelhi);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Delhi.this,MuseumDelhi.class);
                startActivity(in);

            }
        });


        Button button3 = findViewById(R.id.religiousdelhi);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Delhi.this,ReligiousDelhi.class);
                startActivity(in);

            }
        });

        Button button4 = findViewById(R.id.hoteldelhi);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Delhi.this, HotelDelhi.class);
                startActivity(in);

            }
        });


    }
}

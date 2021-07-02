package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WestBengal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_west_bengal);

        Button button = findViewById(R.id.hiswb);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(WestBengal.this,HistoricalWest.class);
                startActivity(in);

            }
        });

        Button button1= findViewById(R.id.parkwb);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(WestBengal.this,ParkWest.class);
                startActivity(in);

            }
        });



        Button button2 = findViewById(R.id.museumwb);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(WestBengal.this,MuseumWest.class);
                startActivity(in);

            }
        });


        Button button3 = findViewById(R.id.relwb);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(WestBengal.this,ReligiousWest.class);
                startActivity(in);

            }
        });

        Button button4 = findViewById(R.id.hotelwb);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(WestBengal.this,HotelWest.class);
                startActivity(in);

            }
        });
    }
}

package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Manipur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manipur);


        Button button = findViewById(R.id.hisman);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Manipur.this,HistoricalBihar.class);
                startActivity(in);

            }
        });


        Button button1 = findViewById(R.id.parkman);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Manipur.this,ParkBihar.class);
                startActivity(in);

            }
        });

        Button button2 = findViewById(R.id.museumman);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Manipur.this,MuseumBihar.class);
                startActivity(in);

            }
        });


        Button button3 = findViewById(R.id.relman);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Manipur.this,ReligiousBihar.class);
                startActivity(in);

            }
        });


        Button button4 = findViewById(R.id.hotelman);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Manipur.this,HotelBihar.class);
                startActivity(in);

            }
        });

    }
}

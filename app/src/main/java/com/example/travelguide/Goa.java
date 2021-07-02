package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Goa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goa);

        Button button = findViewById(R.id.historicalgoa);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Goa.this,HistoricalGoa.class);
                startActivity(in);

            }
        });

        Button button1= findViewById(R.id.parkgoa);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Goa.this,ParkGoa.class);
                startActivity(in);

            }
        });



        Button button2 = findViewById(R.id.museumgoa);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Goa.this,MuseumGoa.class);
                startActivity(in);

            }
        });


        Button button3 = findViewById(R.id.religiousgoa);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Goa.this,ReligiousGoa.class);
                startActivity(in);

            }
        });

        Button button4 = findViewById(R.id.hotelgoa);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Goa.this, HotelGoa.class);
                startActivity(in);

            }
        });

    }
}

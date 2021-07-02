package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AndhraPradesh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andhra_pradesh);
        Button button1 = findViewById(R.id.parkap);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(AndhraPradesh.this,ParkAndhra.class);
                startActivity(in);

            }
        });


        Button button = findViewById(R.id.historicalap);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(AndhraPradesh.this,HistoricalAndhra.class);
                startActivity(in);

            }
        });


        Button button2 = findViewById(R.id.museumap);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(AndhraPradesh.this,MuseumAndhra.class);
                startActivity(in);

            }
        });


        Button button3 = findViewById(R.id.religiousap);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(AndhraPradesh.this,ReligiousAndhra.class);
                startActivity(in);

            }
        });
        Button button4 = findViewById(R.id.hotelap);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(AndhraPradesh.this,HotelAndhra.class);
                startActivity(in);

            }
        });





    }

}

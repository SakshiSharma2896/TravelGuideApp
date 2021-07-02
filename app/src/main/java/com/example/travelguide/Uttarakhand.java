package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Uttarakhand extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uttarakhand);

        Button button = findViewById(R.id.hisuk);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Uttarakhand.this,HistoricalUttarakhand.class);
                startActivity(in);

            }
        });

        Button button1= findViewById(R.id.parkuk);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Uttarakhand.this,ParkUttarakhand.class);
                startActivity(in);

            }
        });



        Button button2 = findViewById(R.id.museumuk);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Uttarakhand.this,MuseumUttarakhand.class);
                startActivity(in);

            }
        });


        Button button3 = findViewById(R.id.reluk);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Uttarakhand.this,ReligiousUttarakhand.class);
                startActivity(in);

            }
        });

        Button button4 = findViewById(R.id.hoteluk);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Uttarakhand.this,HotelUttarakhand.class);
                startActivity(in);

            }
        });
    }
}

package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Gujarat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gujarat);

        Button button = findViewById(R.id.historicalgujarat);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Gujarat.this,HistoricalGujarat.class);
                startActivity(in);

            }
        });

        Button button1= findViewById(R.id.parkgujarat);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Gujarat.this,ParkGujarat.class);
                startActivity(in);

            }
        });



        Button button2 = findViewById(R.id.museumgoa);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Gujarat.this,MuseumGujarat.class);
                startActivity(in);

            }
        });


        Button button3 = findViewById(R.id.religiousgoa);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Gujarat.this,ReligiousGujarat.class);
                startActivity(in);

            }
        });

        Button button4 = findViewById(R.id.hotelgoa);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Gujarat.this, HotelGujarat.class);
                startActivity(in);

            }
        });

    }
}

package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Harayana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harayana);

        Button button = findViewById(R.id.hishar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Harayana.this,HistoricalHaryana.class);
                startActivity(in);

            }
        });

        Button button1 = findViewById(R.id.parkhar);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Harayana.this,ParkHaryana.class);
                startActivity(in);

            }
        });

        Button button2 = findViewById(R.id.museumhar);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Harayana.this,MuseumHaryana.class);
                startActivity(in);

            }
        });

        Button button3 = findViewById(R.id.relhar);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Harayana.this,ReligiousHaryana.class);
                startActivity(in);

            }
        });

        Button button4 = findViewById(R.id.hotelhar);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Harayana.this,HotelHaryana.class);
                startActivity(in);

            }
        });

    }
}

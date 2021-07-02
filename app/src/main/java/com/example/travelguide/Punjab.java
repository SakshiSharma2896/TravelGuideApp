package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Punjab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punjab);

        Button button = findViewById(R.id.hispun);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Punjab.this,HistoricalPunjab.class);
                startActivity(in);

            }
        });

        Button button1 = findViewById(R.id.parkpun);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Punjab.this,ParkPunjab.class);
                startActivity(in);

            }
        });

        Button button2 = findViewById(R.id.museumpun);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Punjab.this,MuseumPunjab.class);
                startActivity(in);

            }
        });


        Button button3 = findViewById(R.id.relpun);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Punjab.this,ReligiousPunjab.class);
                startActivity(in);

            }
        });


        Button button4 = findViewById(R.id.hotelpun);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Punjab.this,HotelPunjab.class);
                startActivity(in);

            }
        });



    }
}

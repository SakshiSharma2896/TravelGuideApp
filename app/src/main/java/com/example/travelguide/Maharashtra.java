package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Maharashtra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maharashtra);


        Button button = findViewById(R.id.hismah);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Maharashtra.this,HistoricalMaha.class);
                startActivity(in);

            }
        });


        Button button1 = findViewById(R.id.parkmah);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Maharashtra.this,ParkMaha.class);
                startActivity(in);

            }
        });

        Button button2 = findViewById(R.id.museummah);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Maharashtra.this,MuseumMaha.class);
                startActivity(in);

            }
        });


        Button button3 = findViewById(R.id.relmah);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Maharashtra.this,ReligiousMaha.class);
                startActivity(in);

            }
        });


        Button button4 = findViewById(R.id.hotelmah);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Maharashtra.this,HotelMaha.class);
                startActivity(in);

            }
        });



    }
}

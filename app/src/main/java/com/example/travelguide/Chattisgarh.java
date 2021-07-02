package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chattisgarh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chattisgarh);

        Button button = findViewById(R.id.historicalchhattisgarh);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Chattisgarh.this,HistoricalChhattisgarh.class);
                startActivity(in);

            }
        });

        Button button1= findViewById(R.id.parkchhattisgarh);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Chattisgarh.this,ParkChhattisgarh.class);
                startActivity(in);

            }
        });



        Button button2 = findViewById(R.id.museumchhattisgarh);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Chattisgarh.this,MuseumChhattisgarh.class);
                startActivity(in);

            }
        });


        Button button3 = findViewById(R.id.religiouschhattisgarh);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Chattisgarh.this,ReligiousChhattisgarh.class);
                startActivity(in);

            }
        });

        Button button4 = findViewById(R.id.hotelchhattisgarh);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Chattisgarh.this, HotelChhattisgarh.class);
                startActivity(in);

            }
        });


    }
}

package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Recommendation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommendation);
        Button button1= findViewById(R.id.submit);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(Recommendation.this,"SOON,WE WILL PROVIDE YOU THE BEST RECOMMENDATIONS... " ,Toast.LENGTH_SHORT).show();
                /*Intent in=new Intent(Feedback.this,StatesPage1.class);
                startActivity(in);*/

            }
        });
    }
}

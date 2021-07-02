package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class GoogleMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_map);
    }
    @SuppressLint("NewApi")
    public void open1(View view) {
        Uri ref = Uri.parse("geo:37,7749,-122,4195");
        Intent i = new Intent(Intent.ACTION_VIEW, ref);
        i.setPackage("com.google.android.apps.maps");
        startActivity(i);
    }
}

package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import hotchemi.android.rate.AppRate;

public class RateUs extends AppCompatActivity {

    Button button;
    RatingBar ratingBar;
    float myRating=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_us);
        AppRate.with(this).setInstallDays(1).setLaunchTimes(2).setRemindInterval(2).monitor();
        AppRate.showRateDialogIfMeetsConditions(this);
    } }

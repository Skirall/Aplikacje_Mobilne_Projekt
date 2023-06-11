package com.example.java_aplikacja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void reakcjaPokazSilownie(View v){
        Intent i = new Intent(this,PokazSilownieActivity.class);
        startActivity(i);
    }
    public void reakcjaRozplanowanieTreningow(View v) {
        Intent i = new Intent(this, PlanTreningowActivity.class);
        startActivity(i);
    }
    public void reakcjaWprowadzanieCwiczen(View v) {
        Intent i = new Intent(this, WprowadzCwiczeniaActivity.class);
        startActivity(i);
    }
    public void reakcjaSpaloneKalorie(View v) {
        Intent i = new Intent(this, SpaloneKalorieActivity.class);
        startActivity(i);
    }
}
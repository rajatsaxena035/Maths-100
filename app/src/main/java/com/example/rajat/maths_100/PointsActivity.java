package com.example.rajat.maths_100;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PointsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_points);
    }

    public void restartGame(View view)
    {
        Intent intent = new Intent(PointsActivity.this, GameActivity.class);
        startActivity(intent);
    }

    public void homeScreen(View view)
    {
        Intent intent = new Intent(PointsActivity.this, MainActivity.class);
        startActivity(intent);
    }
}

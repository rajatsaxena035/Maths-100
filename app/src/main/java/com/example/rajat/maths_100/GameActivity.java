package com.example.rajat.maths_100;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        final TextView cdtimer;
        cdtimer = (TextView)findViewById(R.id.textView4);


        new CountDownTimer(101000, 1000) {

            public void onTick(long millisUntilFinished) {
                cdtimer.setText("Seconds : " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                cdtimer.setText("done!");
            }
        }.start();

        final int min = 101;
        final int max = 999;

        final TextView ques, num;
        ques = (TextView)findViewById(R.id.textView2);
        num = (TextView)findViewById(R.id.textView6);
        newQuestion(ques,min,max,num);

        Button clickButton = (Button) findViewById(R.id.button5);

        clickButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                newQuestion(ques,min,max,num);
            }
        });
    }

    public void newQuestion(TextView ques, int min, int max, TextView num)
    {
        Random r = new Random();
        int a = r.nextInt((max - min) + 1) + min;
        int b = r.nextInt((max - min) + 1) + min;
        String prob = new String();
        prob = String.valueOf(a) + " + "+ String.valueOf(b);
        ques.setText(prob);
        int val =  Integer.parseInt(num.getText().toString());
        val++;
        num.setText(String.valueOf(val));
    }

    public void endGame(View view)
    {
        Intent intent = new Intent(GameActivity.this, PointsActivity.class);
        startActivity(intent);
    }
}
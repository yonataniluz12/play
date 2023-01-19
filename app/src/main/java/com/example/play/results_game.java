package com.example.play;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class results_game extends AppCompatActivity {
    Button btn4;
    TextView tV1,tV2,tV3;

    @SuppressLint({"SetTextI18n", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_game);

        tV1=findViewById(R.id.tV1);
        tV2=findViewById(R.id.tV2);
        tV3=findViewById(R.id.tV3);
        btn4=findViewById(R.id.btn4);
        Intent gi=getIntent();
        int count1= gi.getIntExtra("a", -999);
        int count2= gi.getIntExtra("aa", -999);
        tV2.setText("Player1: "+count1);
        tV3.setText("Player2: "+count2);
        if (count1>count2){
            tV1.setText("PLAYER RED!");
        }
        else if (count1<count2){
            tV1.setText("PLAYER BLUE!");
        }
        else{
            tV1.setText("TEKO");
        }
        btn4.setOnClickListener(view -> finish());
    }
}
package com.example.play;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class results_game extends AppCompatActivity {
    Button btn;
    TextView tV,tV2,tV3;
    Intent gi = getIntent();
    String st = gi.getStringExtra("a");
    int red  = gi.getIntExtra("aaa",-999);
    int blue = gi.getIntExtra("aa",-999);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_game);
        tV = findViewById(R.id.tV);
        tV2 = findViewById(R.id.tV2);
        tV3 = findViewById(R.id.tV3);
        tV2.setText(red);
        tV3.setText(blue);
        tV.setText(st);
    }

    public void goo(View view) {
        gi.putExtra("n",0);
        setResult(RESULT_OK,gi);
        finish();
    }
}
package com.example.play;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3;
    private int count1, count2;
    Intent si;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        count1 = 0;
        count2 = 0;
        si = new Intent(this, results_game.class);
        btn1.setBackgroundColor(Color.RED);
        btn2.setBackgroundColor(Color.BLUE);
        btn1.setOnClickListener(view -> count1++);

        btn3.setOnClickListener(view -> {
            si.putExtra("a", count1);
            si.putExtra("aa", count2);
            count1 = 0;
            count2 = 0;
            startActivity(si);
        });

        btn2.setOnLongClickListener(view -> {
            count2 += 2;
            return false;
        });
    }
}
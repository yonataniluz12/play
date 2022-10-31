package com.example.play;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener {
    Button btn1, btn2, btn3;
    int countRed ;
    int countBlue ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        countRed = 0;
        countBlue = 0;
        btn2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                countBlue++;
            }
        });
        btn1.setOnLongClickListener(this);
    }


    @Override
    public boolean onLongClick(View view) {
        countRed += 2;
        return false;
    }


    public void go(View view) {
        Intent si = new Intent(this,results_game.class);
        if(countBlue>countRed){
            si.putExtra("a","blue");}
        else{
            si.putExtra("a","red");
        }
        si.putExtra("aa",countBlue);
        si.putExtra("aaa",countRed);
        startActivityForResult(si,1);
    }
    protected void onActivityResult(int source, int good, @Nullable Intent data_back) {
        super.onActivityResult(source, good, data_back);
        if(data_back != null){
            countRed = data_back.getIntExtra("n",-999);
            countRed = data_back.getIntExtra("n",-999);
        }
    }
}
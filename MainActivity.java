package com.example.interviewreadystudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupButton();
    }
    private void setupButton(){
        Button buttonA = findViewById(R.id.button1);
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDsa();
            }
        });
        Button buttonB = findViewById(R.id.button2);
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLogical();
            }
        });
        Button buttonC = findViewById(R.id.button2);
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuant();
            }
        });
    }
    public void openDsa(){
        Intent intent1 = new Intent(this, DSA.class);
        startActivity(intent1);
    }
    public void openLogical(){
        Intent intent2 = new Intent(this, Logical.class);
        startActivity(intent2);
    }
    public void openQuant(){
        Intent intent3 = new Intent(this, Quantitative.class);
        startActivity(intent3);
    }
}
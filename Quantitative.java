package com.example.interviewreadystudy;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Quantitative extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dsa_activity);
        setupHyperlink3();
    }
    private void setupHyperlink3(){
        TextView linkTextView11 = findViewById(R.id.link11);
        linkTextView11.setMovementMethod(LinkMovementMethod.getInstance());

        TextView linkTextView12 = findViewById(R.id.link12);
        linkTextView12.setMovementMethod(LinkMovementMethod.getInstance());

        TextView linkTextView13 = findViewById(R.id.link13);
        linkTextView13.setMovementMethod(LinkMovementMethod.getInstance());

        TextView linkTextView14 = findViewById(R.id.link14);
        linkTextView14.setMovementMethod(LinkMovementMethod.getInstance());

        TextView linkTextView15 = findViewById(R.id.link15);
        linkTextView15.setMovementMethod(LinkMovementMethod.getInstance());
    }
}

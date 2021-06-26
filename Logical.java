package com.example.interviewreadystudy;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Logical extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dsa_activity);
        setupHyperlink2();
    }
    private void setupHyperlink2(){
        TextView linkTextView6 = findViewById(R.id.link6);
        linkTextView6.setMovementMethod(LinkMovementMethod.getInstance());

        TextView linkTextView7 = findViewById(R.id.link7);
        linkTextView7.setMovementMethod(LinkMovementMethod.getInstance());

        TextView linkTextView8 = findViewById(R.id.link8);
        linkTextView8.setMovementMethod(LinkMovementMethod.getInstance());

        TextView linkTextView9 = findViewById(R.id.link9);
        linkTextView9.setMovementMethod(LinkMovementMethod.getInstance());

        TextView linkTextView10 = findViewById(R.id.link10);
        linkTextView10.setMovementMethod(LinkMovementMethod.getInstance());
    }
}

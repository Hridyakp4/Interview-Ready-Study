package com.example.interviewreadystudy;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class DSA extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dsa_activity);
        setupHyperlink1();
    }
    private void setupHyperlink1(){
        TextView linkTextView1 = findViewById(R.id.link1);
        linkTextView1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView linkTextView2 = findViewById(R.id.link2);
        linkTextView2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView linkTextView3 = findViewById(R.id.link3);
        linkTextView3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView linkTextView4 = findViewById(R.id.link4);
        linkTextView4.setMovementMethod(LinkMovementMethod.getInstance());

        TextView linkTextView5 = findViewById(R.id.link5);
        linkTextView5.setMovementMethod(LinkMovementMethod.getInstance());
    }
}

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class nexttask extends AppCompatActivity {
    RadioButton one,two,three,four;
    Button bte;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nexttask);
        one=findViewById(R.id.radioButton5);
        two=findViewById(R.id.radioButton6);
        three=findViewById(R.id.radioButton7);
        four=findViewById(R.id.radioButton8);
        bte=findViewById(R.id.Next);
        bte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(nexttask.this, Result.class);
                startActivity(intent);
            }
        });
        one.setText("Base of Tongue touching the mouth roof");
        two.setText("Portion of Tongue touching the mouth roof");
        three.setText("Both of these");
        four.setText("None of these");

    }
}
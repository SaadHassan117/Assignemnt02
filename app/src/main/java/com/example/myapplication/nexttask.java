package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class nexttask extends AppCompatActivity {
    RadioButton one,two,three,four;
    Button bte;
    int count2;
    int j=0;
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
                Intent intent = getIntent();
                j=intent.getIntExtra("value" ,0);
                intent = new Intent(nexttask.this, Result.class);
                intent.putExtra("value", j);
                startActivity(intent);
            }
        });
        one.setText("Base of Tongue touching the mouth roof");
        two.setText("Portion of Tongue touching the mouth roof");
        three.setText("Both of these");
        four.setText("None of these");

    }
    public void func (View v)
    {
        Button btn=findViewById(v.getId());
        String text=btn.getText().toString();

        if (text.equals( "Base of Tongue touching the mouth roof"))
        {
            two.setEnabled(false);
            three.setEnabled(false);
            four.setEnabled(false);
            count2+=j;
           // btn.setBackgroundColor(Color.GREEN);
        }
        if (text.equals( "Portion of Tongue touching the mouth roof"))
        {
            one.setEnabled(false);
            three.setEnabled(false);
            four.setEnabled(false);
            //btn.setBackgroundColor(Color.GREEN);
        }
        if (text.equals( "Both of these"))
        {
            one.setEnabled(false);
            two.setEnabled(false);
            four.setEnabled(false);
            //btn.setBackgroundColor(Color.GREEN);
        }
        if (text.equals( "None of these"))
        {
            two.setEnabled(false);
            three.setEnabled(false);
            one.setEnabled(false);
            //btn.setBackgroundColor(Color.GREEN);
        }
    }
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity3 extends AppCompatActivity {
    RadioButton one,two,three,four;
    Button bte;
    int count;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        one=findViewById(R.id.radioButton5);
        two=findViewById(R.id.radioButton6);
        three=findViewById(R.id.radioButton7);
        four=findViewById(R.id.radioButton8);
        bte=findViewById(R.id.Next);
        bte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  Intent intent;
                intent = new Intent(MainActivity3.this, nexttask.class);
                intent.putExtra("value", count);
                startActivity(intent);
            }
        });
        one.setText("End of Throat");
        two.setText("Middle of Throat");
        three.setText("Start  of Throat");
        four.setText("None of Above");
    }
    public void func(View v)
    {
        Button btn=findViewById(v.getId());
        String text=btn.getText().toString();

        if (text.equals( "End of Throat"))
        {
            two.setEnabled(false);
            three.setEnabled(false);
            four.setEnabled(false);
            //btn.setBackgroundColor(Color.GREEN);
            count++;
        }
        if (text.equals( "Middle of Throat"))
        {
            one.setEnabled(false);
            three.setEnabled(false);
            four.setEnabled(false);
           // btn.setBackgroundColor(Color.GREEN);
        }
        if (text.equals( "Start  of Throat"))
        {
            one.setEnabled(false);
            two.setEnabled(false);
            four.setEnabled(false);
            //btn.setBackgroundColor(Color.GREEN);
        }
        if (text.equals( "None of Above"))
        {
            two.setEnabled(false);
            three.setEnabled(false);
            one.setEnabled(false);
            //btn.setBackgroundColor(Color.GREEN);
        }
    }
}
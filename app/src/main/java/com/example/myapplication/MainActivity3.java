package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity3 extends AppCompatActivity {
    RadioButton one,two,three,four;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        one=findViewById(R.id.radioButton5);
        two=findViewById(R.id.radioButton6);
        three=findViewById(R.id.radioButton7);
        four=findViewById(R.id.radioButton8);
        one.setText(" End of Throat");
        two.setText(" Middle of Throat");
        three.setText(" Start  of Throat");
        four.setText(" None of Above");
    }
    public void func(View v)
    {
        RadioButton btn=findViewById(v.getId());
        String text=btn.getText().toString();
        if (text.equals( "End of Throat"))
        {
         btn.setBackgroundColor(Color.GREEN);
        }
    }
}
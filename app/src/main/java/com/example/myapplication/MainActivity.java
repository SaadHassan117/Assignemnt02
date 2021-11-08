package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button rep;
Button prac;
Button exame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rep=findViewById(R.id.button);
        prac=findViewById(R.id.practice);
        exame=findViewById(R.id.exam);
        rep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri webpage = Uri.parse("https://github.com/SaadHassan117/Assignemnt02");
                Intent intent = new
                        Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
            }
        });
        prac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity.this, MainActivity2.class);

                startActivity(intent);

            }
        });
        exame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);

            }
        });



    }

}
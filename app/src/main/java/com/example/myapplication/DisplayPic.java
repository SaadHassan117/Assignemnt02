package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class DisplayPic extends AppCompatActivity {
ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_pic);
        img=findViewById(R.id.image);
        Intent intent=getIntent();
        String image= intent.getStringExtra("name");
        int id=getResources().getIdentifier(image,"drawable",getPackageName());

        img.setImageResource(id);
    }
}
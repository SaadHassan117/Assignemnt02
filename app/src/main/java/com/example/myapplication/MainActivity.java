package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button rep;
Button prac;
Button exame;
Toolbar obj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rep=findViewById(R.id.button);
        prac=findViewById(R.id.practice);
        exame=findViewById(R.id.exam);
        obj=findViewById(R.id.toolbar);
        setSupportActionBar(obj);
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
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.hello:
                Toast.makeText(getApplicationContext(),"hello", Toast.LENGTH_LONG).show();
            case R.id.settinge:
                Toast.makeText(getApplicationContext(),"Fav", Toast.LENGTH_LONG).show();


            default:
// If we got here, the user's action was not recognized.
// Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is
                getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    }
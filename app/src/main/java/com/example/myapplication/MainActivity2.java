package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void function(View v)
    {
        Intent intent;
        switch (v.getId())
        {

            case R.id.button1:

                intent = new Intent(MainActivity2.this, DisplayPic.class);
                intent.putExtra("name","img1" );
                startActivity(intent);
                break;
            case R.id.button2:

                intent = new Intent(MainActivity2.this, DisplayPic.class);
                intent.putExtra("name","img2" );
                startActivity(intent);
                break;
            case R.id.button3:

                intent = new Intent(MainActivity2.this, DisplayPic.class);
                intent.putExtra("name","img3" );
                startActivity(intent);
                break;
            case R.id.button4:

                intent = new Intent(MainActivity2.this, DisplayPic.class);
                intent.putExtra("name","img5" );
                startActivity(intent);
                break;
            case R.id.button5:

                intent = new Intent(MainActivity2.this, DisplayPic.class);
                intent.putExtra("name","img6" );
                startActivity(intent);
                break;
            case R.id.button6:

                intent = new Intent(MainActivity2.this, DisplayPic.class);
                intent.putExtra("name","img7" );
                startActivity(intent);
                break;
            case R.id.button7:

                intent = new Intent(MainActivity2.this, DisplayPic.class);
                intent.putExtra("name","img8" );
                startActivity(intent);
                break;
            case R.id.button8:

                intent = new Intent(MainActivity2.this, DisplayPic.class);
                intent.putExtra("name","img9" );
                startActivity(intent);
                break;
            case R.id.button9:

                intent = new Intent(MainActivity2.this, DisplayPic.class);
                intent.putExtra("name","img10" );
                startActivity(intent);
                break;
            case R.id.button10:

                intent = new Intent(MainActivity2.this, DisplayPic.class);
                intent.putExtra("name","img11" );
                startActivity(intent);
                break;

        }


    }

}
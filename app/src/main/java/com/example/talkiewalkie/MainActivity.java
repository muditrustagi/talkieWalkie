package com.example.talkiewalkie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    public void about(View view)
    {
        Intent i = new Intent(MainActivity.this, About.class);
        startActivity(i);
    }


    public void begin(View view)
    {
        Intent i = new Intent(MainActivity.this, Begin.class);
        startActivity(i);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}



package com.example.android.jokesandroidlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        TextView jokesTv = findViewById(R.id.joke_activity_tv);
        Intent intent = getIntent();
        if(intent.hasExtra("JOKE_EXTRA")){
            jokesTv.setText(intent.getStringExtra("JOKE_EXTRA"));
        }
    }
}

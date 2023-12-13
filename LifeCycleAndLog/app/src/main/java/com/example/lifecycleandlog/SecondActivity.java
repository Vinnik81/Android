package com.example.lifecycleandlog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.time.Instant;

public class SecondActivity extends AppCompatActivity {

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        count = getIntent().getIntExtra("count", 0);
        getSupportActionBar().setTitle("Count: " + count);
    }

    public void BackMainActivity(View view) {
        /*Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);*/
        Intent intent = new Intent();
        intent.putExtra("count", count);
        setResult(200, intent);
        finish();
    }

    public void incriment(View view) {
        count++;
        getSupportActionBar().setTitle("Count: " + (++count));
    }
}
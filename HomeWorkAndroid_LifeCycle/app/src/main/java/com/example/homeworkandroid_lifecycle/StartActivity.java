package com.example.homeworkandroid_lifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    double count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        count = getIntent().getDoubleExtra("count", 0);
        getSupportActionBar().setTitle("Count: " + count);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("HomeWorkAndroid", "StartActivity -> onSaveInstanceState()");
        outState.putDouble("count", count);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i("HomeWorkAndroid", "StartActivity -> onRestoreInstanceState()");
        count = savedInstanceState.getDouble("count");
        getSupportActionBar().setTitle("Count: " + count);
    }

    public void inThree(View view) {
        count += 3;
        getSupportActionBar().setTitle("Count: " + count);
    }

    public void BackMainActivity(View view) {
        Intent intent = new Intent();
        intent.putExtra("count", count);
        setResult(200, intent);
        finish();
    }
}
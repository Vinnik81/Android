package com.example.homeworkandroid_lifecycle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    static final int START_REQUEST_CODE = 1;
    static final int SETTING_REQUEST_CODE = 2;
    static final int ABOUT_REQUEST_CODE = 3;
    double count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("HomeWorkAndroid", "MainActivity -> onCreate()");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("HomeWorkAndroid", "MainActivity -> onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("HomeWorkAndroid", "MainActivity -> onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w("HomeWorkAndroid", "MainActivity -> onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("HomeWorkAndroid", "MainActivity -> onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("HomeWorkAndroid", "MainActivity -> onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("HomeWorkAndroid", "MainActivity -> onRestart()");
    }

    public void onClick(View view) {
        getSupportActionBar().setTitle("Count: " + ++count);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("HomeWorkAndroid", "MainActivity -> onSaveInstanceState()");
        outState.putDouble("count", count);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i("HomeWorkAndroid", "MainActivity -> onRestoreInstanceState()");
        count = savedInstanceState.getDouble("count");
        getSupportActionBar().setTitle("Count: " + count);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == START_REQUEST_CODE || requestCode == SETTING_REQUEST_CODE || requestCode == ABOUT_REQUEST_CODE && resultCode == 200 && data != null) {
            count = data.getDoubleExtra("count", 0);
            getSupportActionBar().setTitle("Count: " + count);
        }
    }

    public void StartActivity(View view) {
        Intent intent = new Intent(this, StartActivity.class);
        intent.putExtra("count", count);
        startActivityForResult(intent, START_REQUEST_CODE);
    }

    public void SettingActivity(View view) {
        Intent intent = new Intent(this, SettingActivity.class);
        intent.putExtra("count", count);
        startActivityForResult(intent, SETTING_REQUEST_CODE);
    }

    public void AboutActivity(View view) {
        Intent intent = new Intent(this, AboutActivity.class);
        intent.putExtra("count", count);
        startActivityForResult(intent, ABOUT_REQUEST_CODE);
    }
}
package com.example.lifecycleandlog;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    static final int SECOND_REQUEST_CODE = 1;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// v - verbose
// d - debug
// i - info
// w - warning
// e - error
        Log.v("life cycle", "MainActivity -> onCreate() ");

        /*Intent returnIntent = getIntent();
        if (returnIntent != null) {
            count = returnIntent.getIntExtra("count", 0);
            getSupportActionBar().setTitle("Count: " + count);
        }*/
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("life cycle", "MainActivity -> onStart() ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("life cycle", "MainActivity -> onResume() ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w("life cycle", "MainActivity -> onPause() ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("life cycle", "MainActivity -> onStop() ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("life cycle", "MainActivity -> onDestroy() ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("life cycle", "MainActivity -> onRestart() ");
    }

    public void onClick(View view) {
        getSupportActionBar().setTitle("Count: " + ++count);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("life cycle", "MainActivity -> onSaveInstanceState() ");
        outState.putInt("count", count);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i("life cycle", "MainActivity -> onRestoreInstanceState() ");
        count = savedInstanceState.getInt("count", 0);
        getSupportActionBar().setTitle("Count: " + count);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == SECOND_REQUEST_CODE && resultCode == 200 && data != null) {
            count = data.getIntExtra("count", 0);
            getSupportActionBar().setTitle("Count: " + count);
        }
    }

    public void SecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("count", count);
        startActivityForResult(intent, SECOND_REQUEST_CODE);
    }
}


package com.example.contrainersandviewgrouopinstagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.txt);
        SeekBar seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textView.setText("SeekBar result: " + seekBar.getProgress());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Start change seekbar progress", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        /*Button button = findViewById(R.id.btn);
        ProgressBar progressBar = findViewById(R.id.four);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              handler.post(new Runnable() {
                  @Override
                  public void run() {
                      if (progressBar.getProgress() == progressBar.getMax()) return;
                      progressBar.incrementProgressBy(1);
                      handler.postDelayed(this, 600);
                  }
              });

                *//* for (int i = 0; i < 100; i++) {
                   progressBar.setProgress(i);
               }*//*
            }
        });*/
    }
}
package com.example.contrainersandviewgrouopinstagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static int count = 0;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        GridLayout linearLayout = findViewById(R.id.container);
        Button button = findViewById(R.id.one);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Button button1 = new Button(MainActivity.this);
               button1.setLayoutParams(new RelativeLayout.LayoutParams(200 , 200));
               ++MainActivity.count;
               String text = "Hello # " + MainActivity.count;
               button1.setText("Click me" + MainActivity.count + "!");
               button1.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Toast.makeText(MainActivity.this, "Click me", Toast.LENGTH_LONG).show();
                   }
               });
                linearLayout.addView(button1);
            }
        });

        /*TimePicker timePicker = findViewById(R.id.time);
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int i, int i1) {
                Toast.makeText(MainActivity.this, i + ":" + i1 + ":", Toast.LENGTH_LONG).show();
            }
        });*/

        /*DatePicker datePicker = findViewById(R.id.one);
        datePicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
                Toast.makeText(MainActivity.this, i + ":" + i1 + ":" + i2 + ":", Toast.LENGTH_LONG).show();
            }
        });*/

        /*TextView textView = findViewById(R.id.txt);
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
        });*/


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
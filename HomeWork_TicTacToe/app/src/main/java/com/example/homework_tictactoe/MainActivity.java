package com.example.homework_tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button_h_h, button_h_c, button_h_c_hard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_h_h = findViewById(R.id.human_human);
        button_h_c = findViewById(R.id.human_comp);
        button_h_c_hard = findViewById(R.id.human_comp_hard);
    }

    public void startHumanVsHuman(View view) {
        Intent intent = new Intent(this, HumanVsHuman.class);
        startActivity(intent);
        finish();
    }

    public void startHumanVsPC(View view) {
        Intent intent = new Intent(this, HumanVsPC.class);
        startActivity(intent);
        finish();
    }
}
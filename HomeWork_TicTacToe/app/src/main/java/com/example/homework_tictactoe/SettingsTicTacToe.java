package com.example.homework_tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class SettingsTicTacToe extends AppCompatActivity {

    ImageView backBtn;
    Button btnRestHumanVsHuman;
    Button btnRestHumanVsPC;

    Button btnRestHumanVsPCHard;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_tic_tac_toe);

        sharedPreferences = this.getSharedPreferences("tictactoe", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        btnRestHumanVsHuman = findViewById(R.id.btnRestHumanVsHuman);
        btnRestHumanVsPC = findViewById(R.id.btnRestHumanVsPC);
        btnRestHumanVsPCHard = findViewById(R.id.btnRestHumanVsPCHard);
        backBtn = findViewById(R.id.backBtn);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        btnRestHumanVsHuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putInt("pointsHumanKrest", 0);
                editor.putInt("pointsHumanNol", 0);
                editor.apply();
                Toast.makeText(SettingsTicTacToe.this, "Points are 0", Toast.LENGTH_SHORT).show();
            }
        });

        btnRestHumanVsPC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putInt("pointsHuman", 0);
                editor.putInt("pointsPC", 0);
                editor.apply();
                Toast.makeText(SettingsTicTacToe.this, "Points are 0", Toast.LENGTH_SHORT).show();
            }
        });

        btnRestHumanVsPCHard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putInt("pointsHumanHard", 0);
                editor.putInt("pointsPCHard", 0);
                editor.apply();
                Toast.makeText(SettingsTicTacToe.this, "Points are 0", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(SettingsTicTacToe.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
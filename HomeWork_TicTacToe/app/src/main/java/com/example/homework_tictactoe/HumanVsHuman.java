package com.example.homework_tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;

public class HumanVsHuman extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    String currentPlayer;
    TextView textView, humanPointsKrest, humanPointsNol;
    int pointsHumanKrest, pointsHumanNol;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human_vs_human);

        currentPlayer = "X";

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        textView = findViewById(R.id.textView);
        humanPointsKrest = findViewById(R.id.humanPointsKrest);
        humanPointsNol = findViewById(R.id.humanPointsNol);

        sharedPreferences = this.getSharedPreferences("tictactoe", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        pointsHumanKrest = sharedPreferences.getInt("pointsHumanKrest", 0);
        humanPointsKrest.setText("" + pointsHumanKrest);
        pointsHumanNol = sharedPreferences.getInt("pointsHumanNol", 0);
        humanPointsNol.setText("" + pointsHumanNol);
    }

    public void clickBtn1(View view) {
        if (button1.getText() == "" && textView.getText() == "") {
            button1.setText(currentPlayer);
            chekWin();
            if (textView.getText() == "") {
                currentPlayer = currentPlayer.equals("X") ? "0" : "X";
            }
        }
    }

    public void clickBtn2(View view) {
        if (button2.getText() == "" && textView.getText() == "") {
            button2.setText(currentPlayer);
            chekWin();
            if (textView.getText() == "") {
                currentPlayer = currentPlayer.equals("X") ? "0" : "X";
            }
        }
    }

    public void clickBtn3(View view) {
        if (button3.getText() == "" && textView.getText() == "") {
            button3.setText(currentPlayer);
            chekWin();
            if (textView.getText() == "") {
                currentPlayer = currentPlayer.equals("X") ? "0" : "X";
            }
        }
    }

    public void clickBtn4(View view) {
        if (button4.getText() == "" && textView.getText() == "") {
            button4.setText(currentPlayer);
            chekWin();
            if (textView.getText() == "") {
                currentPlayer = currentPlayer.equals("X") ? "0" : "X";
            }
        }
    }

    public void clickBtn5(View view) {
        if (button5.getText() == "" && textView.getText() == "") {
            button5.setText(currentPlayer);
            chekWin();
            if (textView.getText() == "") {
                currentPlayer = currentPlayer.equals("X") ? "0" : "X";
            }
        }
    }

    public void clickBtn6(View view) {
        if (button6.getText() == "" && textView.getText() == "") {
            button6.setText(currentPlayer);
            chekWin();
            if (textView.getText() == "") {
                currentPlayer = currentPlayer.equals("X") ? "0" : "X";
            }
        }
    }

    public void clickBtn7(View view) {
        if (button7.getText() == "" && textView.getText() == "") {
            button7.setText(currentPlayer);
            chekWin();
            if (textView.getText() == "") {
                currentPlayer = currentPlayer.equals("X") ? "0" : "X";
            }
        }
    }

    public void clickBtn8(View view) {
        if (button8.getText() == "" && textView.getText() == "") {
            button8.setText(currentPlayer);
            chekWin();
            if (textView.getText() == "") {
                currentPlayer = currentPlayer.equals("X") ? "0" : "X";
            }
        }
    }

    public void clickBtn9(View view) {
        if (button9.getText() == "" && textView.getText() == "") {
            button9.setText(currentPlayer);
            chekWin();
            if (textView.getText() == "") {
                currentPlayer = currentPlayer.equals("X") ? "0" : "X";
            }
        }
    }

    public void chekWin() {
        if (button1.getText() == currentPlayer && button2.getText() == currentPlayer && button3.getText() == currentPlayer) {
            button1.setBackgroundColor(Color.GREEN);
            button2.setBackgroundColor(Color.GREEN);
            button3.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_message_human);
            if (currentPlayer.equals("X")) {
                pointsHumanKrest++;
                humanPointsKrest.setText("" + pointsHumanKrest);
                editor.putInt("pointsHumanKrest", pointsHumanKrest);
            } else {
                pointsHumanNol++;
                humanPointsNol.setText("" + pointsHumanNol);
                editor.putInt("pointsHumanNol", pointsHumanNol);
            }
            editor.apply();
        }
       else if (button4.getText() == currentPlayer && button5.getText() == currentPlayer && button6.getText() == currentPlayer) {
           button4.setBackgroundColor(Color.GREEN);
           button5.setBackgroundColor(Color.GREEN);
           button6.setBackgroundColor(Color.GREEN);
           textView.setText(R.string.winner_message_human);
            if (currentPlayer.equals("X")) {
                pointsHumanKrest++;
                humanPointsKrest.setText("" + pointsHumanKrest);
                editor.putInt("pointsHumanKrest", pointsHumanKrest);
            } else {
                pointsHumanNol++;
                humanPointsNol.setText("" + pointsHumanNol);
                editor.putInt("pointsHumanNol", pointsHumanNol);
            }
            editor.apply();
        }
       else if (button7.getText() == currentPlayer && button8.getText() == currentPlayer && button9.getText() == currentPlayer) {
           button7.setBackgroundColor(Color.GREEN);
           button8.setBackgroundColor(Color.GREEN);
           button9.setBackgroundColor(Color.GREEN);
           textView.setText(R.string.winner_message_human);
            if (currentPlayer.equals("X")) {
                pointsHumanKrest++;
                humanPointsKrest.setText("" + pointsHumanKrest);
                editor.putInt("pointsHumanKrest", pointsHumanKrest);
            } else {
                pointsHumanNol++;
                humanPointsNol.setText("" + pointsHumanNol);
                editor.putInt("pointsHumanNol", pointsHumanNol);
            }
            editor.apply();
        }
       else if (button1.getText() == currentPlayer && button4.getText() == currentPlayer && button7.getText() == currentPlayer) {
           button1.setBackgroundColor(Color.GREEN);
           button4.setBackgroundColor(Color.GREEN);
           button7.setBackgroundColor(Color.GREEN);
           textView.setText(R.string.winner_message_human);
            if (currentPlayer.equals("X")) {
                pointsHumanKrest++;
                humanPointsKrest.setText("" + pointsHumanKrest);
                editor.putInt("pointsHumanKrest", pointsHumanKrest);
            } else {
                pointsHumanNol++;
                humanPointsNol.setText("" + pointsHumanNol);
                editor.putInt("pointsHumanNol", pointsHumanNol);
            }
            editor.apply();
        }
       else if (button2.getText() == currentPlayer && button5.getText() == currentPlayer && button8.getText() == currentPlayer) {
           button2.setBackgroundColor(Color.GREEN);
           button5.setBackgroundColor(Color.GREEN);
           button8.setBackgroundColor(Color.GREEN);
           textView.setText(R.string.winner_message_human);
            if (currentPlayer.equals("X")) {
                pointsHumanKrest++;
                humanPointsKrest.setText("" + pointsHumanKrest);
                editor.putInt("pointsHumanKrest", pointsHumanKrest);
            } else {
                pointsHumanNol++;
                humanPointsNol.setText("" + pointsHumanNol);
                editor.putInt("pointsHumanNol", pointsHumanNol);
            }
            editor.apply();
        }
       else if (button3.getText() == currentPlayer && button6.getText() == currentPlayer && button9.getText() == currentPlayer) {
           button3.setBackgroundColor(Color.GREEN);
           button6.setBackgroundColor(Color.GREEN);
           button9.setBackgroundColor(Color.GREEN);
           textView.setText(R.string.winner_message_human);
            if (currentPlayer.equals("X")) {
                pointsHumanKrest++;
                humanPointsKrest.setText("" + pointsHumanKrest);
                editor.putInt("pointsHumanKrest", pointsHumanKrest);
            } else {
                pointsHumanNol++;
                humanPointsNol.setText("" + pointsHumanNol);
                editor.putInt("pointsHumanNol", pointsHumanNol);
            }
            editor.apply();
        }
       else if (button1.getText() == currentPlayer && button5.getText() == currentPlayer && button9.getText() == currentPlayer) {
           button1.setBackgroundColor(Color.GREEN);
           button5.setBackgroundColor(Color.GREEN);
           button9.setBackgroundColor(Color.GREEN);
           textView.setText(R.string.winner_message_human);
            if (currentPlayer.equals("X")) {
                pointsHumanKrest++;
                humanPointsKrest.setText("" + pointsHumanKrest);
                editor.putInt("pointsHumanKrest", pointsHumanKrest);
            } else {
                pointsHumanNol++;
                humanPointsNol.setText("" + pointsHumanNol);
                editor.putInt("pointsHumanNol", pointsHumanNol);
            }
            editor.apply();
        }
       else if (button3.getText() == currentPlayer && button5.getText() == currentPlayer && button7.getText() == currentPlayer) {
           button3.setBackgroundColor(Color.GREEN);
           button5.setBackgroundColor(Color.GREEN);
           button7.setBackgroundColor(Color.GREEN);
           textView.setText(R.string.winner_message_human);
            if (currentPlayer.equals("X")) {
                pointsHumanKrest++;
                humanPointsKrest.setText("" + pointsHumanKrest);
                editor.putInt("pointsHumanKrest", pointsHumanKrest);
            } else {
                pointsHumanNol++;
                humanPointsNol.setText("" + pointsHumanNol);
                editor.putInt("pointsHumanNol", pointsHumanNol);
            }
            editor.apply();
        }
        else if (button1.getText() != "" && button2.getText() != "" && button3.getText() != "" &&
                button4.getText() != "" && button5.getText() != "" && button6.getText() != "" &&
                button7.getText() != "" && button8.getText() != "" && button9.getText() != "") {
            textView.setText(R.string.draw_message);
        }
    }

    public void clickRestart(View view) {
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        textView.setText("");

        button1.setBackgroundColor(button1.getContext().getResources().getColor(R.color.purple_500));
        button2.setBackgroundColor(button2.getContext().getResources().getColor(R.color.purple_500));
        button3.setBackgroundColor(button3.getContext().getResources().getColor(R.color.purple_500));
        button4.setBackgroundColor(button4.getContext().getResources().getColor(R.color.purple_500));
        button5.setBackgroundColor(button5.getContext().getResources().getColor(R.color.purple_500));
        button6.setBackgroundColor(button6.getContext().getResources().getColor(R.color.purple_500));
        button7.setBackgroundColor(button7.getContext().getResources().getColor(R.color.purple_500));
        button8.setBackgroundColor(button8.getContext().getResources().getColor(R.color.purple_500));
        button9.setBackgroundColor(button9.getContext().getResources().getColor(R.color.purple_500));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(HumanVsHuman.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void onBackMenu(View view) {
        onBackPressed();
    }

    public void onSettingClick(View view) {
        Intent intent = new Intent(HumanVsHuman.this, SettingsTicTacToe.class);
        startActivity(intent);
        finish();
    }
}

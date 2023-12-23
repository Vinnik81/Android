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
import android.widget.TextView;

import java.util.Random;

public class HumanVsPC extends AppCompatActivity {

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    String playerKrest, playerNol;
    TextView textView, humanPoints, pcPoints;
    int pointsHuman, pointsPC;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human_vs_pc);

        playerKrest = "X";
        playerNol = "O";

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
        humanPoints = findViewById(R.id.humanPoints);
        pcPoints = findViewById(R.id.pcPoints);

        sharedPreferences = this.getSharedPreferences("tictactoe", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        pointsHuman = sharedPreferences.getInt("pointsHuman", 0);
        humanPoints.setText("" + pointsHuman);
        pointsPC = sharedPreferences.getInt("pointsPC", 0);
        pcPoints.setText("" + pointsPC);
    }

    public void clickBtn1(View view) {
        if (button1.getText() == "" && textView.getText() == "") {
            button1.setText(playerKrest);
            isPlayerWin();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }

    public void clickBtn2(View view) {
        if (button2.getText() == "" && textView.getText() == "") {
            button2.setText(playerKrest);
            isPlayerWin();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }

    public void clickBtn3(View view) {
        if (button3.getText() == "" && textView.getText() == "") {
            button3.setText(playerKrest);
            isPlayerWin();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }

    public void clickBtn4(View view) {
        if (button4.getText() == "" && textView.getText() == "") {
            button4.setText(playerKrest);
            isPlayerWin();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }

    public void clickBtn5(View view) {
        if (button5.getText() == "" && textView.getText() == "") {
            button5.setText(playerKrest);
            isPlayerWin();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }

    public void clickBtn6(View view) {
        if (button6.getText() == "" && textView.getText() == "") {
            button6.setText(playerKrest);
            isPlayerWin();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }

    public void clickBtn7(View view) {
        if (button7.getText() == "" && textView.getText() == "") {
            button7.setText(playerKrest);
            isPlayerWin();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }

    public void clickBtn8(View view) {
        if (button8.getText() == "" && textView.getText() == "") {
            button8.setText(playerKrest);
            isPlayerWin();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }

    public void clickBtn9(View view) {
        if (button9.getText() == "" && textView.getText() == "") {
            button9.setText(playerKrest);
            isPlayerWin();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }

    public void isPlayerWin() {
        if (button1.getText() == playerKrest && button2.getText() == playerKrest && button3.getText() == playerKrest) {
            button1.setBackgroundColor(Color.GREEN);
            button2.setBackgroundColor(Color.GREEN);
            button3.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_message);
            pointsHuman++;
            humanPoints.setText("" + pointsHuman);
            editor.putInt("pointsHuman", pointsHuman);
            editor.apply();
        }
        else if (button4.getText() == playerKrest && button5.getText() == playerKrest && button6.getText() == playerKrest) {
            button4.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button6.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_message);
            pointsHuman++;
            humanPoints.setText("" + pointsHuman);
            editor.putInt("pointsHuman", pointsHuman);
            editor.apply();
        }
        else if (button7.getText() == playerKrest && button8.getText() == playerKrest && button9.getText() == playerKrest) {
            button7.setBackgroundColor(Color.GREEN);
            button8.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_message);
            pointsHuman++;
            humanPoints.setText("" + pointsHuman);
            editor.putInt("pointsHuman", pointsHuman);
            editor.apply();
        }
        else if (button1.getText() == playerKrest && button4.getText() == playerKrest && button7.getText() == playerKrest) {
            button1.setBackgroundColor(Color.GREEN);
            button4.setBackgroundColor(Color.GREEN);
            button7.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_message);
            pointsHuman++;
            humanPoints.setText("" + pointsHuman);
            editor.putInt("pointsHuman", pointsHuman);
            editor.apply();
        }
        else if (button2.getText() == playerKrest && button5.getText() == playerKrest && button8.getText() == playerKrest) {
            button2.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button8.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_message);
            pointsHuman++;
            humanPoints.setText("" + pointsHuman);
            editor.putInt("pointsHuman", pointsHuman);
            editor.apply();
        }
        else if (button3.getText() == playerKrest && button6.getText() == playerKrest && button9.getText() == playerKrest) {
            button3.setBackgroundColor(Color.GREEN);
            button6.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_message);
            pointsHuman++;
            humanPoints.setText("" + pointsHuman);
            editor.putInt("pointsHuman", pointsHuman);
            editor.apply();
        }
        else if (button1.getText() == playerKrest && button5.getText() == playerKrest && button9.getText() == playerKrest) {
            button1.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_message);
            pointsHuman++;
            humanPoints.setText("" + pointsHuman);
            editor.putInt("pointsHuman", pointsHuman);
            editor.apply();
        }
        else if (button3.getText() == playerKrest && button5.getText() == playerKrest && button7.getText() == playerKrest) {
            button3.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button7.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_message);
            pointsHuman++;
            humanPoints.setText("" + pointsHuman);
            editor.putInt("pointsHuman", pointsHuman);
            editor.apply();
        }
        else if (button1.getText() != "" && button2.getText() != "" && button3.getText() != "" &&
                button4.getText() != "" && button5.getText() != "" && button6.getText() != "" &&
                button7.getText() != "" && button8.getText() != "" && button9.getText() != "") {
            textView.setText(R.string.draw_message);
        }
    }

    public void isPCWin() {
        if (button1.getText() == playerNol && button2.getText() == playerNol && button3.getText() == playerNol) {
            button1.setBackgroundColor(Color.GREEN);
            button2.setBackgroundColor(Color.GREEN);
            button3.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.pc_winner_message);
            pointsPC++;
            pcPoints.setText("" + pointsPC);
            editor.putInt("pointsPC", pointsPC);
            editor.apply();
        }
        else if (button4.getText() == playerNol && button5.getText() == playerNol && button6.getText() == playerNol) {
            button4.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button6.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.pc_winner_message);
            pointsPC++;
            pcPoints.setText("" + pointsPC);
            editor.putInt("pointsPC", pointsPC);
            editor.apply();
        }
        else if (button7.getText() == playerNol && button8.getText() == playerNol && button9.getText() == playerNol) {
            button7.setBackgroundColor(Color.GREEN);
            button8.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.pc_winner_message);
            pointsPC++;
            pcPoints.setText("" + pointsPC);
            editor.putInt("pointsPC", pointsPC);
            editor.apply();
        }
        else if (button1.getText() == playerNol && button4.getText() == playerNol && button7.getText() == playerNol) {
            button1.setBackgroundColor(Color.GREEN);
            button4.setBackgroundColor(Color.GREEN);
            button7.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.pc_winner_message);
            pointsPC++;
            pcPoints.setText("" + pointsPC);
            editor.putInt("pointsPC", pointsPC);
            editor.apply();
        }
        else if (button2.getText() == playerNol && button5.getText() == playerNol && button8.getText() == playerNol) {
            button2.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button8.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.pc_winner_message);
            pointsPC++;
            pcPoints.setText("" + pointsPC);
            editor.putInt("pointsPC", pointsPC);
            editor.apply();
        }
        else if (button3.getText() == playerNol && button6.getText() == playerNol && button9.getText() == playerNol) {
            button3.setBackgroundColor(Color.GREEN);
            button6.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.pc_winner_message);
            pointsPC++;
            pcPoints.setText("" + pointsPC);
            editor.putInt("pointsPC", pointsPC);
            editor.apply();
        }
        else if (button1.getText() == playerNol && button5.getText() == playerNol && button9.getText() == playerNol) {
            button1.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.pc_winner_message);
            pointsPC++;
            pcPoints.setText("" + pointsPC);
            editor.putInt("pointsPC", pointsPC);
            editor.apply();
        }
        else if (button3.getText() == playerNol && button5.getText() == playerNol && button7.getText() == playerNol) {
            button3.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button7.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.pc_winner_message);
            pointsPC++;
            pcPoints.setText("" + pointsPC);
            editor.putInt("pointsPC", pointsPC);
            editor.apply();
        }
    }

    private void hodPC() {
        Random random = new Random();
        int buttonPCClick = 1 + random.nextInt(9);
        Log.i("hoPc", "buttonPCClick = " + buttonPCClick);
        switch (buttonPCClick) {
            case 1:
                if (button1.getText() == "") {
                    button1.setText(playerNol);
                    isPCWin();
                } else {
                    hodPC();
                }
                break;
            case 2:
                if (button2.getText() == "") {
                    button2.setText(playerNol);
                    isPCWin();
                } else {
                    hodPC();
                }
                break;
            case 3:
                if (button3.getText() == "") {
                    button3.setText(playerNol);
                    isPCWin();
                } else {
                    hodPC();
                }
                break;
            case 4:
                if (button4.getText() == "") {
                    button4.setText(playerNol);
                    isPCWin();
                } else {
                    hodPC();
                }
                break;
            case 5:
                if (button5.getText() == "") {
                    button5.setText(playerNol);
                    isPCWin();
                } else {
                    hodPC();
                }
                break;
            case 6:
                if (button6.getText() == "") {
                    button6.setText(playerNol);
                    isPCWin();
                } else {
                    hodPC();
                }
                break;
            case 7:
                if (button7.getText() == "") {
                    button7.setText(playerNol);
                    isPCWin();
                } else {
                    hodPC();
                }
                break;
            case 8:
                if (button8.getText() == "") {
                    button8.setText(playerNol);
                    isPCWin();
                } else {
                    hodPC();
                }
                break;
            case 9:
                if (button9.getText() == "") {
                    button9.setText(playerNol);
                    isPCWin();
                } else {
                    hodPC();
                }
                break;
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
        Intent intent = new Intent(HumanVsPC.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void onBackMenu(View view) {
        onBackPressed();
    }

    public void onSettingClick(View view) {
        Intent intent = new Intent(HumanVsPC.this, SettingsTicTacToe.class);
        startActivity(intent);
        finish();
    }
}
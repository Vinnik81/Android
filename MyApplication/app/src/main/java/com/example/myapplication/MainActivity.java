package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity_main);

        Button button = findViewById(R.id.btn_two);
        button.setText("Vladimir");
        button.setTextSize(40);
        button.setAllCaps(true);
        button.setTextColor(Color.parseColor("#2196F3"));
        button.setBackgroundColor(Color.parseColor("#4422F2"));

        ImageButton imageButton = findViewById(R.id.btn_three);
        imageButton.setOnClickListener(view -> {
            Snackbar.make(view, R.string.hello, Snackbar.LENGTH_LONG).show();
        });

       /* Button button = findViewById(R.id.btn_one);
        button.setText("Vladimir");
        button.setOnClickListener(this::onClick);*/
       /* button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_LONG).show();
//            Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_LONG).show();
//                 Snackbar.make(view, R.string.hello, Snackbar.LENGTH_LONG).show();
            }
        });*/

        /*button.setOnClickListener(view -> {
            Snackbar.make(view, R.string.hello, Snackbar.LENGTH_LONG).show();
        });*/
    }

   /* public void OnClick(View view) {
//        Toast.makeText(this, "Hello", Toast.LENGTH_LONG).show();

    }*/

    @Override
    public void onClick(View view) {
        Toast toast = Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_LONG);
        LinearLayout layout = (LinearLayout) toast.getView();
        ImageView imageView = new ImageView(getApplicationContext());
        imageView.setImageResource(R.drawable.ic_launcher_foreground);
        layout.addView(imageView, 1);
        toast.setGravity(Gravity.FILL_HORIZONTAL | Gravity.BOTTOM, 0, 100);
        toast.show();


       /*Toast toast = Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_LONG);
       Toast toast2 = Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_LONG);
       toast.setGravity(Gravity.BOTTOM | Gravity.RIGHT, 0, 100);
       toast2.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 500);
       //        toast.setGravity(Gravity.BOTTOM | Gravity.LEFT,0,0);
//        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
       toast.show();
       toast2.show();*/
        //        Snackbar.make(view, R.string.hello, Snackbar.LENGTH_LONG).show();
    }
}
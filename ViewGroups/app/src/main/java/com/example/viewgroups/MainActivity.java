package com.example.viewgroups;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*findViewById(R.id.one).setOnClickListener(view -> {
            Toast.makeText(this, "CLICK", Toast.LENGTH_LONG).show();;
        });

       ToggleButton toggleButton = findViewById(R.id.two);
       toggleButton.setOnCheckedChangeListener((btn, b) -> {
            Toast.makeText(this, Boolean.toString(b), Toast.LENGTH_LONG).show();;
        });

       Switch aSwitch = findViewById(R.id.three);
       aSwitch.setOnCheckedChangeListener((btn, b) -> {
            Toast.makeText(this, Boolean.toString(b), Toast.LENGTH_LONG).show();;
        });

       CheckBox checkBox = findViewById(R.id.four);
       checkBox.setOnCheckedChangeListener((btn, b) -> {
            Toast.makeText(this, Boolean.toString(b), Toast.LENGTH_LONG).show();;
        });

        RadioGroup radioGroup = findViewById(R.id.radio_group);
        radioGroup.setOnCheckedChangeListener((ViewGroup, id) -> {
            if (id == R.id.five) {
                Toast.makeText(this, "Male", Toast.LENGTH_LONG).show();;
            } else if (id == R.id.sixe) {
                Toast.makeText(this, "Woman", Toast.LENGTH_LONG).show();;
            }
        });

        Spinner spinner = findViewById(R.id.spinner_one);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,String.valueOf(spinner.getSelectedItem()),Toast.LENGTH_LONG).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        findViewById(R.id.imageButton).setOnClickListener(view -> {
            Toast.makeText(this, "CLICK", Toast.LENGTH_LONG).show();;
        });*/
    }
}
package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> data;
    Button button;
    Button button2;
    Button button3;
    EditText editText;
    ArrayAdapter<String> adapter;
    int tmp = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.list_view);
        editText = findViewById(R.id.edit_text_one);
        button = findViewById(R.id.btn_one);
        button2 = findViewById(R.id.btn_two);
        button3 = findViewById(R.id.btn_three);
        data = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, R.layout.my_item, data);
        listView.setAdapter(adapter);

        editText.setOnKeyListener(((view, keyCode, keyEvent) -> {
            if (keyEvent.getAction() == KeyEvent.ACTION_DOWN) {
                if (keyCode == KeyEvent.KEYCODE_ENTER) {
                return addList();
                }
            }
            return false;
        }));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               addList();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Size: " + data.size() + "", Toast.LENGTH_SHORT).show();
                adapter.clear();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();
                if (tmp != -1) {
                    if (!text.isEmpty()) {
                        data.remove(tmp);
                        data.add(tmp, text);
                        adapter.notifyDataSetChanged();
                        editText.setText("");
                        tmp = -1;
                    } else {
                        Toast.makeText(MainActivity.this, "Please select element", Toast.LENGTH_SHORT).show();
                    }
                }
                Toast.makeText(MainActivity.this, "Saved", Toast.LENGTH_SHORT).show();
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                editText.setText(((TextView)view).getText());
                tmp = i;
                Toast.makeText(MainActivity.this, ((TextView)view).getText() +  " ( " + i + " )", Toast.LENGTH_LONG).show();
            }
        });

                /*String[] data = {"Apple", "Banana", "Orange", "Watermelon", "Pear", "Grape", "Pineapple", "Strawberry", "Cherry", "Mango"};
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
                adapter = new ArrayAdapter<>(this, R.layout.my_item, data);
                listView.setAdapter(adapter);*/
    }
    private boolean addList() {
        tmp = -1;
        String text = editText.getText().toString();
        if (!text.isEmpty()) {
            data.add(0, text);
            adapter.notifyDataSetChanged();
            editText.setText("");
            return true;
        }
        return false;
    }
}

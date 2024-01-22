package com.example.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.sqlite.models.Student;
import com.example.sqlite.utils.DBHelper;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHelper = new DBHelper(this);

        dbHelper.addStudent(new Student( "Vladimir", "Vinnik", 42));
        dbHelper.addStudent(new Student( "Oleq", "Qazmanov", 72));
        dbHelper.addStudent(new Student( "Olqa", "Buzova", 41));

        List<Student> result = dbHelper.getAll();

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(new ArrayAdapter<Student>(this, android.R.layout.simple_list_item_1, result));

        /*findViewById(R.id.btn).setOnClickListener(v -> {
            for (Student student : result) {
                Toast.makeText(this, student.toString(), Toast.LENGTH_LONG).show();
            }
        });*/
    }
}
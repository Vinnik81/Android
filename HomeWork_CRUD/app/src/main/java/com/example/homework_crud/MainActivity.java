package com.example.homework_crud;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.homework_crud.adapters.PersonAdapter;
import com.example.homework_crud.models.Person;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    static final int ADD_REQUEST_CODE = 1;
    static final int EDIT_REQUEST_CODE = 2;

    List<Person>  people = new ArrayList<>();
    PersonAdapter personAdapter;
    ListView listView;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
      if (data != null && resultCode == 200) {
          if (requestCode == ADD_REQUEST_CODE) {
             String fullName = data.getStringExtra("fullName");
             int age = data.getIntExtra("age", 0);
             String phoneNumber = data.getStringExtra("phoneNumber");
             String email = data.getStringExtra("email");
             String text = data.getStringExtra("text");
             people.add(new Person(fullName, age, phoneNumber, email, text, R.drawable.two));
             personAdapter.notifyDataSetChanged();
          }
      }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = findViewById(R.id.btn_add);
        Button editBtn = findViewById(R.id.btn_edit);
        Button removeBtn = findViewById(R.id.btn_remove);
        Button clearBtn = findViewById(R.id.btn_Clear);

        listView = findViewById(R.id.list_view);

        people.add(new Person("John Doe", 30, "123-456-7890", "johndoe@ex.com", "Hello", R.drawable.one));
        people.add(new Person("Jane Daster", 25, "123-456-7890", "janedoster@ex.com", "Hi I am Jane", R.drawable.two));
        people.add(new Person("Jack Miller", 35, "123-456-7890", "jackMiller@ex.com", "I am Jack", R.drawable.three));
        people.add(new Person("Jill Smith", 28, "123-456-7890", "jillSmith@ex.com", "I am Jill", R.drawable.four));
        people.add(new Person("Joe Bloggs", 40, "123-456-7890", "joeBloggs@ex.com", "I am Joe", R.drawable.five));
        people.add(new Person("Piper Black", 30, "123-456-7890", "peperBlack@ex.com", "Hi I am Piper", R.drawable.six));
        people.add(new Person("Sarah Taylor", 38, "123-456-7890", "sarahTaylor@ex.com", "Hi I am Sarah", R.drawable.seven));
        personAdapter = new PersonAdapter(this, people, R.layout.person_item);
        listView.setAdapter(personAdapter);

        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                listView.setItemChecked(position, true);
            }
        });

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddActivity.class);
                startActivityForResult(intent, ADD_REQUEST_CODE);
            }
        });

        editBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, EditActivity.class);
                startActivityForResult(intent, EDIT_REQUEST_CODE);
            }
        });

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (people != null && people.size() > 0) {
                    people.clear();
                    personAdapter.notifyDataSetChanged();
                }
            }
        });

        removeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedPosition = listView.getCheckedItemPosition();
                if (selectedPosition != ListView.INVALID_POSITION && people.size() > selectedPosition) {
                    Person person = people.get(selectedPosition);
                    people.remove(selectedPosition);
                    Toast.makeText(MainActivity.this, "Deleted "+ person.getFullName(), Toast.LENGTH_LONG).show();
                    personAdapter.notifyDataSetChanged();
                }
            }
        });
    }
}
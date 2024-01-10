package com.example.homework_crud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        Button saveBtn = findViewById(R.id.save_btn);
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText addFullName = findViewById(R.id.add_fullname);
                EditText addAge = findViewById(R.id.add_age);
                EditText addPhoneNumber = findViewById(R.id.add_phonenumber);
                EditText addEmail = findViewById(R.id.add_email);
                EditText addText = findViewById(R.id.add_text);

                String fullName = addFullName.getText().toString();
                int age = Integer.parseInt(addAge.getText().toString());
                String phoneNumber = addPhoneNumber.getText().toString();
                String email = addEmail.getText().toString();
                String text = addText.getText().toString();

                Intent intent = new Intent();
                intent.putExtra("fullName", fullName);
                intent.putExtra("age", age);
                intent.putExtra("phoneNumber", phoneNumber);
                intent.putExtra("email", email);
                intent.putExtra("text", text);
                setResult(200, intent);
                finish();
            }
        });
    }
}
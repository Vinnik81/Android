package com.example.homework_crud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String fullName = extras.getString("fullName");
            int age = extras.getInt("age");
            String phoneNumber = extras.getString("phoneNumber");
            String email = extras.getString("email");
            String text = extras.getString("text");

            TextView editFullName = findViewById(R.id.edit_fullname_tv);
            EditText editAge = findViewById(R.id.edit_age);
            EditText editPhoneNumber = findViewById(R.id.edit_phonenumber);
            EditText editEmail = findViewById(R.id.edit_email);
            EditText editText = findViewById(R.id.edit_text);

            editFullName.setText(fullName);
            editAge.setText(String.valueOf(age));
            editPhoneNumber.setText(phoneNumber);
            editEmail.setText(email);
            editText.setText(text);
        }

        Button saveBtnEdit = findViewById(R.id.save_btn_edit);

        saveBtnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editFullName = findViewById(R.id.edit_fullname);
                EditText editAge = findViewById(R.id.edit_age);
                EditText editPhoneNumber = findViewById(R.id.edit_phonenumber);
                EditText editEmail = findViewById(R.id.edit_email);
                EditText editText = findViewById(R.id.edit_text);

                String fullName = editFullName.getText().toString();
                int age = Integer.parseInt(editAge.getText().toString());
                String phoneNumber = editPhoneNumber.getText().toString();
                String email = editEmail.getText().toString();
                String text = editText.getText().toString();

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
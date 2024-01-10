package com.example.homework_crud.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.homework_crud.R;
import com.example.homework_crud.models.Person;

import java.util.List;

public class PersonAdapter extends BaseAdapter {
    private Context context;
    List<Person> data;
    int templateLayout;
    private LayoutInflater inflater;

    public PersonAdapter() {
    }

    public PersonAdapter(Context context, List<Person> data, int templateLayout) {
        this.context = context;
        this.data = data;
        this.templateLayout = templateLayout;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View rowView = inflater.inflate(templateLayout, viewGroup, false);
        TextView fullName = rowView.findViewById(R.id.text_fullname);
        TextView age = rowView.findViewById(R.id.text_age);
        TextView phoneNumber = rowView.findViewById(R.id.text_phonenumber);
        TextView email = rowView.findViewById(R.id.text_email);
        TextView text = rowView.findViewById(R.id.text_text);
        ImageView avatar = rowView.findViewById(R.id.img_avatar);

        Person person = data.get(position);
        fullName.setText(person.getFullName());
        age.setText(String.valueOf(person.getAge()));
        phoneNumber.setText(person.getPhoneNumber());
        email.setText(person.getEmail());
        text.setText(person.getText());
        avatar.setImageResource(person.getImageId());
        return rowView;
    }
}

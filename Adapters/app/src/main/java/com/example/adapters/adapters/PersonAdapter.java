package com.example.adapters.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.adapters.R;
import com.example.adapters.models.Person;

import java.util.List;

public class PersonAdapter extends BaseAdapter {
    private Context context;
    List<Person> data;
    int templateLayout;
    private LayoutInflater inflater;

    public PersonAdapter() {
    }

    public PersonAdapter(Context context, int templateLayout, List<Person> data) {
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
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = inflater.inflate(templateLayout, parent, false);
        TextView fullName = rowView.findViewById(R.id.text_fullname);
        TextView age = rowView.findViewById(R.id.text_age);
        ImageView avatar = rowView.findViewById(R.id.img_avatar);

        Person person = data.get(position);
        fullName.setText(person.getFullName());
        age.setText(String.valueOf(person.getAge()));
        avatar.setImageResource(person.getImageId());
        return rowView;
    }
}

package com.example.homework_json.models;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.homework_json.R;

import java.util.List;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder> {
    private Root weather;
    private int templateLayout;
    private Context context;

    public WeatherAdapter(Context context, int templateLayout, Root weather) {
        this.weather = weather;
        this.templateLayout = templateLayout;
        this.context = context;
    }

    @NonNull
    @Override
    public WeatherViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(templateLayout, parent, false);
        return new WeatherViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherViewHolder holder, int position) {
        holder.city.setText(weather.name);
        holder.temp.setText((String.valueOf(weather.main.temp)));
        holder.description.setText(weather.weather.get(0).description);
        holder.pressure.setText((String.valueOf(weather.main.pressure)));
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public static class WeatherViewHolder extends RecyclerView.ViewHolder {
        TextView city;
        TextView temp;
        TextView description;
        TextView pressure;
        public WeatherViewHolder(@NonNull View itemView) {
            super(itemView);
            city = itemView.findViewById(R.id.text_city);
            temp = itemView.findViewById(R.id.text_temp);
            description = itemView.findViewById(R.id.text_description);
            pressure = itemView.findViewById(R.id.text_pressure);
        }
    }
}

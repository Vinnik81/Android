package com.example.json.models;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.json.R;

import java.util.Collection;
import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MovieViewHolder> {

    private List<Search> movies;
    private int templateLayout;
    private Context context;

    public MoviesAdapter(Context context, int templateLayout, List<Search> movies) {
        this.movies = movies;
        this.templateLayout = templateLayout;
        this.context = context;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(templateLayout, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        holder.title.setText(this.movies.get(position).title);
        holder.year.setText(this.movies.get(position).year);
        holder.title.setText(this.movies.get(position).title);
        Glide.with(context).load(this.movies.get(position).poster).into(holder.poster);
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public static class MovieViewHolder extends RecyclerView.ViewHolder {

        ImageView poster;
        TextView title;
        TextView year;
        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            poster = itemView.findViewById(R.id.image_poster);
            title = itemView.findViewById(R.id.text_title);
            year = itemView.findViewById(R.id.text_year);
        }
    }
}

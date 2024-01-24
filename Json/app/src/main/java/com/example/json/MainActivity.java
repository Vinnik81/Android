package com.example.json;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Movie;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.json.models.MovieApiResponse;
import com.example.json.models.MoviesAdapter;
import com.example.json.models.Search;
import com.example.json.utils.ApiClient;
import com.example.json.utils.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if (ApiClient.API_KEY.isEmpty()) {
            Toast.makeText(this, "Please obtain your API KEY from movie", Toast.LENGTH_SHORT).show();
           finish();
        }

        RecyclerView recyclerView = findViewById(R.id.recyler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<MovieApiResponse> call = apiService.getMovieByName("Hulk", ApiClient.API_KEY);
        call.enqueue(new Callback<MovieApiResponse>() {
            @Override
            public void onResponse(Call<MovieApiResponse> call, Response<MovieApiResponse> response) {
                List<Search> data = response.body().getSearch();
                Log.i("Test", "onResponse: " + response.body().getResponse());
                //                Log.i("faraid", "onResponse: " + response.body().getSearch().size());
                recyclerView.setAdapter(new MoviesAdapter(getApplicationContext(), R.layout.movie_item, data));
            }

            @Override
            public void onFailure(Call<MovieApiResponse> call, Throwable t) {
                Log.i("Test", "onFailure: " + t.getMessage());
            }
        });

        /*ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<MovieApiResponse> call = apiService.getMovieByName("Hulk", ApiClient.API_KEY);
        call.enqueue(new Callback<MovieApiResponse>() {
            @Override
            public void onResponse(Call<MovieApiResponse> call, Response<MovieApiResponse> response) {
                MovieApiResponse movieApiResponse;
//               int result = response.body().getSearch().size();
                Log.d("farid", "DA");
                Log.d("farid", response.body().response);
                movieApiResponse = response.body();
            }

            @Override
            public void onFailure(Call<MovieApiResponse> call, Throwable t) {
                Log.d("farid", t.toString());
            }
        });*/
    }
}
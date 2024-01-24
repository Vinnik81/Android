package com.example.json.utils;

import com.example.json.models.MovieApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    //?s=Spiderman&apikey=5b9b7798
    @GET("?")
    Call<MovieApiResponse> getMovieByName(@Query("s") String s, @Query("apikey") String apiKey);
}

package com.example.homework_json.utils;

import com.example.homework_json.models.Root;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
//    ?q=Omsk&appid=04f2dc1734de1dc82dc7ae8b28e8f96d&units=metric&lang=ru

    @GET("?")
    Call<Root> getWeather(@Query("q") String city, @Query("appid") String appid, @Query("units") String units, @Query("lang") String lang);
}

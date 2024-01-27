package com.example.homework_json.utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
//    https://api.openweathermap.org/data/2.5/weather?q=Omsk&appid=04f2dc1734de1dc82dc7ae8b28e8f96d&units=metric&lang=ru
    public static final String BASE_URL = "https://api.openweathermap.org/data/2.5/weather/";
    public static final String API_KEY = "04f2dc1734de1dc82dc7ae8b28e8f96d";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}

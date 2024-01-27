package com.example.homework_json;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.homework_json.models.Root;
import com.example.homework_json.models.Weather;
import com.example.homework_json.models.WeatherAdapter;
import com.example.homework_json.utils.ApiClient;
import com.example.homework_json.utils.ApiInterface;

import java.util.ArrayList;
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
            Toast.makeText(this, "Please obtain your API KEY from weather", Toast.LENGTH_SHORT).show();
            finish();
        }

        RecyclerView recyclerView = findViewById(R.id.recyler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Button button = findViewById(R.id.buttonSearch);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTextCity = findViewById(R.id.edit_city);
                String city = editTextCity.getText().toString().trim();

                if (city.isEmpty()) {
                    city = "Omsk";
                }

                Call<Root> call = apiInterface.getWeather(city, ApiClient.API_KEY, "metric", "ru");

                call.enqueue(new Callback<Root>() {
                    @Override
                    public void onResponse(Call<Root> call, Response<Root> response) {
                        Root data = response.body();
                        Log.i("Weather", "onResponse: " + response.body().getId());
                        if (data != null && data.getWeather() != null && !data.getWeather().isEmpty()) {
                            recyclerView.setAdapter(new WeatherAdapter(getApplicationContext(), R.layout.weather_item, data));
                        } else {
                            Toast.makeText(MainActivity.this, "No data", Toast.LENGTH_LONG).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<Root> call, Throwable t) {
                        Log.i("Weather", "onFailure" + t.getMessage());
                    }
                });
            }
        });

    }
}
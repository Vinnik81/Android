package com.example.homework_json.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Sys implements Serializable {
    @SerializedName("type")
    public int type;
    public int id;
    @SerializedName("country")
    public String country;
    @SerializedName("sunrise")
    public int sunrise;
    @SerializedName("sunset")
    public int sunset;

    public Sys(int type, int id, String country, int sunrise, int sunset) {
        this.type = type;
        this.id = id;
        this.country = country;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getSunrise() {
        return sunrise;
    }

    public void setSunrise(int sunrise) {
        this.sunrise = sunrise;
    }

    public int getSunset() {
        return sunset;
    }

    public void setSunset(int sunset) {
        this.sunset = sunset;
    }
}

package com.example.homework_json.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Coord implements Serializable {
    @SerializedName("lon")
    public double lon;
    @SerializedName("lat")
    public int lat;

    public Coord(double lon, int lat) {
        this.lon = lon;
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public int getLat() {
        return lat;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }
}

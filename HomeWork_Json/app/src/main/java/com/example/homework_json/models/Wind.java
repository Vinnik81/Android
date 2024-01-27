package com.example.homework_json.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Wind implements Serializable {
    @SerializedName("speed")
    public int speed;
    @SerializedName("deg")
    public int deg;

    public Wind(int speed, int deg) {
        this.speed = speed;
        this.deg = deg;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDeg() {
        return deg;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }
}

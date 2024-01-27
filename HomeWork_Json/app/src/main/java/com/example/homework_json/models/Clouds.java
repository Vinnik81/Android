package com.example.homework_json.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Clouds implements Serializable {
    @SerializedName("all")
    public int all;

    public Clouds(int all) {
        this.all = all;
    }

    public int getAll() {
        return all;
    }

    public void setAll(int all) {
        this.all = all;
    }
}

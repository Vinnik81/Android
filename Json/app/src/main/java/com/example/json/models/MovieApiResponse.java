package com.example.json.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class MovieApiResponse implements Serializable {
    @SerializedName("Search")
//    @Expose
    public ArrayList<Search> search;
//   @Expose
    public String totalResults;
    @SerializedName("Response")
//    @Expose
    public String response;

    public MovieApiResponse() {
    }

    public MovieApiResponse(ArrayList<Search> search, String totalResults, String response) {
        this.search = search;
        this.totalResults = totalResults;
        this.response = response;
    }

    public ArrayList<Search> getSearch() {
        return search;
    }

    public void setSearch(ArrayList<Search> search) {
        this.search = search;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}

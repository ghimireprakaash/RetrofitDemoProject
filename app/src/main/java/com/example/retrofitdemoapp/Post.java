package com.example.retrofitdemoapp;

import com.google.gson.annotations.SerializedName;

public class Post {

    private int userId;

    private int id;

    private String title;

    //If the variable name differ from the json object, an annotation can be given to match json object key name...
    @SerializedName("body")
    private String text;

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}

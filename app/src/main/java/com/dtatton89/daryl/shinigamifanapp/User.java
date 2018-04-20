package com.dtatton89.daryl.shinigamifanapp;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("login")
    private int id;

    @SerializedName("Name")
    private String Name;

    public User(){
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = Name;
    }
}

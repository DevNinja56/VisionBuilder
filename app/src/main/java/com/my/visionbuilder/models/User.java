package com.my.visionbuilder.models;

public class User {
    int id;
    String user_Image, user_Name;

    public User(int id, String user_Image, String user_Name) {
        this.id = id;
        this.user_Image = user_Image;
        this.user_Name = user_Name;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_Image() {
        return user_Image;
    }

    public void setUser_Image(String user_Image) {
        this.user_Image = user_Image;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }
}

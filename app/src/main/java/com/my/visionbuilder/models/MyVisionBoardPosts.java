package com.my.visionbuilder.models;

public class MyVisionBoardPosts {
    int id;
    String post_Image;

    public MyVisionBoardPosts(int id, String post_Image) {
        this.id = id;
        this.post_Image = post_Image;
    }

    public MyVisionBoardPosts() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPost_Image() {
        return post_Image;
    }

    public void setPost_Image(String post_Image) {
        this.post_Image = post_Image;
    }
}

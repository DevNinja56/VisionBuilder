package com.my.visionbuilder.models;

public class Post {
    int post_Id;
    String post_Image;

    public Post(int post_Id, String post_Image) {
        this.post_Id = post_Id;
        this.post_Image = post_Image;
    }

    public int getPost_Id() {
        return post_Id;
    }

    public void setPost_Id(int post_Id) {
        this.post_Id = post_Id;
    }

    public String getPost_Image() {
        return post_Image;
    }

    public void setPost_Image(String post_Image) {
        this.post_Image = post_Image;
    }
}

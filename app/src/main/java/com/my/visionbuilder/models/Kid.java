package com.my.visionbuilder.models;

public class Kid {
    int kid_Id;
    String kid_Name;

    public Kid(int kid_Id, String kid_Name) {
        this.kid_Id = kid_Id;
        this.kid_Name = kid_Name;
    }

    public Kid() {
    }

    public int getKid_Id() {
        return kid_Id;
    }

    public void setKid_Id(int kid_Id) {
        this.kid_Id = kid_Id;
    }

    public String getKid_Name() {
        return kid_Name;
    }

    public void setKid_Name(String kid_Name) {
        this.kid_Name = kid_Name;
    }
}

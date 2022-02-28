package com.my.visionbuilder.models;

public class Business {
    int business_Id;
    String business_Name;

    public Business() {
    }

    public Business(int business_Id, String business_Name) {
        this.business_Id = business_Id;
        this.business_Name = business_Name;
    }

    public int getBusiness_Id() {
        return business_Id;
    }

    public void setBusiness_Id(int business_Id) {
        this.business_Id = business_Id;
    }

    public String getBusiness_Name() {
        return business_Name;
    }

    public void setBusiness_Name(String business_Name) {
        this.business_Name = business_Name;
    }
}

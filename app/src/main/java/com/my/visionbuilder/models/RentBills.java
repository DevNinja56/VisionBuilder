package com.my.visionbuilder.models;

public class RentBills {
    int rent_Id;
    String rent_Month, rent_Price, rent_Description;

    public RentBills(int rent_Id, String rent_Month, String rent_Price, String rent_Description) {
        this.rent_Id = rent_Id;
        this.rent_Month = rent_Month;
        this.rent_Price = rent_Price;
        this.rent_Description = rent_Description;
    }

    public int getRent_Id() {
        return rent_Id;
    }

    public void setRent_Id(int rent_Id) {
        this.rent_Id = rent_Id;
    }

    public String getRent_Month() {
        return rent_Month;
    }

    public void setRent_Month(String rent_Month) {
        this.rent_Month = rent_Month;
    }

    public String getRent_Price() {
        return rent_Price;
    }

    public void setRent_Price(String rent_Price) {
        this.rent_Price = rent_Price;
    }

    public String getRent_Description() {
        return rent_Description;
    }

    public void setRent_Description(String rent_Description) {
        this.rent_Description = rent_Description;
    }
}

package com.my.visionbuilder.models;

public class Shopping {
    int id;
    String shopping_Type, hotel_Name, shop_Name, brand_Name, amount, date, address, description;

    public Shopping(int id, String shopping_Type, String hotel_Name, String shop_Name, String brand_Name, String amount, String date, String address, String description) {
        this.id = id;
        this.shopping_Type = shopping_Type;
        this.hotel_Name = hotel_Name;
        this.shop_Name = shop_Name;
        this.brand_Name = brand_Name;
        this.amount = amount;
        this.date = date;
        this.address = address;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShopping_Type() {
        return shopping_Type;
    }

    public void setShopping_Type(String shopping_Type) {
        this.shopping_Type = shopping_Type;
    }

    public String getHotel_Name() {
        return hotel_Name;
    }

    public void setHotel_Name(String hotel_Name) {
        this.hotel_Name = hotel_Name;
    }

    public String getShop_Name() {
        return shop_Name;
    }

    public void setShop_Name(String shop_Name) {
        this.shop_Name = shop_Name;
    }

    public String getBrand_Name() {
        return brand_Name;
    }

    public void setBrand_Name(String brand_Name) {
        this.brand_Name = brand_Name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

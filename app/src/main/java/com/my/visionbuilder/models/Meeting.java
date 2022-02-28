package com.my.visionbuilder.models;

public class Meeting {
    int id;
    String meeting_For, Address, City, State, zip_Code, phone_Number, details, select_Date;

    public Meeting(int id, String meeting_For, String address, String city, String state, String zip_Code, String phone_Number, String details, String select_Date) {
        this.id = id;
        this.meeting_For = meeting_For;
        Address = address;
        City = city;
        State = state;
        this.zip_Code = zip_Code;
        this.phone_Number = phone_Number;
        this.details = details;
        this.select_Date = select_Date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMeeting_For() {
        return meeting_For;
    }

    public void setMeeting_For(String meeting_For) {
        this.meeting_For = meeting_For;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZip_Code() {
        return zip_Code;
    }

    public void setZip_Code(String zip_Code) {
        this.zip_Code = zip_Code;
    }

    public String getPhone_Number() {
        return phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        this.phone_Number = phone_Number;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getSelect_Date() {
        return select_Date;
    }

    public void setSelect_Date(String select_Date) {
        this.select_Date = select_Date;
    }
}

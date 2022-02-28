package com.my.visionbuilder.models;

public class Vacation {
    int vacation_Item;
    String vacation_Destination, vacation_Details;

    public Vacation(int vacation_Item, String vacation_Destination, String vacation_Details) {
        this.vacation_Item = vacation_Item;
        this.vacation_Destination = vacation_Destination;
        this.vacation_Details = vacation_Details;
    }

    public Vacation() {
    }

    public int getVacation_Item() {
        return vacation_Item;
    }

    public void setVacation_Item(int vacation_Item) {
        this.vacation_Item = vacation_Item;
    }

    public String getVacation_Destination() {
        return vacation_Destination;
    }

    public void setVacation_Destination(String vacation_Destination) {
        this.vacation_Destination = vacation_Destination;
    }

    public String getVacation_Details() {
        return vacation_Details;
    }

    public void setVacation_Details(String vacation_Details) {
        this.vacation_Details = vacation_Details;
    }
}

package com.my.visionbuilder.models;

public class Transportation {
    int id;
    String transportation_Type, starting_Point, destination, location, maintenance_For, cost, date, time;

    public Transportation(int id, String starting_Point, String destination, String location, String maintenance_For, String cost, String date, String time, String transportation_Type) {
        this.id = id;
        this.starting_Point = starting_Point;
        this.destination = destination;
        this.location = location;
        this.maintenance_For = maintenance_For;
        this.cost = cost;
        this.date = date;
        this.time = time;
        this.transportation_Type = transportation_Type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTransportation_Type() {
        return transportation_Type;
    }

    public void setTransportation_Type(String transportation_Type) {
        this.transportation_Type = transportation_Type;
    }

    public String getStarting_Point() {
        return starting_Point;
    }

    public void setStarting_Point(String starting_Point) {
        this.starting_Point = starting_Point;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMaintenance_For() {
        return maintenance_For;
    }

    public void setMaintenance_For(String maintenance_For) {
        this.maintenance_For = maintenance_For;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

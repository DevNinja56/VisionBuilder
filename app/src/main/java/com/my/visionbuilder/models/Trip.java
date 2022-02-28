package com.my.visionbuilder.models;

public class Trip {
    private int trip_Id;
    private String trip_StartingPoint, trip_Destination, trip_DepartureDate, trip_DepartureTime, trip_ReturnDate, trip_ReturnTime;

    public Trip(int trip_Id, String trip_StartingPoint, String trip_Destination, String trip_DepartureDate,
                String trip_DepartureTime, String trip_ReturnDate, String trip_ReturnTime) {
        this.trip_Id = trip_Id;
        this.trip_StartingPoint = trip_StartingPoint;
        this.trip_Destination = trip_Destination;
        this.trip_DepartureDate = trip_DepartureDate;
        this.trip_DepartureTime = trip_DepartureTime;
        this.trip_ReturnDate = trip_ReturnDate;
        this.trip_ReturnTime = trip_ReturnTime;
    }

    public Trip() {
    }

    public int getTrip_Id() {
        return trip_Id;
    }

    public void setTrip_Id(int trip_Id) {
        this.trip_Id = trip_Id;
    }

    public String getTrip_StartingPoint() {
        return trip_StartingPoint;
    }

    public void setTrip_StartingPoint(String trip_StartingPoint) {
        this.trip_StartingPoint = trip_StartingPoint;
    }

    public String getTrip_Destination() {
        return trip_Destination;
    }

    public void setTrip_Destination(String trip_Destination) {
        this.trip_Destination = trip_Destination;
    }

    public String getTrip_DepartureDate() {
        return trip_DepartureDate;
    }

    public void setTrip_DepartureDate(String trip_DepartureDate) {
        this.trip_DepartureDate = trip_DepartureDate;
    }

    public String getTrip_DepartureTime() {
        return trip_DepartureTime;
    }

    public void setTrip_DepartureTime(String trip_DepartureTime) {
        this.trip_DepartureTime = trip_DepartureTime;
    }

    public String getTrip_ReturnDate() {
        return trip_ReturnDate;
    }

    public void setTrip_ReturnDate(String trip_ReturnDate) {
        this.trip_ReturnDate = trip_ReturnDate;
    }

    public String getTrip_ReturnTime() {
        return trip_ReturnTime;
    }

    public void setTrip_ReturnTime(String trip_ReturnTime) {
        this.trip_ReturnTime = trip_ReturnTime;
    }
}

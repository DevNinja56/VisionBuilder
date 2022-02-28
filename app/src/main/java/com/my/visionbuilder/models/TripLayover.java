package com.my.visionbuilder.models;

public class TripLayover {
    int trip_LayoverId;
    String place;
    String arrived_Time;
    String departure_Time;
    String bus_No;
    String gate_No;
    String flight_No;

    public TripLayover(int trip_LayoverId, String place, String arrived_Time,
                       String departure_Time, String bus_No, String gate_No, String flight_No) {
        this.trip_LayoverId = trip_LayoverId;
        this.place = place;
        this.arrived_Time = arrived_Time;
        this.departure_Time = departure_Time;
        this.bus_No = bus_No;
        this.gate_No = gate_No;
        this.flight_No = flight_No;
    }

    public int getTrip_LayoverId() {
        return trip_LayoverId;
    }

    public void setTrip_LayoverId(int trip_LayoverId) {
        this.trip_LayoverId = trip_LayoverId;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getArrived_Time() {
        return arrived_Time;
    }

    public void setArrived_Time(String arrived_Time) {
        this.arrived_Time = arrived_Time;
    }

    public String getDeparture_Time() {
        return departure_Time;
    }

    public void setDeparture_Time(String departure_Time) {
        this.departure_Time = departure_Time;
    }

    public String getBus_No() {
        return bus_No;
    }

    public void setBus_No(String bus_No) {
        this.bus_No = bus_No;
    }

    public String getGate_No() {
        return gate_No;
    }

    public void setGate_No(String gate_No) {
        this.gate_No = gate_No;
    }

    public String getFlight_No() {
        return flight_No;
    }

    public void setFlight_No(String flight_No) {
        this.flight_No = flight_No;
    }
}

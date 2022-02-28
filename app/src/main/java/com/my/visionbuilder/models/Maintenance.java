package com.my.visionbuilder.models;

public class Maintenance {
    int maintenance_Id;
    String maintenance_For, maintenance_Price, maintenance_Date, maintenance_Description;

    public Maintenance(int maintenance_Id, String maintenance_For, String maintenance_Price, String maintenance_Date,
                       String maintenance_Description) {
        this.maintenance_Id = maintenance_Id;
        this.maintenance_For = maintenance_For;
        this.maintenance_Price = maintenance_Price;
        this.maintenance_Date = maintenance_Date;
        this.maintenance_Description = maintenance_Description;
    }

    public int getMaintenance_Id() {
        return maintenance_Id;
    }

    public void setMaintenance_Id(int maintenance_Id) {
        this.maintenance_Id = maintenance_Id;
    }

    public String getMaintenance_For() {
        return maintenance_For;
    }

    public void setMaintenance_For(String maintenance_For) {
        this.maintenance_For = maintenance_For;
    }

    public String getMaintenance_Price() {
        return maintenance_Price;
    }

    public void setMaintenance_Price(String maintenance_Price) {
        this.maintenance_Price = maintenance_Price;
    }

    public String getMaintenance_Date() {
        return maintenance_Date;
    }

    public void setMaintenance_Date(String maintenance_Date) {
        this.maintenance_Date = maintenance_Date;
    }

    public String getMaintenance_Description() {
        return maintenance_Description;
    }

    public void setMaintenance_Description(String maintenance_Description) {
        this.maintenance_Description = maintenance_Description;
    }
}

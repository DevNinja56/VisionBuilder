package com.my.visionbuilder.models;

public class CableBills {
    int cable_Id;
    String cable_Month, cable_Bill, cable_BillDescription;

    public CableBills(int cable_Id, String cable_Month, String cable_Bill, String cable_BillDescription) {
        this.cable_Id = cable_Id;
        this.cable_Month = cable_Month;
        this.cable_Bill = cable_Bill;
        this.cable_BillDescription = cable_BillDescription;
    }

    public int getCable_Id() {
        return cable_Id;
    }

    public void setCable_Id(int cable_Id) {
        this.cable_Id = cable_Id;
    }

    public String getCable_Month() {
        return cable_Month;
    }

    public void setCable_Month(String cable_Month) {
        this.cable_Month = cable_Month;
    }

    public String getCable_Bill() {
        return cable_Bill;
    }

    public void setCable_Bill(String cable_Bill) {
        this.cable_Bill = cable_Bill;
    }

    public String getCable_BillDescription() {
        return cable_BillDescription;
    }

    public void setCable_BillDescription(String cable_BillDescription) {
        this.cable_BillDescription = cable_BillDescription;
    }
}

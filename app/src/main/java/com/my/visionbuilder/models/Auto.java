package com.my.visionbuilder.models;

public class Auto {
    int auto_Id;
    String auto_RegNo;

    public Auto() {
    }

    public Auto(int auto_Id, String auto_RegNo) {
        this.auto_Id = auto_Id;
        this.auto_RegNo = auto_RegNo;
    }

    public int getCar_Id() {
        return auto_Id;
    }

    public void setCar_Id(int auto_Id) {
        this.auto_Id = auto_Id;
    }

    public String getCar_RegNo() {
        return auto_RegNo;
    }

    public void setCar_RegNo(String auto_RegNo) {
        this.auto_RegNo = auto_RegNo;
    }
}

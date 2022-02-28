package com.my.visionbuilder.models;

public class Holiday {
    int holiday_Id;
    String holiday_Name;

    public Holiday() {
    }

    public Holiday(int holiday_Id, String holiday_Name) {
        this.holiday_Id = holiday_Id;
        this.holiday_Name = holiday_Name;
    }

    public int getHoliday_Id() {
        return holiday_Id;
    }

    public void setHoliday_Id(int holiday_Id) {
        this.holiday_Id = holiday_Id;
    }

    public String getHoliday_Name() {
        return holiday_Name;
    }

    public void setHoliday_Name(String holiday_Name) {
        this.holiday_Name = holiday_Name;
    }
}

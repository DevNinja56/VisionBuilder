package com.my.visionbuilder.models;

public class Reminder {
    int reminder_Id;
    String reminder_Title, reminder_Date, reminder_Time, reminder_Details, reminder_RemindMeBefore;


    public Reminder(int reminder_Id, String reminder_Title, String reminder_Date,
                    String reminder_Time, String reminder_Details, String reminder_RemindMeBefore) {
        this.reminder_Id = reminder_Id;
        this.reminder_Title = reminder_Title;
        this.reminder_Date = reminder_Date;
        this.reminder_Time = reminder_Time;
        this.reminder_Details = reminder_Details;
        this.reminder_RemindMeBefore = reminder_RemindMeBefore;
    }

    public int getReminder_Id() {
        return reminder_Id;
    }

    public void setReminder_Id(int reminder_Id) {
        this.reminder_Id = reminder_Id;
    }

    public String getReminder_Title() {
        return reminder_Title;
    }

    public void setReminder_Title(String reminder_Title) {
        this.reminder_Title = reminder_Title;
    }

    public String getReminder_Date() {
        return reminder_Date;
    }

    public void setReminder_Date(String reminder_Date) {
        this.reminder_Date = reminder_Date;
    }

    public String getReminder_Time() {
        return reminder_Time;
    }

    public void setReminder_Time(String reminder_Time) {
        this.reminder_Time = reminder_Time;
    }

    public String getReminder_Details() {
        return reminder_Details;
    }

    public void setReminder_Details(String reminder_Details) {
        this.reminder_Details = reminder_Details;
    }

    public String getReminder_RemindMeBefore() {
        return reminder_RemindMeBefore;
    }

    public void setReminder_RemindMeBefore(String reminder_RemindMeBefore) {
        this.reminder_RemindMeBefore = reminder_RemindMeBefore;
    }

}

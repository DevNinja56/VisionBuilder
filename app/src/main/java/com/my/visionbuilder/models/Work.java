package com.my.visionbuilder.models;

public class Work {
    int work_Id;
    String work_Title, work_Details;

    public Work(int work_Id, String work_Title, String work_Details) {
        this.work_Id = work_Id;
        this.work_Title = work_Title;
        this.work_Details = work_Details;
    }

    public Work() {
    }

    public int getWork_Id() {
        return work_Id;
    }

    public void setWork_Id(int work_Id) {
        this.work_Id = work_Id;
    }

    public String getWork_Title() {
        return work_Title;
    }

    public void setWork_Title(String work_Title) {
        this.work_Title = work_Title;
    }

    public String getWork_Details() {
        return work_Details;
    }

    public void setWork_Details(String work_Details) {
        this.work_Details = work_Details;
    }
}

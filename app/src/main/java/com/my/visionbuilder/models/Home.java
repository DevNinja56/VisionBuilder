package com.my.visionbuilder.models;

public class Home {
    int home_Id;
    String home_Name, home_Address;

    public Home() {
    }

    public Home(int home_Id, String home_Name, String home_Address) {
        this.home_Id = home_Id;
        this.home_Name = home_Name;
        this.home_Address = home_Address;
    }

    public int getHome_Id() {
        return home_Id;
    }

    public void setHome_Id(int home_Id) {
        this.home_Id = home_Id;
    }

    public String getHome_Name() {
        return home_Name;
    }

    public void setHome_Name(String home_Name) {
        this.home_Name = home_Name;
    }

    public String getHome_Address() {
        return home_Address;
    }

    public void setHome_Address(String home_Address) {
        this.home_Address = home_Address;
    }
}

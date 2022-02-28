package com.my.visionbuilder.models;

public class BusinessNavigation {
    int navigation_Icon;
    String navigation_Title, details;

    public BusinessNavigation(int navigation_Icon, String navigation_Title, String details) {
        this.navigation_Icon = navigation_Icon;
        this.navigation_Title = navigation_Title;
        this.details = details;
    }

    public int getNavigation_Icon() {
        return navigation_Icon;
    }

    public void setNavigation_Icon(int navigation_Icon) {
        this.navigation_Icon = navigation_Icon;
    }

    public String getNavigation_Title() {
        return navigation_Title;
    }

    public void setNavigation_Title(String navigation_Title) {
        this.navigation_Title = navigation_Title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

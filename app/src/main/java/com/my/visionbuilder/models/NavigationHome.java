package com.my.visionbuilder.models;

public class NavigationHome {
    int navigation_Icon;
    String navigation_Title, number;

    public NavigationHome(int navigation_Icon, String navigation_Title, String number) {
        this.navigation_Icon = navigation_Icon;
        this.navigation_Title = navigation_Title;
        this.number = number;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

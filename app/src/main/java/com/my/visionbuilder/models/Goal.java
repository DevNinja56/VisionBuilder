package com.my.visionbuilder.models;

public class Goal {
    int goal_Id;
    String goal_Type, goal_For, goal_Details;

    public Goal(int goal_Id, String goal_Type, String goal_For, String goal_Details) {
        this.goal_Id = goal_Id;
        this.goal_Type = goal_Type;
        this.goal_For = goal_For;
        this.goal_Details = goal_Details;
    }

    public int getGoal_Id() {
        return goal_Id;
    }

    public void setGoal_Id(int goal_Id) {
        this.goal_Id = goal_Id;
    }

    public String getGoal_Type() {
        return goal_Type;
    }

    public void setGoal_Type(String goal_Type) {
        this.goal_Type = goal_Type;
    }

    public String getGoal_For() {
        return goal_For;
    }

    public void setGoal_For(String goal_For) {
        this.goal_For = goal_For;
    }

    public String getGoal_Details() {
        return goal_Details;
    }

    public void setGoal_Details(String goal_Details) {
        this.goal_Details = goal_Details;
    }
}

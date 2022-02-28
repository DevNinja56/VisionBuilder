package com.my.visionbuilder.models;

public class Person {
    int person_Id;
    String person_Name;

    public Person() {
    }

    public Person(int person_Id, String person_Name) {
        this.person_Id = person_Id;
        this.person_Name = person_Name;
    }

    public int getPerson_Id() {
        return person_Id;
    }

    public void setPerson_Id(int person_Id) {
        this.person_Id = person_Id;
    }

    public String getPerson_Name() {
        return person_Name;
    }

    public void setPerson_Name(String person_Name) {
        this.person_Name = person_Name;
    }
}

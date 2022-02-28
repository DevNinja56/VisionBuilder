package com.my.visionbuilder.models;

public class Tuition {
    int tuition_Id;
    String tuition_Name, tuition_Contact, tuition_Address;

    public Tuition(int tuition_Id, String tuition_Name, String tuition_Contact, String tuition_Address) {
        this.tuition_Id = tuition_Id;
        this.tuition_Name = tuition_Name;
        this.tuition_Contact = tuition_Contact;
        this.tuition_Address = tuition_Address;
    }

    public Tuition() {
    }

    public int getTuition_Id() {
        return tuition_Id;
    }

    public void setTuition_Id(int tuition_Id) {
        this.tuition_Id = tuition_Id;
    }

    public String getTuition_Name() {
        return tuition_Name;
    }

    public void setTuition_Name(String tuition_Name) {
        this.tuition_Name = tuition_Name;
    }

    public String getTuition_Contact() {
        return tuition_Contact;
    }

    public void setTuition_Contact(String tuition_Contact) {
        this.tuition_Contact = tuition_Contact;
    }

    public String getTuition_Address() {
        return tuition_Address;
    }

    public void setTuition_Address(String tuition_Address) {
        this.tuition_Address = tuition_Address;
    }
}

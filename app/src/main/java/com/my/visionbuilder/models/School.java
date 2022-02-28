package com.my.visionbuilder.models;

public class School {
    int school_Id;
    String school_Address, school_Contact, school_KidBadgeNo;

    public School() {
    }

    public School(int school_Id, String school_Address, String school_Contact, String school_KidBadgeNo) {
        this.school_Id = school_Id;
        this.school_Address = school_Address;
        this.school_Contact = school_Contact;
        this.school_KidBadgeNo = school_KidBadgeNo;
    }

    public int getSchool_Id() {
        return school_Id;
    }

    public void setSchool_Id(int school_Id) {
        this.school_Id = school_Id;
    }

    public String getSchool_Address() {
        return school_Address;
    }

    public void setSchool_Address(String school_Address) {
        this.school_Address = school_Address;
    }

    public String getSchool_Contact() {
        return school_Contact;
    }

    public void setSchool_Contact(String school_Contact) {
        this.school_Contact = school_Contact;
    }

    public String getSchool_KidBadgeNo() {
        return school_KidBadgeNo;
    }

    public void setSchool_KidBadgeNo(String school_KidBadgeNo) {
        this.school_KidBadgeNo = school_KidBadgeNo;
    }
}

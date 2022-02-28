package com.my.visionbuilder.models;

public class SchoolClass {
    int class_Id;
    String class_Time, class_Subject, class_Notes;

    public SchoolClass() {
    }

    public SchoolClass(int class_Id, String class_Time, String class_Subject, String class_Notes) {
        this.class_Id = class_Id;
        this.class_Time = class_Time;
        this.class_Subject = class_Subject;
        this.class_Notes = class_Notes;
    }

    public int getClass_Id() {
        return class_Id;
    }

    public void setClass_Id(int class_Id) {
        this.class_Id = class_Id;
    }

    public String getClass_Time() {
        return class_Time;
    }

    public void setClass_Time(String class_Time) {
        this.class_Time = class_Time;
    }

    public String getClass_Subject() {
        return class_Subject;
    }

    public void setClass_Subject(String class_Subject) {
        this.class_Subject = class_Subject;
    }

    public String getClass_Notes() {
        return class_Notes;
    }

    public void setClass_Notes(String class_Notes) {
        this.class_Notes = class_Notes;
    }
}

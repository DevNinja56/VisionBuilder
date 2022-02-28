package com.my.visionbuilder.models;

public class Teacher {
    int teacher_Id;
    String teacher_Name, teacher_Subject, teacher_Contact;

    public Teacher() {
    }

    public Teacher(int teacher_Id, String teacher_Name, String teacher_Subject, String teacher_Contact) {
        this.teacher_Id = teacher_Id;
        this.teacher_Name = teacher_Name;
        this.teacher_Subject = teacher_Subject;
        this.teacher_Contact = teacher_Contact;
    }

    public int getTeacher_Id() {
        return teacher_Id;
    }

    public void setTeacher_Id(int teacher_Id) {
        this.teacher_Id = teacher_Id;
    }

    public String getTeacher_Name() {
        return teacher_Name;
    }

    public void setTeacher_Name(String teacher_Name) {
        this.teacher_Name = teacher_Name;
    }

    public String getTeacher_Subject() {
        return teacher_Subject;
    }

    public void setTeacher_Subject(String teacher_Subject) {
        this.teacher_Subject = teacher_Subject;
    }

    public String getTeacher_Contact() {
        return teacher_Contact;
    }

    public void setTeacher_Contact(String teacher_Contact) {
        this.teacher_Contact = teacher_Contact;
    }
}

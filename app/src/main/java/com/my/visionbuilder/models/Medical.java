package com.my.visionbuilder.models;

public class Medical {
    int id;
    String medical_Type, family_MemberName, medical_date, medical_time, medical_Amount, medical_Description;

    public Medical(int id, String medical_Type, String family_MemberName, String medical_date, String medical_time,
                   String medical_Amount, String medical_Description) {
        this.id = id;
        this.medical_Type = medical_Type;
        this.family_MemberName = family_MemberName;
        this.medical_date = medical_date;
        this.medical_time = medical_time;
        this.medical_Amount = medical_Amount;
        this.medical_Description = medical_Description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMedical_Type() {
        return medical_Type;
    }

    public void setMedical_Type(String medical_Type) {
        this.medical_Type = medical_Type;
    }

    public String getFamily_MemberName() {
        return family_MemberName;
    }

    public void setFamily_MemberName(String family_MemberName) {
        this.family_MemberName = family_MemberName;
    }

    public String getMedical_date() {
        return medical_date;
    }

    public void setMedical_date(String medical_date) {
        this.medical_date = medical_date;
    }

    public String getMedical_time() {
        return medical_time;
    }

    public void setMedical_time(String medical_time) {
        this.medical_time = medical_time;
    }

    public String getMedical_Amount() {
        return medical_Amount;
    }

    public void setMedical_Amount(String medical_Amount) {
        this.medical_Amount = medical_Amount;
    }

    public String getMedical_Description() {
        return medical_Description;
    }

    public void setMedical_Description(String medical_Description) {
        this.medical_Description = medical_Description;
    }
}

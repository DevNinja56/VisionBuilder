package com.my.visionbuilder.models;

public class Insurance {
    int insurance_Id;
    String insurance_For, insurance_Company, term_startingDate, term_endingDate, notes;

    public Insurance(int insurance_Id, String insurance_For, String insurance_Company,
                     String term_startingDate, String term_endingDate, String notes) {
        this.insurance_Id = insurance_Id;
        this.insurance_For = insurance_For;
        this.insurance_Company = insurance_Company;
        this.term_startingDate = term_startingDate;
        this.term_endingDate = term_endingDate;
        this.notes = notes;
    }

    public int getInsurance_Id() {
        return insurance_Id;
    }

    public void setInsurance_Id(int insurance_Id) {
        this.insurance_Id = insurance_Id;
    }

    public String getInsurance_For() {
        return insurance_For;
    }

    public void setInsurance_For(String insurance_For) {
        this.insurance_For = insurance_For;
    }

    public String getInsurance_Company() {
        return insurance_Company;
    }

    public void setInsurance_Company(String insurance_Company) {
        this.insurance_Company = insurance_Company;
    }

    public String getTerm_startingDate() {
        return term_startingDate;
    }

    public void setTerm_startingDate(String term_startingDate) {
        this.term_startingDate = term_startingDate;
    }

    public String getTerm_endingDate() {
        return term_endingDate;
    }

    public void setTerm_endingDate(String term_endingDate) {
        this.term_endingDate = term_endingDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}

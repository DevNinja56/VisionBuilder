package com.my.visionbuilder.models;

public class Loan {
    int id;
    String loan_Type, loan_From, loan_BorrowDate, loan_DueDate, loan_Amount, loan_Interest, loan_Description;

    public Loan(int id, String loan_Type, String loan_From, String loan_BorrowDate, String loan_DueDate, String loan_Amount, String loan_Interest, String loan_Description) {
        this.id = id;
        this.loan_Type = loan_Type;
        this.loan_From = loan_From;
        this.loan_BorrowDate = loan_BorrowDate;
        this.loan_DueDate = loan_DueDate;
        this.loan_Amount = loan_Amount;
        this.loan_Interest = loan_Interest;
        this.loan_Description = loan_Description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoan_Type() {
        return loan_Type;
    }

    public void setLoan_Type(String loan_Type) {
        this.loan_Type = loan_Type;
    }

    public String getLoan_From() {
        return loan_From;
    }

    public void setLoan_From(String loan_From) {
        this.loan_From = loan_From;
    }

    public String getLoan_BorrowDate() {
        return loan_BorrowDate;
    }

    public void setLoan_BorrowDate(String loan_BorrowDate) {
        this.loan_BorrowDate = loan_BorrowDate;
    }

    public String getLoan_DueDate() {
        return loan_DueDate;
    }

    public void setLoan_DueDate(String loan_DueDate) {
        this.loan_DueDate = loan_DueDate;
    }

    public String getLoan_Amount() {
        return loan_Amount;
    }

    public void setLoan_Amount(String loan_Amount) {
        this.loan_Amount = loan_Amount;
    }

    public String getLoan_Interest() {
        return loan_Interest;
    }

    public void setLoan_Interest(String loan_Interest) {
        this.loan_Interest = loan_Interest;
    }

    public String getLoan_Description() {
        return loan_Description;
    }

    public void setLoan_Description(String loan_Description) {
        this.loan_Description = loan_Description;
    }
}

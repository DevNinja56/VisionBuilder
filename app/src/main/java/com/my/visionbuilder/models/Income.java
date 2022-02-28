package com.my.visionbuilder.models;

public class Income {
    int income_Id;
    String income_Type, source_Name, date, amount, net, gross;

    public Income(int income_Id, String income_Type, String source_Name, String date, String amount, String net, String gross) {
        this.income_Id = income_Id;
        this.income_Type = income_Type;
        this.source_Name = source_Name;
        this.date = date;
        this.amount = amount;
        this.net = net;
        this.gross = gross;
    }

    public Income() {
    }

    public int getIncome_Id() {
        return income_Id;
    }

    public void setIncome_Id(int income_Id) {
        this.income_Id = income_Id;
    }

    public String getIncome_Type() {
        return income_Type;
    }

    public void setIncome_Type(String income_Type) {
        this.income_Type = income_Type;
    }

    public String getSource_Name() {
        return source_Name;
    }

    public void setSource_Name(String source_Name) {
        this.source_Name = source_Name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getNet() {
        return net;
    }

    public void setNet(String net) {
        this.net = net;
    }

    public String getGross() {
        return gross;
    }

    public void setGross(String gross) {
        this.gross = gross;
    }
}

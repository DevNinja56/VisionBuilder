package com.my.visionbuilder.models;

public class IncomeType {
    int incomeType_Id;
    String income_Type;

    public IncomeType() {
    }

    public IncomeType(int incomeType_Id, String income_Type) {
        this.incomeType_Id = incomeType_Id;
        this.income_Type = income_Type;
    }

    public int getIncomeType_Id() {
        return incomeType_Id;
    }

    public void setIncomeType_Id(int incomeType_Id) {
        this.incomeType_Id = incomeType_Id;
    }

    public String getIncome_Type() {
        return income_Type;
    }

    public void setIncome_Type(String income_Type) {
        this.income_Type = income_Type;
    }
}

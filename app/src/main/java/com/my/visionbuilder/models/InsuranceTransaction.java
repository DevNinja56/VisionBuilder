package com.my.visionbuilder.models;

public class InsuranceTransaction {
    int insurance_TransactionId;
    String insurance_Type;
    String insurance_TransactionDate;
    String insurance_TransactionAmount;

    public InsuranceTransaction(int insurance_TransactionId, String insurance_Type, String insurance_TransactionDate,
                                String insurance_TransactionAmount) {
        this.insurance_TransactionId = insurance_TransactionId;
        this.insurance_Type = insurance_Type;
        this.insurance_TransactionDate = insurance_TransactionDate;
        this.insurance_TransactionAmount = insurance_TransactionAmount;
    }

    public int getInsurance_TransactionId() {
        return insurance_TransactionId;
    }

    public void setInsurance_TransactionId(int insurance_TransactionId) {
        this.insurance_TransactionId = insurance_TransactionId;
    }

    public String getInsurance_Type() {
        return insurance_Type;
    }

    public void setInsurance_Type(String insurance_Type) {
        this.insurance_Type = insurance_Type;
    }

    public String getInsurance_TransactionDate() {
        return insurance_TransactionDate;
    }

    public void setInsurance_TransactionDate(String insurance_TransactionDate) {
        this.insurance_TransactionDate = insurance_TransactionDate;
    }

    public String getInsurance_TransactionAmount() {
        return insurance_TransactionAmount;
    }

    public void setInsurance_TransactionAmount(String insurance_TransactionAmount) {
        this.insurance_TransactionAmount = insurance_TransactionAmount;
    }
}

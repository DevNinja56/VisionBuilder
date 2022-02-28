package com.my.visionbuilder.models;

public class SavingPlanTransaction {
    int saving_PlanTransactionId;
    String source_Name, input, output, amount;

    public SavingPlanTransaction() {
    }

    public SavingPlanTransaction(int saving_PlanTransactionId, String source_Name, String input, String output, String amount) {
        this.saving_PlanTransactionId = saving_PlanTransactionId;
        this.source_Name = source_Name;
        this.input = input;
        this.output = output;
        this.amount = amount;
    }

    public int getSaving_PlanTransactionId() {
        return saving_PlanTransactionId;
    }

    public void setSaving_PlanTransactionId(int saving_PlanTransactionId) {
        this.saving_PlanTransactionId = saving_PlanTransactionId;
    }

    public String getSource_Name() {
        return source_Name;
    }

    public void setSource_Name(String source_Name) {
        this.source_Name = source_Name;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}

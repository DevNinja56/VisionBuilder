package com.my.visionbuilder.models;

public class BankingTransaction {
    int transaction_Id;
    String transaction_Type, transaction_Title, transaction_SenderName, transaction_ReceiverName, transaction_Amount,
            transaction_Date, transaction_Time;

    public BankingTransaction(int transaction_Id, String transaction_Type, String transaction_Title, String transaction_SenderName,
                              String transaction_ReceiverName, String transaction_Amount, String transaction_Date, String transaction_Time) {
        this.transaction_Id = transaction_Id;
        this.transaction_Type = transaction_Type;
        this.transaction_Title = transaction_Title;
        this.transaction_SenderName = transaction_SenderName;
        this.transaction_ReceiverName = transaction_ReceiverName;
        this.transaction_Amount = transaction_Amount;
        this.transaction_Date = transaction_Date;
        this.transaction_Time = transaction_Time;
    }

    public BankingTransaction() {
    }

    public int getTransaction_Id() {
        return transaction_Id;
    }

    public void setTransaction_Id(int transaction_Id) {
        this.transaction_Id = transaction_Id;
    }

    public String getTransaction_Type() {
        return transaction_Type;
    }

    public void setTransaction_Type(String transaction_Type) {
        this.transaction_Type = transaction_Type;
    }

    public String getTransaction_Title() {
        return transaction_Title;
    }

    public void setTransaction_Title(String transaction_Title) {
        this.transaction_Title = transaction_Title;
    }

    public String getTransaction_SenderName() {
        return transaction_SenderName;
    }

    public void setTransaction_SenderName(String transaction_SenderName) {
        this.transaction_SenderName = transaction_SenderName;
    }

    public String getTransaction_ReceiverName() {
        return transaction_ReceiverName;
    }

    public void setTransaction_ReceiverName(String transaction_ReceiverName) {
        this.transaction_ReceiverName = transaction_ReceiverName;
    }

    public String getTransaction_Amount() {
        return transaction_Amount;
    }

    public void setTransaction_Amount(String transaction_Amount) {
        this.transaction_Amount = transaction_Amount;
    }

    public String getTransaction_Date() {
        return transaction_Date;
    }

    public void setTransaction_Date(String transaction_Date) {
        this.transaction_Date = transaction_Date;
    }

    public String getTransaction_Time() {
        return transaction_Time;
    }

    public void setTransaction_Time(String transaction_Time) {
        this.transaction_Time = transaction_Time;
    }
}

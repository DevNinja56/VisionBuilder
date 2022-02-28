package com.my.visionbuilder.models;

public class StockAndBond {
    int stockAndBond_Id;
    String source_Name, date_OfInvestment, description;

    public StockAndBond() {
    }

    public StockAndBond(int stockAndBond_Id, String source_Name, String date_OfInvestment, String description) {
        this.stockAndBond_Id = stockAndBond_Id;
        this.source_Name = source_Name;
        this.date_OfInvestment = date_OfInvestment;
        this.description = description;
    }

    public int getStockAndBond_Id() {
        return stockAndBond_Id;
    }

    public void setStockAndBond_Id(int stockAndBond_Id) {
        this.stockAndBond_Id = stockAndBond_Id;
    }

    public String getSource_Name() {
        return source_Name;
    }

    public void setSource_Name(String source_Name) {
        this.source_Name = source_Name;
    }

    public String getDate_OfInvestment() {
        return date_OfInvestment;
    }

    public void setDate_OfInvestment(String date_OfInvestment) {
        this.date_OfInvestment = date_OfInvestment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

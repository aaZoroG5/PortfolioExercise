package com.pluralsight.finance;

public abstract class FixedAssets implements Valuable{

    //properties
    private String name;
    private double marketValue;

    //constructor
    public FixedAssets(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    //getter/setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }

    public double getValue(){
        return this.getMarketValue();
    }

}

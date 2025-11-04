package com.pluralsight.finance;

public class Jewelry extends FixedAssets{

    //properties
    private double karat;

    //constructor
    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }

    //getters/setters
    public double getKarat() {
        return karat;
    }

    public void setKarat(double karat) {
        this.karat = karat;
    }

    @Override
    public double getValue(){
        return this.getMarketValue() + (karat * 200);
    }
}

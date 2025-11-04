package com.pluralsight.finance;

public class Gold extends FixedAssets{

    //properties
    private double weight;

    //constructor
    public Gold(String name, double marketValue, double weight) {
        super(name, marketValue);
        this.weight = weight;
    }

    //getters/setters
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getValue(){
        return this.getMarketValue() + (weight * 128.58); //128.58/gram of gold
    }
}

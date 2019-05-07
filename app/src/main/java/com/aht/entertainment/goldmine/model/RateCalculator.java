package com.aht.entertainment.goldmine.model;

public class RateCalculator {

    public RateCalculator() {

    }

    public long getCost(int rate, int quantity, int extraTax) {
        return ((rate * quantity) * (100 + extraTax)) / 100;
    }

    public long getCost(long rate, long quantity, int extraTax) {
        return ((rate * quantity) * (100 + extraTax)) / 100;
    }

    public double getCost(float rate, float quantity, float extraTax) {
        return ((rate * quantity) * (100 + extraTax)) / 100;
    }

    public double getCost(double rate, double quantity, float extraTax) {
        return ((rate * quantity) * (100 + extraTax)) / 100;
    }


    public long getCost(int rate, int quantity) {
        return getCost(rate, quantity, 0);
    }

    public long getCost(long rate, long quantity) {
        return getCost(rate, quantity, 0);
    }

    public double getCost(float rate, float quantity) {
        return getCost(rate, quantity, 0.0f);
    }

    public double getCost(double rate, double quantity) {
        return getCost(rate, quantity, 0.0f);
    }
}

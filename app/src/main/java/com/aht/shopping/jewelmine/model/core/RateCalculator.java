package com.aht.shopping.jewelmine.model.core;

public abstract class RateCalculator {

    protected RateCalculator() {

    }

    protected double getCost(float rate, float quantity, float extraTax) {

        if(rate < 0.0f || quantity < 0.0f || extraTax < 0.0f) {
            return Double.POSITIVE_INFINITY;
        }

        return ((rate * quantity) * (100 + extraTax)) / 100;
    }

    protected double getCost(float rate, float quantity) {
        return getCost(rate, quantity, 0.0f);
    }

}

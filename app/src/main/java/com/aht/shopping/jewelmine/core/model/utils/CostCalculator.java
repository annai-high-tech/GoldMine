package com.aht.shopping.jewelmine.core.model.utils;

public abstract class CostCalculator {

    protected CostCalculator() {

    }

    protected double getTotalCost(float productCost, float quantity, float extraTax) {

        if(productCost < 0.0f || quantity < 0.0f || extraTax < 0.0f) {
            return Double.POSITIVE_INFINITY;
        }

        return ((productCost * quantity) * (100 + extraTax)) / 100;
    }

    protected double getTotalCost(float rate, float quantity) {
        return getTotalCost(rate, quantity, 0.0f);
    }

}

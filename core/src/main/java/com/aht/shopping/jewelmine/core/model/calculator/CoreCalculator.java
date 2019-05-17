package com.aht.shopping.jewelmine.core.model.calculator;

import com.aht.shopping.jewelmine.core.model.data.Data;

public abstract class CoreCalculator {

    protected CoreCalculator() {

    }

    protected Data getTotalCost(float productCost, float quantity, float extraTax) {

        double cost;

        if(productCost < 0.0f || quantity < 0.0f || extraTax < 0.0f) {
            cost = Double.POSITIVE_INFINITY;
        }
        else {
            cost = ((productCost * quantity) * (100 + extraTax)) / 100;
        }

        return new Data(cost, !Double.isInfinite(cost));
    }

    protected Data getTotalCost(float rate, float quantity) {
        return getTotalCost(rate, quantity, 0.0f);
    }

    protected Data getPercentageRatio(double totalCost, float productCost, float quantity) {

        double percentage;

        if(totalCost <= 0.0 || productCost <= 0.0f || quantity <= 0.0f || totalCost < productCost || totalCost > Float.MAX_VALUE) {
            percentage = Double.POSITIVE_INFINITY;
        }
        else {
            percentage = ((totalCost / (productCost * quantity)) - 1) * 100;
        }

        return new Data(percentage, !Double.isInfinite(percentage));
    }

}

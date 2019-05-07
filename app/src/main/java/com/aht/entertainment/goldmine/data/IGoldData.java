package com.aht.entertainment.goldmine.data;

public interface IGoldData {

    float getWastagePercentage();

    double getTotalCost();

    boolean isTotalCostValid();

    boolean isWastagePercentageValid();
}

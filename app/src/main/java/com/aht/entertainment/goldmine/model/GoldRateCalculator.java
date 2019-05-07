package com.aht.entertainment.goldmine.model;

import com.aht.entertainment.goldmine.data.GoldData;

public class GoldRateCalculator implements IGoldRateCalculator {

    private RateCalculator calculator = new RateCalculator();

    @Override
    public boolean updatePriceList(GoldData data) {
        return updatePriceList(data, true);
    }

    @Override
    public boolean updateNoGstPriceList(GoldData data) {
        return updatePriceList(data, false);
    }

    private boolean updatePriceList(GoldData data, boolean isGstRequired) {
        double cost;
        boolean status = true;

        //TODO for checking input data

        if (status) {
            cost = calculator.getCost(data.getRate(), data.getQuantity(), data.getWastagePercentage());

            cost += data.getMakingCharge();

            if (isGstRequired) {
                cost += calculator.getCost(cost, 1.0, data.getGst());
            }

            data.setTotalCost(cost);
        }

        return status;

    }

    @Override
    public boolean updatePriceQuotationList(GoldData data) {
        return updateNoGstPriceQuotationList(data, true);
    }

    @Override
    public boolean updateNoGstPriceQuotationList(GoldData data) {
        return updateNoGstPriceQuotationList(data, false);
    }

    private boolean updateNoGstPriceQuotationList(GoldData data, boolean isGstRequired) {
        double cost;
        boolean status = true;

        //TODO for checking input data

        if (status) {
            cost = data.getTotalCost();

            if (isGstRequired) {
                cost /= (100 + data.getGst());
            }

            cost -= data.getMakingCharge();

            cost = (cost / (data.getRate() * data.getQuantity()));

            cost = (cost * 100) - 100;

            data.setWastagePercentage((float)cost);
        }

        return status;

    }

}

package com.aht.entertainment.goldmine.model;

import com.aht.entertainment.goldmine.data.GoldData;
import com.aht.entertainment.goldmine.data.IGoldData;

public class GoldRateCalculator  extends RateCalculator implements IGoldRateCalculator {

    @Override
    public IGoldData updatePriceList(GoldData data) {
        return updatePriceList(data, true);
    }

    @Override
    public IGoldData updateNoGstPriceList(GoldData data) {
        return updatePriceList(data, false);
    }

    private IGoldData updatePriceList(GoldData data, boolean isGstRequired) {
        double cost;
        boolean status = true;

        //checking input data
        if (data.getRate() < 0.0
                || data.getQuantity() < 0.0
                || data.getWastagePercentage() < 0.0
                || data.getMakingCharge() < 0.0) {

            data.setTotalCost(Double.POSITIVE_INFINITY);
            status = false;
        }

        if (isGstRequired && data.getGst() <= 0.0) {
            data.setTotalCost(Double.POSITIVE_INFINITY);
            status = false;
        }

        if (status) {
            cost = super.getCost(data.getRate(), data.getQuantity(), data.getWastagePercentage());

            cost += data.getMakingCharge();

            if (isGstRequired) {
                cost += super.getCost((float)cost, 1.0f, data.getGst());
            }

            data.setTotalCost(cost);
        }

        return data;

    }

    @Override
    public IGoldData updatePriceQuotationList(GoldData data) {
        return updateNoGstPriceQuotationList(data, true);
    }

    @Override
    public IGoldData updateNoGstPriceQuotationList(GoldData data) {
        return updateNoGstPriceQuotationList(data, false);
    }

    private IGoldData updateNoGstPriceQuotationList(GoldData data, boolean isGstRequired) {
        double cost;
        boolean status;

        //checking input data
        status = data.isTotalCostValid();

        if (!status
                || data.getRate() < 0.0
                || data.getQuantity() < 0.0
                || data.getTotalCost() < 0.0
                || data.getMakingCharge() < 0.0) {

            data.setWastagePercentage(-0.0f);
            status = false;
        }

        if (status) {
            cost = data.getTotalCost();

            if (isGstRequired) {
                cost /= (100 + data.getGst());
            }

            cost -= data.getMakingCharge();

            cost = (cost / (data.getRate() * data.getQuantity()));

            cost = (cost * 100) - 100;

            if (Double.isInfinite(cost)) {
                data.setWastagePercentage(-0.01f);
            } else {
                data.setWastagePercentage((float) cost);
            }
        }

        return data;

    }

}

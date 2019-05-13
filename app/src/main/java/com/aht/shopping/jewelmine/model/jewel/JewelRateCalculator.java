package com.aht.shopping.jewelmine.model.jewel;

import com.aht.shopping.jewelmine.data.JewelData;
import com.aht.shopping.jewelmine.model.core.RateCalculator;

public class JewelRateCalculator extends RateCalculator implements IJewelRateCalculator {

    @Override
    public boolean updatePriceList(JewelData data) {
        return updatePriceList(data, true);
    }

    @Override
    public boolean updateNoGstPriceList(JewelData data) {
        return updatePriceList(data, false);
    }

    private boolean updatePriceList(JewelData data, boolean isGstRequired) {
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
                cost = super.getCost((float)cost, 1.0f, data.getGst());
            }

            data.setTotalCost(cost);
        }

        return data.isTotalCostValid();

    }

    @Override
    public boolean updatePriceQuotationList(JewelData data) {
        return updatePriceQuotationList(data, true);
    }

    @Override
    public boolean updateNoGstPriceQuotationList(JewelData data) {
        return updatePriceQuotationList(data, false);
    }

    private boolean updatePriceQuotationList(JewelData data, boolean isGstRequired) {
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
                cost *= 100;
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

        return data.isWastagePercentageValid();

    }

}

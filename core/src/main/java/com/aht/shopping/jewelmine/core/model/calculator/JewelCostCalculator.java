package com.aht.shopping.jewelmine.core.model.calculator;

import com.aht.shopping.jewelmine.core.model.data.Jewel;
import com.aht.shopping.jewelmine.core.model.interfaces.IJewelCostCalculator;
import com.aht.shopping.jewelmine.core.model.jewel.AccurateMixedJewels;
import com.aht.shopping.jewelmine.core.model.jewel.MixedJewels;
import com.aht.shopping.jewelmine.core.model.jewel.NormalJewels;
import com.aht.shopping.jewelmine.core.model.utils.CostCalculator;

public class JewelCostCalculator extends CostCalculator implements IJewelCostCalculator {

    @Override
    public double getTotalCost(NormalJewels jewels) {
        //TODO
        return 0.0;
    }

    @Override
    public double getTotalCost(MixedJewels jewels) {
        //TODO
        return 0.0;
    }

    @Override
    public double getTotalCost(AccurateMixedJewels jewels) {
        //TODO
        return 0.0;
    }

    private double getTotalCost(Jewel jewel, float gst) {
        double cost = 0.0;
        boolean status = true;

        //TODO

        //checking input data
        /*if (jewels.getRate() < 0.0
                || data.getQuantity() < 0.0
                || data.getWastagePercentage() < 0.0
                || data.getMakingCharge() < 0.0) {

            data.setTotalCost(Double.POSITIVE_INFINITY);
            status = false;
        }

        if (isGstRequired && data.getGst() < 0.0) {
            data.setTotalCost(Double.POSITIVE_INFINITY);
            status = false;
        }

        if (status) {
            cost = super.getCost(data.getRate(), data.getQuantity(), data.getWastagePercentage());

            if(cost > 0) {
                cost += data.getMakingCharge();
            }

            if (isGstRequired  && data.getGst() > 0.0) {
                cost = super.getCost((float)cost, 1.0f, data.getGst());
            }

            data.setTotalCost(cost);
        } */

        return cost;

    }
}

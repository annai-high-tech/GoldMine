package com.aht.shopping.jewelmine.core.model.calculator;

import com.aht.shopping.jewelmine.core.model.data.Jewel;
import com.aht.shopping.jewelmine.core.model.interfaces.IJewelCostCalculator;
import com.aht.shopping.jewelmine.core.model.jewel.AccurateMixedJewels;
import com.aht.shopping.jewelmine.core.model.jewel.MixedJewels;
import com.aht.shopping.jewelmine.core.model.jewel.NormalJewels;
import com.aht.shopping.jewelmine.core.model.utils.CostCalculator;

import java.util.Iterator;

public class JewelCostCalculator extends CostCalculator implements IJewelCostCalculator {

    @Override
    public double getTotalCost(NormalJewels jewels) {

        double cost = 0.0;

        for (Integer jewelId : jewels.keySet()) {
            cost += getTotalCost(jewels.get(jewelId), jewels.getGst());
        }

        return cost;
    }

    @Override
    public double getTotalCost(MixedJewels jewels) {

        double cost = 0.0;

        for (Integer jewelId : jewels.keySet()) {
            cost += getTotalCost(jewels.get(jewelId), jewels.get(jewelId).getGst());
        }

        return cost;
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
        if (jewel.getRate() < 0.0
                || jewel.getQuantity() < 0.0
                || jewel.getWastage() < 0.0
                || jewel.getMakingCharges() < 0.0) {

            cost = Double.POSITIVE_INFINITY;
            status = false;
        }

        if (status && gst < 0.0) {
            cost = Double.POSITIVE_INFINITY;
            status = false;
        }

        if (status) {
            cost = super.getTotalCost(jewel.getRate(), jewel.getQuantity(), jewel.getWastage());

            if(cost > 0) {
                cost += jewel.getMakingCharges();
            }

            if (gst > 0.0) {
                cost = super.getTotalCost((float)cost, 1.0f, gst);
            }

        }

        return cost;

    }
}

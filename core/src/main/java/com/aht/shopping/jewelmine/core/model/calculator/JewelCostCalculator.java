package com.aht.shopping.jewelmine.core.model.calculator;

import com.aht.shopping.jewelmine.core.model.data.Data;
import com.aht.shopping.jewelmine.core.model.data.Jewel;
import com.aht.shopping.jewelmine.core.model.interfaces.IJewelCostCalculator;
import com.aht.shopping.jewelmine.core.model.jewel.AccurateMixedJewels;
import com.aht.shopping.jewelmine.core.model.jewel.MixedJewels;
import com.aht.shopping.jewelmine.core.model.jewel.NormalJewels;

public class JewelCostCalculator extends CoreCalculator implements IJewelCostCalculator {

    @Override
    public Data getTotalCost(NormalJewels jewels) {

        double cost = 0.0;
        Data data;

        for (Integer jewelId : jewels.keySet()) {
            data = getTotalCost(jewels.get(jewelId), jewels.getGst());
            if (data.isValid()) {
                cost += data.getData();
            }
        }

        return new Data(cost, !Double.isInfinite(cost));
    }

    @Override
    public Data getTotalCost(MixedJewels jewels) {

        double cost = 0.0;
        Data data;

        for (Integer jewelId : jewels.keySet()) {
            data = getTotalCost(jewels.get(jewelId), jewels.get(jewelId).getGst());
            if (data.isValid()) {
                cost += data.getData();
            }
        }

        return new Data(cost, !Double.isInfinite(cost));
    }

    @Override
    public Data getTotalCost(AccurateMixedJewels jewels) {
        //TODO
        return new Data(0.0, false);
    }

    private Data getTotalCost(Jewel jewel, float gst) {
        double cost = 0.0;
        boolean status = true;
        Data data;

        status = jewel.isSelected();

        //checking input data
        if (status && (jewel.getRate() < 0.0
                || jewel.getQuantity() < 0.0
                || jewel.getWastage() < 0.0
                || jewel.getMakingCharges() < 0.0)) {

            cost = Double.POSITIVE_INFINITY;
            status = false;
        }

        if (status && gst < 0.0) {
            cost = Double.POSITIVE_INFINITY;
            status = false;
        }

        if (status) {
            data = super.getTotalCost(jewel.getRate(), jewel.getQuantity(), jewel.getWastage());
            cost = data.getData();
            status = data.isValid();

            if(status && cost > 0) {
                cost += jewel.getMakingCharges();
                status = !Double.isInfinite(cost);
            }

            if (status && gst > 0.0) {
                data = super.getTotalCost((float)cost, 1.0f, gst);
                cost = data.getData();
                status = data.isValid();
            }

        }

        return new Data(cost, status);

    }
}

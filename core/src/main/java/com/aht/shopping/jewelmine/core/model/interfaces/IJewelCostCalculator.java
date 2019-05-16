package com.aht.shopping.jewelmine.core.model.interfaces;

import com.aht.shopping.jewelmine.core.model.jewel.AccurateMixedJewels;
import com.aht.shopping.jewelmine.core.model.jewel.MixedJewels;
import com.aht.shopping.jewelmine.core.model.jewel.NormalJewels;

public interface IJewelCostCalculator {

    public double getTotalCost(NormalJewels jewels);

    public double getTotalCost(MixedJewels jewels);

    public double getTotalCost(AccurateMixedJewels jewels);

}

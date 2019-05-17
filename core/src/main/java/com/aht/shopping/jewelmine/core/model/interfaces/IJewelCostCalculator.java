package com.aht.shopping.jewelmine.core.model.interfaces;

import com.aht.shopping.jewelmine.core.model.data.Data;
import com.aht.shopping.jewelmine.core.model.jewel.AccurateMixedJewels;
import com.aht.shopping.jewelmine.core.model.jewel.MixedJewels;
import com.aht.shopping.jewelmine.core.model.jewel.NormalJewels;

public interface IJewelCostCalculator {

    Data getTotalCost(NormalJewels jewels);

    Data getTotalCost(MixedJewels jewels);

    Data getTotalCost(AccurateMixedJewels jewels);

}

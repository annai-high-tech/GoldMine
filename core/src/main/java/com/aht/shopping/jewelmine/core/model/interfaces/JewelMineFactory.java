package com.aht.shopping.jewelmine.core.model.interfaces;

import com.aht.shopping.jewelmine.core.model.calculator.JewelCostCalculator;
import com.aht.shopping.jewelmine.core.model.calculator.JewelWastageCalculator;
import com.aht.shopping.jewelmine.core.model.jewel.AccurateMixedJewels;
import com.aht.shopping.jewelmine.core.model.jewel.MixedJewels;
import com.aht.shopping.jewelmine.core.model.jewel.NormalJewels;

public final class JewelMineFactory {

    public static IJewelCostCalculator createCostCalculator() {

        return new JewelCostCalculator();
    }

    public static IJewelWastageCalculator createWastageCalculator() {

        return new JewelWastageCalculator();
    }

    public static NormalJewels createNormalJewels() {

        return new NormalJewels();
    }

    public static MixedJewels createMixedJewels() {

        return new MixedJewels();
    }

    public static AccurateMixedJewels createAccurateMixedJewels() {

        return new AccurateMixedJewels();
    }
}

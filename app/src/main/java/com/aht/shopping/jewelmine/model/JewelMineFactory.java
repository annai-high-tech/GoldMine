package com.aht.shopping.jewelmine.model;

import com.aht.shopping.jewelmine.data.enums.JewelType;
import com.aht.shopping.jewelmine.model.diamond.DiamondRateCalculator;
import com.aht.shopping.jewelmine.model.gold.GoldRateCalculator;
import com.aht.shopping.jewelmine.model.jewel.IJewelRateCalculator;
import com.aht.shopping.jewelmine.model.platinum.PlatinumRateCalculator;
import com.aht.shopping.jewelmine.model.silver.SilverRateCalculator;

public class JewelMineFactory {

    private static IJewelRateCalculator jewelRateCalculator[] = new IJewelRateCalculator[JewelType.getCount()];

    static {

        jewelRateCalculator[JewelType.getValue(JewelType.SILVER)] = new SilverRateCalculator();
        jewelRateCalculator[JewelType.getValue(JewelType.GOLD)] = new GoldRateCalculator();
        jewelRateCalculator[JewelType.getValue(JewelType.PLATINUM)] = new PlatinumRateCalculator();
        jewelRateCalculator[JewelType.getValue(JewelType.DIAMOND)] = new DiamondRateCalculator();

    }

    public static IJewelRateCalculator getInstance(JewelType type) {

        IJewelRateCalculator instance = null;

        switch (type) {
            case SILVER:
                instance = jewelRateCalculator[JewelType.getValue(JewelType.SILVER)];
                break;
            case GOLD:
                instance = jewelRateCalculator[JewelType.getValue(JewelType.GOLD)];
                break;
            case PLATINUM:
                instance = jewelRateCalculator[JewelType.getValue(JewelType.PLATINUM)];
                break;
            case DIAMOND:
                instance = jewelRateCalculator[JewelType.getValue(JewelType.DIAMOND)];
                break;
        }
        return instance;
    }

    public static IJewelRateCalculator getNewInstance(JewelType type) {

        IJewelRateCalculator instance = null;

        switch (type) {
            case SILVER:
                instance = new SilverRateCalculator();
                break;
            case GOLD:
                instance = new GoldRateCalculator();
                break;
            case PLATINUM:
                instance = new PlatinumRateCalculator();
                break;
            case DIAMOND:
                instance = new DiamondRateCalculator();
                break;
        }

        return instance;
    }

}

package com.aht.shopping.jewelmine.model.jewel;

import com.aht.shopping.jewelmine.data.JewelData;

public interface IJewelRateCalculator {

    boolean updatePriceList(JewelData data);

    boolean updateNoGstPriceList(JewelData data);

    boolean updatePriceQuotationList(JewelData data);

    boolean updateNoGstPriceQuotationList(JewelData data);

}

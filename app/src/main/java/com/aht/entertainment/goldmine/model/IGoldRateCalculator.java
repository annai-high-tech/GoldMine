package com.aht.entertainment.goldmine.model;

import com.aht.entertainment.goldmine.data.GoldData;

public interface IGoldRateCalculator {

    boolean updatePriceList(GoldData data);

    boolean updateNoGstPriceList(GoldData data);

    boolean updatePriceQuotationList(GoldData data);

    boolean updateNoGstPriceQuotationList(GoldData data);

}

package com.aht.entertainment.goldmine.model;

import com.aht.entertainment.goldmine.data.GoldData;
import com.aht.entertainment.goldmine.data.IGoldData;

public interface IGoldRateCalculator {

    IGoldData updatePriceList(GoldData data);

    IGoldData updateNoGstPriceList(GoldData data);

    IGoldData updatePriceQuotationList(GoldData data);

    IGoldData updateNoGstPriceQuotationList(GoldData data);

}

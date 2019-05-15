package com.aht.shopping.jewelmine.model.jewel;

import com.aht.shopping.jewelmine.data.OneJewelData;

public interface IJewelRateCalculator {

    boolean updatePriceList(OneJewelData data);

    boolean updateNoGstPriceList(OneJewelData data);

    boolean updatePriceQuotationList(OneJewelData data);

    boolean updateNoGstPriceQuotationList(OneJewelData data);

}

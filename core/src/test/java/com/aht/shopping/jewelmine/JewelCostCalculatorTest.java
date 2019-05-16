package com.aht.shopping.jewelmine;

import com.aht.shopping.jewelmine.data.OneJewelData;
import com.aht.shopping.jewelmine.model.jewel.IJewelRateCalculator;
import com.aht.shopping.jewelmine.model.jewel.JewelRateCalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class JewelCostCalculatorTest {

    private IJewelRateCalculator calculator = new JewelRateCalculator();

    private static final double EPSILON = 0.01;

    private static final float FLOAT_MIN = Float.MAX_VALUE * -1;

    @Test
    public void updatePriceList_1() {

        OneJewelData input;
        boolean output;

        input = new OneJewelData(0.0f, 0.0f);
        output = calculator.updatePriceList(input);
        assertTrue(output);
        assertEquals(0, input.getTotalCost(), EPSILON);

    }

    @Test
    public void updatePriceList_2() {

        OneJewelData input;
        boolean output;

        input = new OneJewelData(3045.0f, 18.5f);
        input.setQuantity(15.940f);
        input.setWastagePercentage(16.2f);
        input.setMakingCharge(350.0f);

        output = calculator.updatePriceList(input);
        assertTrue(output);
        assertEquals(67249.15, input.getTotalCost(), EPSILON);

    }

    @Test
    public void updateNoGstPriceList_1() {

        OneJewelData input;
        boolean output;

        input = new OneJewelData(0.0f);
        output = calculator.updatePriceList(input);
        assertTrue(output);
        assertEquals(0, input.getTotalCost(), EPSILON);

    }

    @Test
    public void updateNoGstPriceList_2() {

        OneJewelData input;
        boolean output;

        input = new OneJewelData(3045.0f);
        input.setQuantity(15.940f);
        input.setWastagePercentage(16.2f);
        input.setMakingCharge(350.0f);

        output = calculator.updateNoGstPriceList(input);
        assertTrue(output);
        assertEquals(56750.34, input.getTotalCost(), EPSILON);

    }

    @Test
    public void updatePriceQuotationList_1() {

        OneJewelData input;
        boolean output;

        input = new OneJewelData(0.0f, 0.0f);

        output = calculator.updatePriceQuotationList(input);
        assertFalse(output);

    }

    @Test
    public void updatePriceQuotationList_2() {

        OneJewelData input;
        boolean output;

        input = new OneJewelData(3045.0f, 18.5f);
        input.setQuantity(15.940f);
        input.setTotalCost(67249.15f);
        input.setMakingCharge(350.0f);

        output = calculator.updatePriceQuotationList(input);
        assertTrue(output);
        assertEquals(16.2, input.getWastagePercentage(), EPSILON);

    }

    @Test
    public void updateNoGstPriceQuotationList_1() {

        OneJewelData input;
        boolean output;

        input = new OneJewelData(0.0f, 0.0f);
        output = calculator.updatePriceQuotationList(input);
        assertFalse(output);

    }

    @Test
    public void updateNoGstPriceQuotationList_2() {

        OneJewelData input;
        boolean output;

        input = new OneJewelData(3045.0f);
        input.setQuantity(15.940f);
        input.setTotalCost(56750.34f);
        input.setMakingCharge(350.0f);

        output = calculator.updateNoGstPriceQuotationList(input);
        assertTrue(output);
        assertEquals(16.2, input.getWastagePercentage(), EPSILON);

    }

}
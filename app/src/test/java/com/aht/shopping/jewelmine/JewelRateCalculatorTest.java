package com.aht.shopping.jewelmine;

import com.aht.shopping.jewelmine.data.JewelData;
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

public class JewelRateCalculatorTest {

    private IJewelRateCalculator calculator = new JewelRateCalculator();

    private static final double EPSILON = 0.01;

    private static final float FLOAT_MIN = Float.MAX_VALUE * -1;

    @Test
    public void updatePriceList_1() {

        JewelData input;
        boolean output;

        input = new JewelData(0.0f, 0.0f);
        output = calculator.updatePriceList(input);
        assertFalse(output);

    }

    @Test
    public void updatePriceList_2() {

        JewelData input;
        boolean output;

        input = new JewelData(0.0f, 0.0f);
        output = calculator.updatePriceList(input);
        assertTrue(output);
        assertEquals(0.0, input.getTotalCost(), EPSILON);

    }

    @Test
    public void updateNoGstPriceList_1() {

        JewelData input;
        boolean output;

        input = new JewelData(0.0f);
        output = calculator.updatePriceList(input);
        assertFalse(output);

    }

    @Test
    public void updateNoGstPriceList_2() {

        JewelData input;
        boolean output;

        input = new JewelData(0.0f);
        output = calculator.updatePriceList(input);
        assertTrue(output);
        assertEquals(0.0, input.getTotalCost(), EPSILON);

    }

    @Test
    public void updatePriceQuotationList_1() {

        JewelData input;
        boolean output;

        input = new JewelData(0.0f, 0.0f);

        output = calculator.updatePriceQuotationList(input);
        assertFalse(output);

    }

    @Test
    public void updatePriceQuotationList_2() {

        JewelData input;
        boolean output;

        input = new JewelData(0.0f, 0.0f);

        output = calculator.updatePriceQuotationList(input);
        assertTrue(output);
        assertEquals(0.0, input.getWastagePercentage(), EPSILON);

    }

    @Test
    public void updateNoGstPriceQuotationList_1() {

        JewelData input;
        boolean output;

        input = new JewelData(0.0f, 0.0f);
        output = calculator.updatePriceQuotationList(input);
        assertFalse(output);

    }

    @Test
    public void updateNoGstPriceQuotationList_2() {

        JewelData input;
        boolean output;

        input = new JewelData(0.0f, 0.0f);
        output = calculator.updatePriceQuotationList(input);
        assertTrue(output);
        assertEquals(0.0, input.getWastagePercentage(), EPSILON);

    }

}
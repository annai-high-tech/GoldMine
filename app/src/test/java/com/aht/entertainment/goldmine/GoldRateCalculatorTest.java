package com.aht.entertainment.goldmine;

import com.aht.entertainment.goldmine.data.GoldData;
import com.aht.entertainment.goldmine.data.IGoldData;
import com.aht.entertainment.goldmine.model.GoldRateCalculator;
import com.aht.entertainment.goldmine.model.IGoldRateCalculator;
import com.aht.entertainment.goldmine.model.RateCalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class GoldRateCalculatorTest {

    private IGoldRateCalculator calculator = new GoldRateCalculator();

    private static final double EPSILON = 0.01;

    private static final float FLOAT_MIN = Float.MAX_VALUE * -1;

    @Test
    public void updatePriceList_1() {

        GoldData input;
        IGoldData output;

        input = new GoldData(0.0f, 0.0f);
        output = calculator.updatePriceList(input);
        assertFalse(output.isTotalCostValid());

    }

    @Test
    public void updatePriceList_2() {

        GoldData input;
        IGoldData output;

        input = new GoldData(0.0f, 0.0f);
        output = calculator.updatePriceList(input);
        assertTrue(output.isTotalCostValid());
        assertEquals(0.0, output.getTotalCost(), EPSILON);

    }

    @Test
    public void updateNoGstPriceList_1() {

        GoldData input;
        IGoldData output;

        input = new GoldData(0.0f);
        output = calculator.updatePriceList(input);
        assertFalse(output.isTotalCostValid());

    }

    @Test
    public void updateNoGstPriceList_2() {

        GoldData input;
        IGoldData output;

        input = new GoldData(0.0f);
        output = calculator.updatePriceList(input);
        assertTrue(output.isTotalCostValid());
        assertEquals(0.0, output.getTotalCost(), EPSILON);

    }

    @Test
    public void updatePriceQuotationList_1() {

        GoldData input;
        IGoldData output;

        input = new GoldData(0.0f, 0.0f);

        output = calculator.updatePriceQuotationList(input);
        assertFalse(output.isWastagePercentageValid());

    }

    @Test
    public void updatePriceQuotationList_2() {

        GoldData input;
        IGoldData output;

        input = new GoldData(0.0f, 0.0f);

        output = calculator.updatePriceQuotationList(input);
        assertTrue(output.isWastagePercentageValid());
        assertEquals(0.0, output.getWastagePercentage(), EPSILON);

    }

    @Test
    public void updateNoGstPriceQuotationList_1() {

        GoldData input;
        IGoldData output;

        input = new GoldData(0.0f, 0.0f);
        output = calculator.updatePriceQuotationList(input);
        assertFalse(output.isWastagePercentageValid());

    }

    @Test
    public void updateNoGstPriceQuotationList_2() {

        GoldData input;
        IGoldData output;

        input = new GoldData(0.0f, 0.0f);
        output = calculator.updatePriceQuotationList(input);
        assertTrue(output.isWastagePercentageValid());
        assertEquals(0.0, output.getWastagePercentage(), EPSILON);

    }

}
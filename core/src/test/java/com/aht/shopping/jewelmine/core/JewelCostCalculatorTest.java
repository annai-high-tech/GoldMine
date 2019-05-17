package com.aht.shopping.jewelmine.core;

import com.aht.shopping.jewelmine.core.model.data.Data;
import com.aht.shopping.jewelmine.core.model.interfaces.IJewelCostCalculator;
import com.aht.shopping.jewelmine.core.model.interfaces.JewelMineFactory;
import com.aht.shopping.jewelmine.core.model.jewel.NormalJewels;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class JewelCostCalculatorTest {

    private IJewelCostCalculator calculator = JewelMineFactory.createCostCalculator();

    private static final double EPSILON = 0.01;

    private static final float FLOAT_MIN = Float.MAX_VALUE * -1;

    @Test
    public void getTotalCost_1() {

        NormalJewels input = JewelMineFactory.createNormalJewels();
        Data cost;

        cost = calculator.getTotalCost(input);
        assertTrue(cost.isValid());
        assertEquals(0, cost.getData(), EPSILON);
        input.clear();

        input.createJewel(0.0f, 0.0f, 0.0f, 0.0f, false);
        input.createJewel(0.0f, 0.0f, 0.0f, 1.0f, false);
        input.createJewel(0.0f, 0.0f, 1.0f, 0.0f, false);
        input.createJewel(0.0f, 0.0f, 1.0f, 1.0f, false);
        input.createJewel(0.0f, 1.0f, 0.0f, 0.0f, false);
        input.createJewel(0.0f, 1.0f, 0.0f, 1.0f, false);
        input.createJewel(0.0f, 1.0f, 1.0f, 0.0f, false);
        input.createJewel(0.0f, 1.0f, 1.0f, 1.0f, false);
        input.createJewel(1.0f, 0.0f, 0.0f, 0.0f, false);
        input.createJewel(1.0f, 0.0f, 0.0f, 1.0f, false);
        input.createJewel(1.0f, 0.0f, 1.0f, 0.0f, false);
        input.createJewel(1.0f, 0.0f, 1.0f, 1.0f, false);
        input.createJewel(1.0f, 1.0f, 0.0f, 0.0f, false);
        input.createJewel(1.0f, 1.0f, 0.0f, 1.0f, false);
        input.createJewel(1.0f, 1.0f, 1.0f, 0.0f, false);
        input.createJewel(1.0f, 1.0f, 1.0f, 1.0f, false);

        cost = calculator.getTotalCost(input);
        assertTrue(cost.isValid());
        assertEquals(0, cost.getData(), EPSILON);
        input.clear();

        input.createJewel(0.0f, 0.0f, 0.0f, 0.0f, true);
        input.createJewel(0.0f, 1.0f, 0.0f, 0.0f, true);
        input.createJewel(1.0f, 0.0f, 0.0f, 0.0f, true);
        input.createJewel(0.0f, 0.0f, 1.0f, 0.0f, true);
        input.createJewel(0.0f, 1.0f, 1.0f, 0.0f, true);
        input.createJewel(1.0f, 0.0f, 1.0f, 0.0f, true);
        input.createJewel(0.0f, 0.0f, 0.0f, 1.0f, true);
        input.createJewel(0.0f, 0.0f, 1.0f, 1.0f, true);
        input.createJewel(0.0f, 1.0f, 0.0f, 1.0f, true);
        input.createJewel(0.0f, 1.0f, 1.0f, 1.0f, true);
        input.createJewel(1.0f, 0.0f, 0.0f, 1.0f, true);
        input.createJewel(1.0f, 0.0f, 1.0f, 1.0f, true);

        cost = calculator.getTotalCost(input);
        assertTrue(cost.isValid());
        assertEquals(0, cost.getData(), EPSILON);
        input.clear();

        input.createJewel(1.0f, 1.0f, 1.0f, 0.0f, true);

        cost = calculator.getTotalCost(input);
        assertTrue(cost.isValid());
        assertEquals(1.01, cost.getData(), EPSILON);
        input.clear();

        input.createJewel(1.0f, 1.0f, 0.0f, 0.0f, true);

        cost = calculator.getTotalCost(input);
        assertTrue(cost.isValid());
        assertEquals(1.0, cost.getData(), EPSILON);
        input.clear();

        input.createJewel(1.0f, 1.0f, 0.0f, 1.0f, true);

        cost = calculator.getTotalCost(input);
        assertTrue(cost.isValid());
        assertEquals(2.0, cost.getData(), EPSILON);
        input.clear();

        input.createJewel(1.0f, 1.0f, 1.0f, 1.0f, true);

        cost = calculator.getTotalCost(input);
        assertTrue(cost.isValid());
        assertEquals(2.01, cost.getData(), EPSILON);
        input.clear();


    }

    @Test
    public void getTotalCost_2() {

        NormalJewels input = JewelMineFactory.createNormalJewels();
        Data cost;

        input.createJewel(-1.0f, -1.0f, -1.0f, -1.0f, false);
        input.createJewel(-1.0f, -1.0f, -1.0f, 1.0f, false);
        input.createJewel(-1.0f, -1.0f, 1.0f, -1.0f, false);
        input.createJewel(-1.0f, -1.0f, 1.0f, 1.0f, false);
        input.createJewel(-1.0f, 1.0f, -1.0f, -1.0f, false);
        input.createJewel(-1.0f, 1.0f, -1.0f, 1.0f, false);
        input.createJewel(-1.0f, 1.0f, 1.0f, -1.0f, false);
        input.createJewel(-1.0f, 1.0f, 1.0f, 1.0f, false);
        input.createJewel(1.0f, -1.0f, -1.0f, -1.0f, false);
        input.createJewel(1.0f, -1.0f, -1.0f, 1.0f, false);
        input.createJewel(1.0f, -1.0f, 1.0f, -1.0f, false);
        input.createJewel(1.0f, -1.0f, 1.0f, 1.0f, false);
        input.createJewel(1.0f, 1.0f, -1.0f, -1.0f, false);
        input.createJewel(1.0f, 1.0f, -1.0f, 1.0f, false);
        input.createJewel(1.0f, 1.0f, 1.0f, -1.0f, false);
        input.createJewel(1.0f, 1.0f, 1.0f, 1.0f, false);

        cost = calculator.getTotalCost(input);
        assertTrue(cost.isValid());
        assertEquals(0, cost.getData(), EPSILON);
        input.clear();

        input.createJewel(-1.0f, -1.0f, -1.0f, -1.0f, true);
        assertTrue(calculator.getTotalCost(input).isValid());
        input.clear();

        input.createJewel(-1.0f, 1.0f, -1.0f, -1.0f, true);
        assertTrue(calculator.getTotalCost(input).isValid());
        input.clear();

        input.createJewel(1.0f, -1.0f, -1.0f, -1.0f, true);
        assertTrue(calculator.getTotalCost(input).isValid());
        input.clear();

        input.createJewel(1.0f, 1.0f, -1.0f, -1.0f, true);
        assertTrue(calculator.getTotalCost(input).isValid());
        input.clear();

        input.createJewel(-1.0f, -1.0f, 1.0f, -1.0f, true);
        assertTrue(calculator.getTotalCost(input).isValid());
        input.clear();

        input.createJewel(-1.0f, 1.0f, 1.0f, -1.0f, true);
        assertTrue(calculator.getTotalCost(input).isValid());
        input.clear();

        input.createJewel(1.0f, -1.0f, 1.0f, -1.0f, true);
        assertTrue(calculator.getTotalCost(input).isValid());
        input.clear();

        input.createJewel(1.0f, 1.0f, 1.0f, -1.0f, true);
        assertTrue(calculator.getTotalCost(input).isValid());
        input.clear();

        input.createJewel(-1.0f, -1.0f, -1.0f, 1.0f, true);
        assertTrue(calculator.getTotalCost(input).isValid());
        input.clear();

        input.createJewel(-1.0f, -1.0f, 1.0f, 1.0f, true);
        assertTrue(calculator.getTotalCost(input).isValid());
        input.clear();

        input.createJewel(-1.0f, 1.0f, -1.0f, 1.0f, true);
        assertTrue(calculator.getTotalCost(input).isValid());
        input.clear();

        input.createJewel(-1.0f, 1.0f, 1.0f, 1.0f, true);
        assertTrue(calculator.getTotalCost(input).isValid());
        input.clear();

        input.createJewel(1.0f, -1.0f, -1.0f, 1.0f, true);
        assertTrue(calculator.getTotalCost(input).isValid());
        input.clear();

        input.createJewel(1.0f, -1.0f, 1.0f, 1.0f, true);
        assertTrue(calculator.getTotalCost(input).isValid());
        input.clear();

        input.createJewel(1.0f, 1.0f, -1.0f, 1.0f, true);
        assertTrue(calculator.getTotalCost(input).isValid());
        input.clear();

    }

    @Test
    public void getTotalCost_3() {

        NormalJewels input = JewelMineFactory.createNormalJewels();
        Data cost;

        input.createJewel(3045.0f, 15.940f, 16.2f, 350.0f, true);

        cost = calculator.getTotalCost(input);
        assertTrue(cost.isValid());
        assertEquals(56750.34, cost.getData(), EPSILON);

        input.createJewel(3045.0f, 15.940f, 16.2f, 350.0f, true);
        input.setGst(0.0f);

        cost = calculator.getTotalCost(input);
        assertTrue(cost.isValid());
        assertEquals((56750.34 * 2), cost.getData(), EPSILON);

    }

    @Test
    public void getTotalCost_4() {

        NormalJewels input = JewelMineFactory.createNormalJewels();
        Data cost;

        input.createJewel(3045.0f, 15.940f, 16.2f, 350.0f, true);
        input.setGst(14.0f);

        cost = calculator.getTotalCost(input);
        assertTrue(cost.isValid());
        assertEquals(64695.38, cost.getData(), EPSILON);
        input.clear();

        input.createJewel(3045.0f, 15.940f, 16.2f, 350.0f, true);
        input.setGst(13.0f);

        cost = calculator.getTotalCost(input);
        assertTrue(cost.isValid());
        assertEquals(64127.87, cost.getData(), EPSILON);

    }

}
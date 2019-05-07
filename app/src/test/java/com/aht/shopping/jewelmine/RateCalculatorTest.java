package com.aht.shopping.jewelmine;

import com.aht.shopping.jewelmine.model.core.RateCalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class RateCalculatorTest extends RateCalculator {

    private static final double EPSILON = 0.01;

    private static final float FLOAT_MIN = Float.MAX_VALUE * -1;

    @Test
    public void getCost_WithTax_1() {

        assertEquals(0.0, super.getCost(0.0f, 0.0f, 0.0f), EPSILON);
        assertEquals(0.0, super.getCost(0.0f, 0.0f, Float.MAX_VALUE), EPSILON);
        assertEquals(0.0, super.getCost(0.0f, Float.MAX_VALUE, 0.0f), EPSILON);
        assertEquals(0.0, super.getCost(0.0f, Float.MAX_VALUE, Float.MAX_VALUE), EPSILON);
        assertEquals(0.0, super.getCost(Float.MAX_VALUE, 0.0f, 0.0f), EPSILON);
        assertEquals(0.0, super.getCost(Float.MAX_VALUE, 0.0f, Float.MAX_VALUE), EPSILON);
        assertTrue(Double.isInfinite(super.getCost(Float.MAX_VALUE, Float.MAX_VALUE, 0.0f)));
        assertTrue(Double.isInfinite(super.getCost(Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE)));

    }

    @Test
    public void getCost_WithTax_2() {

        assertEquals(0.0, super.getCost(0.0f, 0.0f, 0.0f), EPSILON);

        assertTrue(Double.isInfinite(super.getCost(0.0f, 0.0f, FLOAT_MIN)));
        assertTrue(Double.isInfinite(super.getCost(0.0f, FLOAT_MIN, 0.0f)));
        assertTrue(Double.isInfinite(super.getCost(0.0f, FLOAT_MIN, FLOAT_MIN)));
        assertTrue(Double.isInfinite(super.getCost(FLOAT_MIN, 0.0f, 0.0f)));
        assertTrue(Double.isInfinite(super.getCost(FLOAT_MIN, 0.0f, FLOAT_MIN)));
        assertTrue(Double.isInfinite(super.getCost(FLOAT_MIN, FLOAT_MIN, 0.0f)));
        assertTrue(Double.isInfinite(super.getCost(FLOAT_MIN, FLOAT_MIN, FLOAT_MIN)));

        assertTrue(Double.isInfinite(super.getCost(0.0f, 0.0f, -0.01f)));
        assertTrue(Double.isInfinite(super.getCost(0.0f, -0.01f, 0.0f)));
        assertTrue(Double.isInfinite(super.getCost(0.0f, -0.01f, -0.01f)));
        assertTrue(Double.isInfinite(super.getCost(-0.01f, 0.0f, 0.0f)));
        assertTrue(Double.isInfinite(super.getCost(-0.01f, 0.0f, -0.01f)));
        assertTrue(Double.isInfinite(super.getCost(-0.01f, -0.01f, 0.0f)));
        assertTrue(Double.isInfinite(super.getCost(-0.01f, -0.01f, -0.01f)));

    }

    @Test
    public void getCost_WithTax_3() {

        assertEquals(1.0, super.getCost(1.0f, 1.0f, 1.0f), EPSILON);
        assertEquals(59307.28, super.getCost(2955.85f, 18.450f, 8.75f), EPSILON);

    }

    @Test
    public void getCost_WithoutTax_1() {

        assertEquals(0.0, super.getCost(0.0f, 0.0f), EPSILON);
        assertEquals(0.0, super.getCost(0.0f, Float.MAX_VALUE), EPSILON);
        assertEquals(0.0, super.getCost(Float.MAX_VALUE, 0.0f), EPSILON);
        assertTrue(Double.isInfinite(super.getCost(Float.MAX_VALUE, Float.MAX_VALUE)));

    }

    @Test
    public void getCost_WithoutTax_2() {

        assertEquals(0.0, super.getCost(0.0f, 0.0f), EPSILON);

        assertTrue(Double.isInfinite(super.getCost(0.0f, FLOAT_MIN)));
        assertTrue(Double.isInfinite(super.getCost(FLOAT_MIN, 0.0f)));
        assertTrue(Double.isInfinite(super.getCost(FLOAT_MIN, FLOAT_MIN)));

        assertTrue(Double.isInfinite(super.getCost(0.0f, -0.01f)));
        assertTrue(Double.isInfinite(super.getCost(-0.01f, 0.0f)));
        assertTrue(Double.isInfinite(super.getCost(-0.01f, -0.01f)));

    }

    @Test
    public void getCost_WithoutTax_3() {

        assertEquals(1.0, super.getCost(1.0f, 1.0f), EPSILON);
        assertEquals(54535.44, super.getCost(2955.85f, 18.450f), EPSILON);

    }

}
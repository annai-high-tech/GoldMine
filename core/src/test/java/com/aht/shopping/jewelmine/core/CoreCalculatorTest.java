package com.aht.shopping.jewelmine.core;

import com.aht.shopping.jewelmine.core.model.calculator.CoreCalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class CoreCalculatorTest extends CoreCalculator {

    private static final double EPSILON = 0.01;

    private static final float FLOAT_MIN = Float.MAX_VALUE * -1;

    @Test
    public void getCost_WithTax_1() {

        assertEquals(0.0, super.getTotalCost(0.0f, 0.0f, 0.0f).getData(), EPSILON);
        assertEquals(0.0, super.getTotalCost(0.0f, 0.0f, Float.MAX_VALUE).getData(), EPSILON);
        assertEquals(0.0, super.getTotalCost(0.0f, Float.MAX_VALUE, 0.0f).getData(), EPSILON);
        assertEquals(0.0, super.getTotalCost(0.0f, Float.MAX_VALUE, Float.MAX_VALUE).getData(), EPSILON);
        assertEquals(0.0, super.getTotalCost(Float.MAX_VALUE, 0.0f, 0.0f).getData(), EPSILON);
        assertEquals(0.0, super.getTotalCost(Float.MAX_VALUE, 0.0f, Float.MAX_VALUE).getData(), EPSILON);
        assertFalse(super.getTotalCost(Float.MAX_VALUE, Float.MAX_VALUE, 0.0f).isValid());
        assertFalse(super.getTotalCost(Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE).isValid());

    }

    @Test
    public void getCost_WithTax_2() {

        assertEquals(0.0, super.getTotalCost(0.0f, 0.0f, 0.0f).getData(), EPSILON);

        assertFalse(super.getTotalCost(0.0f, 0.0f, FLOAT_MIN).isValid());
        assertFalse(super.getTotalCost(0.0f, FLOAT_MIN, 0.0f).isValid());
        assertFalse(super.getTotalCost(0.0f, FLOAT_MIN, FLOAT_MIN).isValid());
        assertFalse(super.getTotalCost(FLOAT_MIN, 0.0f, 0.0f).isValid());
        assertFalse(super.getTotalCost(FLOAT_MIN, 0.0f, FLOAT_MIN).isValid());
        assertFalse(super.getTotalCost(FLOAT_MIN, FLOAT_MIN, 0.0f).isValid());
        assertFalse(super.getTotalCost(FLOAT_MIN, FLOAT_MIN, FLOAT_MIN).isValid());

        assertFalse(super.getTotalCost(0.0f, 0.0f, -0.01f).isValid());
        assertFalse(super.getTotalCost(0.0f, -0.01f, 0.0f).isValid());
        assertFalse(super.getTotalCost(0.0f, -0.01f, -0.01f).isValid());
        assertFalse(super.getTotalCost(-0.01f, 0.0f, 0.0f).isValid());
        assertFalse(super.getTotalCost(-0.01f, 0.0f, -0.01f).isValid());
        assertFalse(super.getTotalCost(-0.01f, -0.01f, 0.0f).isValid());
        assertFalse(super.getTotalCost(-0.01f, -0.01f, -0.01f).isValid());

    }

    @Test
    public void getCost_WithTax_3() {

        assertEquals(1.0, super.getTotalCost(1.0f, 1.0f, 1.0f).getData(), EPSILON);
        assertEquals(59307.28, super.getTotalCost(2955.85f, 18.450f, 8.75f).getData(), EPSILON);

    }

    @Test
    public void getCost_WithoutTax_1() {

        assertEquals(0.0, super.getTotalCost(0.0f, 0.0f).getData(), EPSILON);
        assertEquals(0.0, super.getTotalCost(0.0f, Float.MAX_VALUE).getData(), EPSILON);
        assertEquals(0.0, super.getTotalCost(Float.MAX_VALUE, 0.0f).getData(), EPSILON);
        assertFalse(super.getTotalCost(Float.MAX_VALUE, Float.MAX_VALUE).isValid());

    }

    @Test
    public void getCost_WithoutTax_2() {

        assertEquals(0.0, super.getTotalCost(0.0f, 0.0f).getData(), EPSILON);

        assertFalse(super.getTotalCost(0.0f, FLOAT_MIN).isValid());
        assertFalse(super.getTotalCost(FLOAT_MIN, 0.0f).isValid());
        assertFalse(super.getTotalCost(FLOAT_MIN, FLOAT_MIN).isValid());

        assertFalse(super.getTotalCost(0.0f, -0.01f).isValid());
        assertFalse(super.getTotalCost(-0.01f, 0.0f).isValid());
        assertFalse(super.getTotalCost(-0.01f, -0.01f).isValid());

    }

    @Test
    public void getCost_WithoutTax_3() {

        assertEquals(1.0, super.getTotalCost(1.0f, 1.0f).getData(), EPSILON);
        assertEquals(54535.44, super.getTotalCost(2955.85f, 18.450f).getData(), EPSILON);

    }

    @Test
    public void getPercentageRatio_1() {

        assertFalse(super.getPercentageRatio(0.0, 0.0f, 0.0f).isValid());
        assertFalse(super.getPercentageRatio(0.0, 0.0f, Float.MAX_VALUE).isValid());
        assertFalse(super.getPercentageRatio(0.0, Float.MAX_VALUE, 0.0f).isValid());
        assertFalse(super.getPercentageRatio(0.0, Float.MAX_VALUE, Float.MAX_VALUE).isValid());
        assertFalse(super.getPercentageRatio(Double.MAX_VALUE, 0.0f, 0.0f).isValid());
        assertFalse(super.getPercentageRatio(Double.MAX_VALUE, 0.0f, Float.MAX_VALUE).isValid());
        assertFalse(super.getPercentageRatio(Double.MAX_VALUE, Float.MAX_VALUE, 0.0f).isValid());

        assertFalse(super.getPercentageRatio(Double.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE).isValid());

    }

    @Test
    public void getPercentageRatio_2() {

        assertEquals(0.0, super.getPercentageRatio(1.0, 1.0f, 1.0f).getData(), EPSILON);

        assertFalse(super.getPercentageRatio(0.0, 0.0f, FLOAT_MIN).isValid());
        assertFalse(super.getPercentageRatio(0.0, FLOAT_MIN, 0.0f).isValid());
        assertFalse(super.getPercentageRatio(0.0, FLOAT_MIN, FLOAT_MIN).isValid());
        assertFalse(super.getPercentageRatio(Double.MIN_VALUE, 0.0f, 0.0f).isValid());
        assertFalse(super.getPercentageRatio(Double.MIN_VALUE, 0.0f, FLOAT_MIN).isValid());
        assertFalse(super.getPercentageRatio(Double.MIN_VALUE, FLOAT_MIN, 0.0f).isValid());
        assertFalse(super.getPercentageRatio(Double.MIN_VALUE, FLOAT_MIN, FLOAT_MIN).isValid());

        assertFalse(super.getPercentageRatio(0.01, 0.01f, -0.01f).isValid());
        assertFalse(super.getPercentageRatio(0.01, -0.01f, 0.01f).isValid());
        assertFalse(super.getPercentageRatio(0.01, -0.01f, -0.01f).isValid());
        assertFalse(super.getPercentageRatio(-0.01, 0.01f, 0.01f).isValid());
        assertFalse(super.getPercentageRatio(-0.01, 0.01f, -0.01f).isValid());
        assertFalse(super.getPercentageRatio(-0.01, -0.01f, 0.01f).isValid());
        assertFalse(super.getPercentageRatio(-0.01, -0.01f, -0.01f).isValid());

    }

    @Test
    public void getPercentageRatio_3() {

        assertEquals(1.0, super.getPercentageRatio(1.01, 1.0f, 1.0f).getData(), EPSILON);
        assertEquals(8.75, super.getPercentageRatio(59307.28, 2955.85f, 18.450f).getData(), EPSILON);

    }

}
package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
        double height = 180.0;
        double expected = 92.0;
        double out = Fit.manWeight(height);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void womanWeight() {
        double height = 170.0;
        double expected = 69.009;
        double out = Fit.womanWeight(height);
        Assert.assertEquals(expected, out, 0.01);

    }

}

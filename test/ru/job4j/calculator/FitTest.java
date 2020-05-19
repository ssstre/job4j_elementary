package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void manWeight() {
        double in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void womanWeight() {
        double inw = 160;
        double expectedw = 57.5;
        double outw = Fit.womanWeight(inw);
        Assert.assertEquals(expectedw, outw, 0.01);

    }
}
package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void toMax() {
        int first = 1;
        int second = 4;
        int third = 2;
        int expected = 4;
        int out = MultiMax.max(first, second, third);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void toMax2() {
        int first = 5;
        int second = 4;
        int third = 2;
        int expected = 5;
        int out = MultiMax.max(first, second, third);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void toMaxEquals() {
        int first = 4;
        int second = 4;
        int third = 4;
        int expected = 4;
        int out = MultiMax.max(first, second, third);
        Assert.assertEquals(expected, out);
    }
}
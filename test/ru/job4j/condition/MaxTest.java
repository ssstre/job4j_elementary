package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int expected = 2;
        int out = Max.max(first, second);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void whenMax2ToThen1() {
        int first = 2;
        int second = 1;
        int expected = 2;
        int out = Max.max(first, second);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void whenEquals1To2Then2() {
        int first = 2;
        int second = 2;
        int expected = 2;
        int out = Max.max(first, second);
        Assert.assertEquals(expected, out);
    }
}
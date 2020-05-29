package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeMaxTest {

    @Test
           public void firstMax() {
        int first = 10;
        int second = 5;
        int third = 1;
        int expected = 10;
        int out = ThreeMax.max(first, second, third);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void secondMax() {
        int first = 10;
        int second = 50;
        int third = 1;
        int expected = 50;
        int out = ThreeMax.max(first, second, third);
        Assert.assertEquals(expected, out);

    }

    @Test
    public void thirdMax() {
        int first = 1;
        int second = 5;
        int third = 100;
        int expected = 100;
        int out = ThreeMax.max(first, second, third);
        Assert.assertEquals(expected, out);

    }

    @Test
    public void allEq() {
        int first = 1;
        int second = 1;
        int third = 1;
        int expected = 1;
        int out = ThreeMax.max(first, second, third);
        Assert.assertEquals(expected, out);

    }

    @Test
    public void firstEqSecond() {
        int first = 10;
        int second = 10;
        int third = 1;
        int expected = 10;
        int out = ThreeMax.max(first, second, third);
        Assert.assertEquals(expected, out);

    }

    @Test
    public void firstEqThird() {
        int first = 100;
        int second = 1;
        int third = 100;
        int expected = 100;
        int out = ThreeMax.max(first, second, third);
        Assert.assertEquals(expected, out);

    }

    @Test
    public void secondEqThird() {
        int first = 11;
        int second = 100;
        int third = 100;
        int expected = 100;
        int out = ThreeMax.max(first, second, third);
        Assert.assertEquals(expected, out);
    }



}
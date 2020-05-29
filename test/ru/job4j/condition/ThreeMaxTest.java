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



}
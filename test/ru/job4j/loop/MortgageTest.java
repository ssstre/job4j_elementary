package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MortgageTest {

    @Test
    public void when1Year() {
        int expected = 1;
        int year = Mortgage.year(1000, 120, 1);
        Assert.assertEquals(year, expected);
    }

    public void when2Year() {
        int expected = 2;
        int year = Mortgage.year(100, 120, 50);
        Assert.assertEquals(year, expected);
    }

}
package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

            @Test
        public void henThirty() {
            int start = 0;
            int finish = 10;
            int out = Counter.sum(start, finish);
            int expected = 55;
            Assert.assertEquals(out, expected);
        }
    @Test
    public void henThirty1() {
        int start = 3;
        int finish = 8;
        int out = Counter.sum(start, finish);
        int expected = 33;
        Assert.assertEquals(out, expected);
    }
    @Test
    public void henThirty2() {
        int start = 0;
        int finish = 1;
        int out = Counter.sum(start, finish);
        int expected = 1;
        Assert.assertEquals(out, expected);
    }
    @Test
    public void byEven1() {
        int start = 0;
        int finish = 10;
        int out = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(out, expected);
    }
    @Test
    public void byEven11() {
        int start = 3;
        int finish = 8;
        int out = Counter.sumByEven(start, finish);
        int expected = 18;
        Assert.assertEquals(out, expected);
    }
    @Test
    public void byEven2() {
        int start = 0;
        int finish = 1;
        int out = Counter.sumByEven(start, finish);
        int expected = 0;
        Assert.assertEquals(out, expected);
    }
    }




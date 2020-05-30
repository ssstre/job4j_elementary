package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPrimeNumberTest {

    @Test
    public void check() {
        boolean expected = true;
        boolean out = CheckPrimeNumber.check(5);
        Assert.assertTrue(out);
    }
    @Test
    public void checkfalse() {
        boolean out = CheckPrimeNumber.check(4);
        Assert.assertFalse(out);
    }


}
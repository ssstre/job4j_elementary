package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void square() {
        double p = 6;
        double k = 2;
        double expected  = 2;
        double out = SqArea.square(6, 2);
        Assert.assertEquals(expected, out, 0.01) ;
    }
}
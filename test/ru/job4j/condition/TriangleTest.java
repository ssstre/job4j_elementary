package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 2;
        double ac = 2;
        double bc = 2;
        boolean out = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(out);
    }

    @Test
    public void notWhenExist() {
        double ab = 2;
        double ac = 2;
        double bc = 10;
        boolean out = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(out);
    }

}
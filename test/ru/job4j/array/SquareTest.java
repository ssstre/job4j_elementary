package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void bound3() {
        int[] rst = Square.calculate(3);
        int[] expected = new int[] {0, 1, 4};
        Assert.assertArrayEquals(rst, expected);
    }

    @Test
    public void bound5() {
        int[] rst = Square.calculate(5);
        int[] expected = new int[] {0, 1, 4, 9, 16};
        Assert.assertArrayEquals(rst, expected);
    }
}
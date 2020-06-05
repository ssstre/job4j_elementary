package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        SwitchArray.swap(input, 0, input.length - 1);
        int[] rsl = SwitchArray.swapBorder(input);
        Assert.assertArrayEquals(rsl, expect);
    }
}
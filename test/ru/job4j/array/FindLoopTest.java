package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

   @Test
   public void indexOf() {
       FindLoop find = new FindLoop();
       int[] input = new int[] {5, 10, 3};
       int value = 5;
       int expected = 0;
       int result = FindLoop.indexOf(input, value);
       Assert.assertEquals(result, expected);
   }
    public void indexOf1() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 6;
        int expected = -1;
        int result = FindLoop.indexOf(input, value);

        Assert.assertEquals(result, expected);
    }
}
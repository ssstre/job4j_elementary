package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        Assert.assertEquals(result, expect);
    }
    @Test
    public void indexOf1() {
      int[] input = new int[] {5, 2, 10, 2, 4};
      int value = 1;
      int start = 2;
      int finish = 4;
      int result = FindLoop.indexOf(input, value, start, finish);
      int expect = -1;
      Assert.assertEquals(result, expect);
  }
}
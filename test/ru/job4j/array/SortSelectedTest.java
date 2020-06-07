package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {


        @Test
        public void whenSort() {
            int[] input = new int[] {3, 4, 1, 2, 5};
            int[] result = SortSelected.sort(input);
            int[] expect = new int[] {1, 2, 3, 4, 5};
            Assert.assertArrayEquals(result, expect);
        }
    @Test
    public void Sort3() {
        int[] input = new int[] {3, 2, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3};
        Assert.assertArrayEquals(result, expect);
    }
    }

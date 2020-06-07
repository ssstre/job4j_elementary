package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinDiapasonTest {


        @Test
        public void whenFirstMin1() {
            int [] input = new int[] {-1, 0, 5, 10};
            int expected = 0;
            int out = MinDiapason.findMin(input, 1, 3);

            Assert.assertEquals(out, expected);
        }
        @Test
        public void whenLastMin1() {
            int [] input = new int[] {10, 5, 3, 1};
            int expected = 1;
            int out = MinDiapason.findMin(input, 1, 3);
            Assert.assertEquals(out, expected);
        }
        @Test
        public void whenMiddleMin1() {
            int [] input = new int[] {10, 2, 5, 1};
            int expected = 2;
            int out = MinDiapason.findMin(input, 0, 2);
            Assert.assertEquals(out, expected);
        }
    }

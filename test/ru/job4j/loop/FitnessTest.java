package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitnessTest {

    @Test
        public void whenIvanGreatNik() {
        int expected = 0;
        int month = Fitness.calc(95, 90);
            Assert.assertEquals(month, expected);
    }
    @Test
    public void whenIvanLessByOneNik() {
        int expected = 1;
        int month = Fitness.calc(90, 95);
        Assert.assertEquals(month, expected);
    }

    @Test
    public void whenIvanLessByFewNik() {
        int expected = 2;
        int month = Fitness.calc(50, 90);
        Assert.assertEquals(month, expected);
    }

    @Test
    public void whenIvanLessByFewNik1() {
        int expected = 1;
        int month = Fitness.calc(90, 90);
        Assert.assertEquals(month, expected);
    }
}
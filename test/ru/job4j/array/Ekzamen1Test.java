package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ekzamen1Test {

    @Test
    public void sorting() {
        int [] in = new int[] {1, 2};
        int [] in2 = new int[] {2, 30};
        boolean out = Ekzamen1.sorting(in, in2);
        Assert.assertTrue(out);
    }

   @Test
   public void poryadoktest() {
       int [] in = new int[] {1, 2, 3, 4};
       boolean out = Ekzamen1.poryadok(in);
       Assert.assertTrue(out);
   }
}
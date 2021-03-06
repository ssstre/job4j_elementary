package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        Assert.assertTrue(result);
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        Assert.assertTrue(result);
    }
    @Test
    public void whenDiagonal() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expect = {'X', 'X', 'X'};
        Assert.assertArrayEquals(result, expect);
    }
   @Test
   public void whenDataHMonoByTrueThenTrue() {
       char[][] input = {
               {' ', ' ', 'X', ' ', ' '},
               {' ', ' ', 'X', ' ', ' '},
               {'X', ' ', 'X', 'X', 'X'},
               {' ', ' ', 'X', ' ', ' '},
               {' ', ' ', 'X', ' ', ' '},
       };
       boolean result = MatrixCheck.isWin(input);
       Assert.assertTrue(result);
   }
}
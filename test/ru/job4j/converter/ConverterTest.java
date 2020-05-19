package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);

    }

    @Test
    public void whenConvert120RblThen2Dlr() {
        int in = 180;
        int expectedd = 3;
        int out1 = Converter.rubleToDollar(in);
        Assert.assertEquals(expectedd, out1);
    }
}
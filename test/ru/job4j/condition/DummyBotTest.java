package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        String question = "Привет, Бот.";
        String expected = "Привет, умник.";
        String out = DummyBot.answer(String question);
        Assert.assertEquals(expected, out);
        //assertThat(
          //      DummyBot.answer("Привет, Бот."),
            //    is("Привет, умник.")
       // );

    }


}
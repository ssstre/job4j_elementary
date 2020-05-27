package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        String question = "Привет, Бот.";
        String expected = "Привет, умник.";
        String out = DummyBot.answer(question);
        Assert.assertEquals(expected, out);
        //assertThat(
          //      DummyBot.answer("Привет, Бот."),
            //    is("Привет, умник.")
       // );

    }
    @Test
    public void whenByeBot() {
       // assertThat(
         //       DummyBot.answer("Пока."),
           //     is("До скорой встречи.")
        String question = "Пока.";
        String expection = "До скорой встречи.";
        String out = DummyBot.answer(question);
        Assert.assertEquals(expection, out);
    }

    @Test
    public void whenUnknownBot() {
        //assertThat(
        //      DummyBot.answer("Сколько будет 2 + 2?"),
        //    is("Это ставит меня в тупик. Задайте другой вопрос.")
        String question = "Сколько будет 2 + 2?";
        String expection = "Это ставит меня в тупик. Задайте другой вопрос.";
        String out = DummyBot.answer(question);
        Assert.assertEquals(expection, out);
    }

}
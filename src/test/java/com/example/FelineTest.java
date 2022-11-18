package com.example;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class FelineTest {
    private Feline feline;

    @Before
    public void startUp() {
        feline = new Feline();
    }

    @Test
    public void testEatMeat() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals("Ошибка!", expected, actual);
    }

    @Test
    public void testGetFamily() {
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals("Ошибка!", expected, actual);
    }

    @Test
    public void testGetKittensWithOutArguments() {
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals("Ошибка!", expected, actual);
    }

    @Test
    public void testGetKittensWithArguments() {
        int expected = 3;
        int actual = feline.getKittens(3);
        assertEquals("Ошибка!", expected, actual);
    }
}
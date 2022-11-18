package com.example;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    private Feline feline;
    private Cat cat;

    @Before
    public void startUp() {
        cat = new Cat(feline);
    }

    @Test
    public void getSound() {
        String expected = "Мяу";
        String actual = cat.getSound();
        assertEquals("Ошибка!", expected, actual);
    }

    @Test
    public void getFood() throws Exception {
        Mockito.when(cat.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = cat.getFood();
        assertEquals("Ошибка!", expected, actual);
    }
}
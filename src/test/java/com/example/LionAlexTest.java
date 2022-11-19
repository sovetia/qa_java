package com.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionAlexTest {
    @Mock
    private Feline feline;
    private LionAlex alex;

    @Before
    public void startUp() throws Exception {
        alex = new LionAlex(feline);
    }

    @Test
    public void getFriends() {
        List<String> expected = List.of("Марти", "Глория", "Мелман");
        List<String> actual = alex.getFriends();
        assertEquals("Ошибка!",expected, actual);
    }

    @Test
    public void getPlaceOfLiving() {
        String expected = "Нью-Йоркский зоопарк";
        String actual = alex.getPlaceOfLiving();
        assertEquals("Ошибка!",expected, actual);
    }

    @Test
    public void getKittens() {
        int expected = 0;
        int actual = alex.getKittens();
        assertEquals("Ошибка!",expected, actual);
    }
}

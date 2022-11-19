package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionTest {

    private final String sex;
    private final boolean hasMane;

    @Mock
    Feline feline;
    Lion lion;

    public LionTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters(name = "{0}")
    public static Object getCreate(){
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
                {"Трансгендер", false}
        };
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        try {
            lion = new Lion(feline, sex);
        } catch (Exception e) {
            String expectedException = "Используйте допустимые значения пола животного - самей или самка";
            Assert.assertEquals(expectedException, e.getMessage());
        }
    }

    @Test
    public void getKittens() {
        try {
            Mockito.when(feline.getKittens()).thenReturn(1);
            assertEquals("Ошибка!", 1, lion.getKittens());
        } catch (Exception e) {}
    }

    @Test
    public void doesHaveMane() {
        try {
            assertEquals("Ошибка!", hasMane, lion.doesHaveMane());
        } catch (Exception e) {}
    }

    @Test
    public void getFood() {
        try {
            lion.getFood();
            Mockito.verify(feline).getFood("Хищник");
        } catch (Exception e) {}
    }
}
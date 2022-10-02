package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {

    @Mock
    Feline feline;

    Alex alex = new Alex(feline);

    public AlexTest() throws Exception {
    }

    @Test
    public void validateGetFriendsAlex() {
        List <String> expected = List.of("Марти", "Глория", "Мелман");
        List <String> actual = alex.getFriends();
        assertEquals(expected, actual);
    }

    @Test
    public void validateGetPlaceOfLivingAlex() {
        String expected = "Нью-Йоркский зоопарк";
        String actual = alex.getPlaceOfLiving();
        assertEquals(expected, actual);
    }

    @Test
    public void validateGetKittensAlex() {
        int expected = 0;
        int actual = alex.getKittens();
        assertEquals(expected, actual);
    }

}
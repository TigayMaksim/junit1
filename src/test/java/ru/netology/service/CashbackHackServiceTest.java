package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.*;


public class CashbackHackServiceTest {


    @Test

    public void shouldFindAmount1() {

        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = 100;
        int expected = 100;
        assertEquals(expected, actual);
    }


    @Test

    public void shouldFindAmount2() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = 0;
        int expected = 100;

        assertEquals(expected, actual);
    }


    @Test

    public void shouldFindAmount3() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = 0;
        int expected = 0;

        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    public void shouldFindAmount4() {

        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = 100;
        int expected = 100;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldFindAmount5() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = 0;
        int expected = 100;

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldFindAmount6() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = 0;
        int expected = 0;

        assertEquals(expected, actual);
    }


}
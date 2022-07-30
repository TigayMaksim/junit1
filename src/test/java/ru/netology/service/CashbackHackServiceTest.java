package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class CashbackHackServiceTest {
    

    @Test

    void shouldFindAmount1() {

        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = 100;
        int expected =100;

        assertEquals(actual,expected);
    }


    @Test

    void shouldFindAmount2() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = 0;
        int expected =100;

        assertEquals(actual,expected);
    }


    @Test

    void shouldFindAmount3() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = 0;
        int expected =0;

        assertEquals(actual,expected);
    }
}
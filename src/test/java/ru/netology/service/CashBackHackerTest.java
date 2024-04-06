package ru.netology.service;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;


public class CashBackHackerTest {
    CashBackHacker cashBackHacker = new CashBackHacker();

    //Когда сумма меньше границы, предлагает докупить ещё на сумму expected
    @Test
    public void testWhenRemainLessThatBoundary() {
        int amount = 400;

        int expected = 600;
        int actual = cashBackHacker.remain(amount);

        assertEquals(actual, expected);
    }

    //Когда сумма равна границе, expected должен быть = 0
    @Test
    public void testWhenRemainEqualToBoundary() {
        int amount = 1_000;

        int expected = 0;
        int actual = cashBackHacker.remain(amount);

        assertEquals(actual, expected);
    }

    //Когда сумма больше границы, предлагает докупить ещё на сумму expected
    @Test
    public void testWhenRemainMoreThanBoundary() {
        int amount = 1_900;

        int expected = 100;
        int actual = cashBackHacker.remain(amount);

        assertEquals(actual, expected);
    }
}

package ru.netology.BasicsOfAutomation;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = cashbackHackService.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainWithBoundaryAmount() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainWithZeroAmount() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = cashbackHackService.remain(amount);
        Assert.assertEquals(expected, actual);
    }

}
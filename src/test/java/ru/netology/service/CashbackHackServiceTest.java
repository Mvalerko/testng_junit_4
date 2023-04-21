package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test
public class CashbackHackServiceTest {

    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);

        Assert.assertEquals(actual, expected);
    }

    public void testRemainOver() {
        CashbackHackService service = new CashbackHackService();
        int expected = 200;
        int actual = service.remain(1800);

        Assert.assertEquals(actual, expected);
    }
    public void testRemainZero() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int actual = service.remain(0);

        Assert.assertEquals(actual, expected);
    }

    public void testRemainNegative() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1001;
        int actual = service.remain(-1);

        Assert.assertEquals(actual, expected);
    }

    public void testRemainThousand() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(actual, expected);
    }

}
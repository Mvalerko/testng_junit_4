package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class CashbackHackServiceTest {
    @Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();
        int expected = 400;
        int actual = service.remain(600);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void remainZero() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int actual = service.remain(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remainNegative() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1001;
        int actual = service.remain(-1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remainOver() {
        CashbackHackService service = new CashbackHackService();
        int expected = 700;
        int actual = service.remain(1300);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remainThousand() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(expected, actual);
    }
}
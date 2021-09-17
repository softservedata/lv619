package com.softserve.addtest;
import com.softserve.add.App8;
import org.junit.Assert;
import org.junit.Test;

public class App8Test {

    @Test
    public void testFindDivisor() {
        int a = 15;
        int b = 20;
        int expected = 5;
        Assert.assertEquals(expected, App8.findDivisor(a,b));
    }
}
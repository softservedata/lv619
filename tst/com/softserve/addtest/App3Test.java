package com.softserve.addtest;

import org.junit.Assert;
import org.junit.Test;

import com.softserve.add.App3;

public class App3Test {

    @Test
    public void testCountSum() {
        double expected = 1513;
        Assert.assertEquals(expected, App3.countSum(2), 0.0001);

    }
}
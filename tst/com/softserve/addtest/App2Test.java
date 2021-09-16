package com.softserve.addtest;

import org.junit.Assert;
import org.junit.Test;

import com.softserve.add.App2;

public class App2Test {

    @Test
    public void testCreateOreder() {
        double [] expected = {0, 5F/8, 0.3125};
        Assert.assertArrayEquals(expected, App2.createOrder(3), 0.0001);

    }
}
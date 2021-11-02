package com.softserve.addtest;

import org.junit.Assert;
import org.junit.Test;

import com.softserve.add.App4;

public class App4Test {

    @Test
    public void testCountSum() {
        double[] expected = {1, 3, 6};
        double[] numbers = {1, 2, 3};
        Assert.assertArrayEquals(expected, App4.createOrder(numbers), 0.0001);

    }
}
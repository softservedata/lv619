package com.softserve.addtest;

import org.junit.Assert;
import org.junit.Test;

import com.softserve.add.App1;

public class App1Test {

    @Test
    public void testCountCentury() {
        Assert.assertTrue(App1.countCentury(2000) == 20);
        Assert.assertTrue(App1.countCentury(1) == 1);
    }


}

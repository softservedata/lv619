package com.softserve.addtest;
import com.softserve.add.App10;
import org.junit.Assert;
import org.junit.Test;

public class App10Test {

    @Test
    public void testCountPointsInCircle() {
        double [] a = {1, 2 , 3, 4};
        double r = 4;
        int expected = 2;
        Assert.assertEquals(expected, App10.countPointsInCircle(a, r));
    }
}
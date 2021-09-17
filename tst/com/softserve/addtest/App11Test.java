package com.softserve.addtest;
import com.softserve.add.App11;
import org.junit.Assert;
import org.junit.Test;

public class App11Test {

    @Test
    public void testFindTimeInQueue() {
        double [] a = {1, 2.01 , 3, 4};
        double [] expected = {1, 3.01 , 6.01, 10.01};
        Assert.assertArrayEquals(expected, App11.findTimeInQueue(a), 0.001);
    }
    @Test
    public void testFindFasterCustomer() {
        double [] a = {1, 2 , 0.5, 4};
        int expected = 3;
        Assert.assertEquals(expected, App11.findFasterCustomer(a));
    }
}
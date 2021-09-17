package com.softserve.addtest;
import com.softserve.add.App12;
import org.junit.Assert;
import org.junit.Test;

public class App12Test {

    @Test
    public void testFindFinalRate() {
        double [] a = {1, 2 , 0.5, 4};
        double expected = 1.5;
        Assert.assertEquals(expected, App12.findFinalRate(a), 0.001);
    }
}
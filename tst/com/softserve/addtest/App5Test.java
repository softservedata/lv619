package com.softserve.addtest;
import com.softserve.add.App5;
import org.junit.Assert;
import org.junit.Test;

public class App5Test {

    @Test
    public void testDefineTriangle() {
        double[] sides= {3, 4, 5};
        int expected = 1;
        Assert.assertEquals(expected, App5.defineTriangle(sides));
        double[] sides1= {3, 4, 3};
        expected = 2;
        Assert.assertEquals(expected, App5.defineTriangle(sides1));
        double[] sides2= {4, 4, 4};
        expected = 3;
        Assert.assertEquals(expected, App5.defineTriangle(sides2));
        double[] sides3= {1, 2, 3};
        expected = 0;
        Assert.assertEquals(expected, App5.defineTriangle(sides3));

    }
}
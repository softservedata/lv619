package com.softserve.addtest;
import com.softserve.add.App7;
import org.junit.Assert;
import org.junit.Test;

public class App7Test {

    @Test
    public void testFindPosition() {
        int n = 20;
        int expected = 9;
        Assert.assertEquals(expected, App7.findPosition(n));
    }
}
package com.softserve.addtest;
import com.softserve.add.App9;
import org.junit.Assert;
import org.junit.Test;

public class App9Test {

    @Test
    public void testFindValue() {
        int a = 4;
        double expected = 0.29856;
        Assert.assertEquals(expected, App9.findValue(a), 0.0001);
    }
}
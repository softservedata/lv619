package com.softserve.addtest;
import com.softserve.add.App6;
import org.junit.Assert;
import org.junit.Test;

public class App6Test {

    @Test
    public void testFindNumber() {
        int [] a = {2, 3, 2, 2};
        int expected = 1;
        Assert.assertEquals(expected, App6.findNumber(a));
    }
}
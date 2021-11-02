package com.softserve.pt10test;

import com.softserve.pt10.App3;
import org.junit.Assert;
import org.junit.Test;

public class App3Test {
    @Test
    public void TestCheckValid() {
        String userName = "________";
        boolean expected = true;
        Assert.assertEquals(expected, App3.checkValid(userName));
    }
}

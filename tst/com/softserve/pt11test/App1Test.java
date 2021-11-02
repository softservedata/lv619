package com.softserve.pt11test;

import com.softserve.pt11.task1.App1;
import com.softserve.pt11.task1.NegativeValueExeption;
import org.junit.Assert;
import org.junit.Test;

public class App1Test {
    @Test
    public void testSquareRectangle() {
        int a = 5;
        int b = 4;
        int expected = 20;
        try {
            Assert.assertEquals(expected, App1.squareRectangle(a,b));
        } catch (NegativeValueExeption e) {
            e.printStackTrace();
        }
    }
}

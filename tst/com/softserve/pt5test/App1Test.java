package com.softserve.pt5test;

import com.softserve.pt5.App1;
import org.junit.Assert;
import org.junit.Test;

public class App1Test {
    @Test
    public void TestFindBiggest() {
         int[] a = {1, 3, 7, 4};
         int expected = 7;
         Assert.assertEquals(App1.findBiggest(a),expected);
    }
    @Test
    public void TestFindSumPositive() {
        int[] a = {1, 3, -1, 4};
        int expected = 8;
        Assert.assertEquals(App1.findSumPositive(a),expected);
    }
    @Test
    public void TestFindAmountOfNegative() {
        int[] a = {1, 3, -1, 4};
        int expected = 1;
        Assert.assertEquals(App1.findAmountOfNegative(a),expected);
    }
    @Test
    public void TestFindAmountOfPositive() {
        int[] a = {1, 3, -1, 4};
        int expected = 3;
        Assert.assertEquals(App1.findAmountOfPositive(a),expected);
    }
    @Test
    public void TestFindValuesMore() {
        int[] a = {1, 3, -1, 4};
        String  expected = "positive";
        Assert.assertEquals(App1.findValuesMore(a),expected);
    }
}

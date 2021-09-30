package com.softserve.hw10test;

import com.softserve.hw10.App3;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class App3Test {

    @Test
    public void TestCheckPattern() {
        String pattern = "$12.44 ekjlwjrwl $12227.44 fgg$11.22erer";
        List<String> expected = new ArrayList<>();
        expected.add("$12.44");
        expected.add("$12227.44");
        Assert.assertEquals(expected, App3.findPattern(pattern));
    }
}

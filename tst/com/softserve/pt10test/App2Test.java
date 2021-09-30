package com.softserve.pt10test;

import com.softserve.pt10.App2;
import org.junit.Assert;
import org.junit.Test;

public class App2Test {

    @Test
    public void TestOutputSurnameInitials() {
        String name = "Ivanov Ivan Ivanovych";
        String expected = "Ivanov I. I.";
        Assert.assertEquals(expected, App2.outputSurnameInitials(name));
    }

    @Test
    public void TestOutputName() {
        String name = "Ivanov Ivan Ivanovych";
        String expected = "Ivan";
        Assert.assertEquals(expected, App2.outputName(name));
    }

    @Test
    public void TestOutputFullName() {
        String name = "Ivanov Ivan Ivanovych";
        String expected = "Ivan Ivanovych Ivanov";
        Assert.assertEquals(expected, App2.outputFullName(name));
    }
}

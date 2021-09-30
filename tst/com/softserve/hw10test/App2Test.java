package com.softserve.hw10test;

import com.softserve.hw10.App2;
import org.junit.Assert;
import org.junit.Test;

public class App2Test {

    @Test
    public void TestConvertAllSpaces() {
        String sentence = "I    am      learning     Java   Core";
        String expected = "I am learning Java Core";
        Assert.assertEquals(expected, App2.convertAllSpaces(sentence));
    }
}

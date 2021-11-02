package com.softserve.hw10test;

import com.softserve.hw10.App1;
import org.junit.Assert;
import org.junit.Test;

public class App1Test {

    @Test
    public void testFindLongestWord() {
        String sentence = "Enter in the console sentence";
        String expected = "sentence";
        Assert.assertEquals(expected, App1.findLongestWord(sentence));
    }

    @Test
    public void testDetemineNumbersOfLatters() {
        String word = "sentence";
        int expected = 8;
        Assert.assertEquals(expected, App1.determineNumbersOfLatters(word));
    }

    @Test
    public void testReverseSecondWord() {
        String sentence = "Enter in the console sentence";
        String expected = "Enter ni the console sentence";
        Assert.assertEquals(expected, App1.reverseSecondWord(sentence));
    }
}

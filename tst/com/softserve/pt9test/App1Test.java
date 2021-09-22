package com.softserve.pt9test;

import org.junit.Assert;
import org.junit.Test;
import com.softserve.pt9.App1;
import java.util.LinkedList;
import java.util.List;


public class App1Test {
    @Test
    public void testFindMoreThanFive() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(7);
        list.add(1);
        list.add(1);
        list.add(1);
        List<Integer> expected = new LinkedList<>();
        expected.add(7);
        Assert.assertEquals(expected, App1.findMoreThanFive(list));

    }
}

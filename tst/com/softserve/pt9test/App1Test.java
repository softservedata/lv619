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

    @Test
    public void testRemoveMoreThanTwenty() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(7);
        list.add(25);
        list.add(1);
        list.add(25);
        List<Integer> expected = new LinkedList<>();
        expected.add(1);
        expected.add(7);
        expected.add(1);
        Assert.assertEquals(expected, App1.removeMoreThanTwenty(list));
    }

    @Test
    public void testInsertNumbers() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(7);
        list.add(25);
        list.add(1);
        list.add(25);
        list.add(1);
        list.add(1);

        List<Integer> expected = new LinkedList<>();
        expected.add(1);
        expected.add(7);
        expected.add(-1);
        expected.add(25);
        expected.add(1);
        expected.add(-4);
        expected.add(25);
        expected.add(1);
        expected.add(-3);
        expected.add(1);
        Assert.assertEquals(expected, App1.insertNumbers(list));
    }

    @Test
    public void TestSortList() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(7);
        list.add(25);
        list.add(1);
        list.add(25);
        list.add(1);
        list.add(1);

        List<Integer> expected = new LinkedList<>();
        expected.add(25);
        expected.add(25);
        expected.add(7);
        expected.add(1);
        expected.add(1);
        expected.add(1);
        expected.add(1);


        Assert.assertEquals(expected, App1.sortList(list));
    }
}

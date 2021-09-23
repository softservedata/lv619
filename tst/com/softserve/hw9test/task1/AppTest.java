package com.softserve.hw9test.task1;

import com.softserve.hw9.task1.App;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class AppTest {

    @Test
    public void testUnion() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        Set<Integer> expected = new HashSet<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        Assert.assertEquals(expected, App.union(set1, set2));
    }

    @Test
    public void testIntersect() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        Set<Integer> expected = new HashSet<>();
        expected.add(2);
        Assert.assertEquals(expected, App.intersect(set1, set2));
    }
}

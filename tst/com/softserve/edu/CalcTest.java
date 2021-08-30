package com.softserve.edu;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcTest {
    private static Calc calc;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("@BeforeClass setUpBeforeClass()");
        calc = new Calc();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("@AfterClass tearDownAfterClass()");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("\t@Before setUp()");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("\t@After tearDown()");
    }

    @Test
    public void testAdd1() {
        //fail("Not yet implemented");
        System.out.println("\t\t@Test testAdd1()");
        //double i = 1 / 0.0;
        //System.out.println("\t\ti = " + i);
        //
        //Calc calc = new Calc();
        double actual;
        double expected = 10;
        actual = calc.add(5, 5.0001);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testAdd2() {
        System.out.println("\t\t@Test testAdd2()");
        //double i = 1 / 0.0;
        //System.out.println("\t\ti = " + i);
        //
        //Calc calc = new Calc();
        double actual;
        double expected = 10;
        actual = calc.add(4, 6);
        Assert.assertEquals(expected, actual, 0.001);
    }
    
    @Test
    public void testDiv1() {
        //fail("Not yet implemented");
        System.out.println("\t\t@Test testDiv1()");
        //
        //Calc calc = new Calc();
        double actual;
        double expected = 8;
        actual = calc.div(40, 5);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testDiv2() {
        //fail("Not yet implemented");
        System.out.println("\t\t@Test testDiv2()");
        //
        //Calc calc = new Calc();
        double actual;
        double expected = 2.5;
        actual = calc.div(40, 16);
        Assert.assertEquals(expected, actual, 0.001);
    }
    
    @Test
    public void testStud() {
        System.out.println("\t\t@Test testStud()");
        //
        Student st1 = new Student("Ivan", 25);
        Student st2 = new Student("Ivan", 25);
        Assert.assertEquals(st1, st2);
    }
}

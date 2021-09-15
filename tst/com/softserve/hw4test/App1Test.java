package com.softserve.hw4test;

import org.junit.Assert;
import org.junit.Test;

import com.softserve.hw4.App1;

public class App1Test {

	@Test
	public void testTask1() {
		Assert.assertTrue(App1.task1(2) == 28);
	}

	@Test
	public void testTask2() {
		int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		String result = App1.task2(a1);
		String expected = "Sum of first 5 elements 15";
		Assert.assertEquals(result, expected);
	}


	@Test
	public void testPossitionOfNegative() {
		int[] a1 = {1, 2, 3, -4, 5, 6, 7, 8, 9, 10};
		Assert.assertTrue(App1.possitionOfNegative(a1) == 3);
	}

	@Test
	public void testPossitionOfSDPositive() {
		int[] a1 = {1, 2, 3, -4, 5, 6, 7, 8, 9, 10};
		Assert.assertTrue(App1.possitionOfSDPositive(a1) == 1);
	}

	@Test
	public void testMinimumOfArray() {
		int[] a1 = {1, 2, 3, -4, 5, 6, 7, 8, 9, 10};
		int[] expected = {1, 0};
		Assert.assertArrayEquals(App1.minimumOfArray(a1), expected);
	}

	@Test
	public void testProductEven() {
		int[] a1 = {1, 2, 3, -4, 5, 6, 7, 8, 9, 10};
		Assert.assertTrue(App1.productEven(a1) == 2);
	}

	@Test
	public void testFinalArray() {
	int[] a1 = {1, 2, 3, -4, 5, 6, 7, 8, 9, 10};
	int[] expected = {1, 2, 3};
		Assert.assertArrayEquals(App1.finalArray(a1),expected );
	}
}

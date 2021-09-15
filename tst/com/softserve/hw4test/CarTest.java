package com.softserve.hw4test;

import com.softserve.hw4.Car;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CarTest {
	static Car [] cars = new Car[4];

	@BeforeClass
	public static void setUpBeforeClass() {
		cars[0] = new Car("VW", 2011, 2.0F);
		cars[1] = new Car("BMW", 2011, 1.8F);
		cars[2] = new Car("Mercedes", 2000, 2.3F);
		cars[3] = new Car("Audi", 2004, 3.0F);
	}

	@Test
	public void testSortByYear() {
		Car [] expected = {cars[2], cars[3], cars[0], cars[1]};
		Assert.assertArrayEquals(Car.sortByYear(cars), expected);

	}

	@Test
	public void testGetCarsByYear() {
		Car [] expected = {cars[0], cars[1]};
		Assert.assertArrayEquals(Car.getCarsByYear(2011, cars), expected);
	}

}

package hwArraysLoopsTests;
import org.junit.Test;

import _05_arraysLoops.hw4.Car;

import static org.junit.Assert.assertEquals;

public class Test4 {
	private final Car car1 = new Car();
	private final Car car2 = new Car('B', 1888, 1000);
	private final Car car3 = new Car('P', 2021, 4000);
	@Test
	public void carClassTest() {
		assertEquals(new Car(), car1);
		assertEquals(new Car('B', 1888, 1000), car2);
		assertEquals(new Car('P', 2021, 4000), car3);
	}

}

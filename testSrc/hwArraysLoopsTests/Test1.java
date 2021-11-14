package hwArraysLoopsTests;
import java.time.Month;
import org.junit.Test;

import _05_arraysLoops.hw1.Clndr;

import static org.junit.Assert.assertEquals;

public class Test1 {
	private final Clndr clndr = new Clndr();
	@Test
	public void getDaysInMonthToStringTest() {
		assertEquals("31", clndr.getDaysInMonthToString(Month.DECEMBER));		
		assertEquals("31", clndr.getDaysInMonthToString(Month.JANUARY));
		assertEquals("28 (29)", clndr.getDaysInMonthToString(Month.FEBRUARY));
	}
}

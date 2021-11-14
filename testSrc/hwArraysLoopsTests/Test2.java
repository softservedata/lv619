package hwArraysLoopsTests;
import org.junit.Test;

import _05_arraysLoops.hw2.Mth;

import static org.junit.Assert.assertEquals;

public class Test2 {
	private final Mth mth = new Mth();
	@Test
	public void sumOfFirstFiveTest() {
		assertEquals(0, mth.sumOfFirstFive(null));
		assertEquals(0, mth.sumOfFirstFive(new int[]{}));
		assertEquals(0, mth.sumOfFirstFive(new int[]{0,1,2,3}));
		assertEquals(10, mth.sumOfFirstFive(new int[]{0,1,2,3,4}));
		assertEquals(10, mth.sumOfFirstFive(new int[]{0,1,2,3,4,5}));
		assertEquals(15, mth.sumOfFirstFive(new int[]{5,4,3,2,1,0}));
	}
	@Test
	public void prodOfLastFiveTest() {
		assertEquals(0, mth.prodOfLastFive(null));
		assertEquals(0, mth.prodOfLastFive(new int[]{}));
		assertEquals(0, mth.prodOfLastFive(new int[]{0,1,2,3}));
		assertEquals(0, mth.prodOfLastFive(new int[]{0,1,2,3,4}));
		assertEquals(120, mth.prodOfLastFive(new int[]{0,1,2,3,4,5}));
		assertEquals(0, mth.prodOfLastFive(new int[]{5,4,3,2,1,0}));
		assertEquals(15120, mth.prodOfLastFive(new int[]{0,1,2,3,4,5,6,7,8,9}));
	}
	@Test
	public void isFirstFivePositiveTest() {
		assertEquals(false, mth.isFirstFivePositive(null));
		assertEquals(false, mth.isFirstFivePositive(new int[]{}));
		assertEquals(false, mth.isFirstFivePositive(new int[]{0,1,2,3}));
		assertEquals(true, mth.isFirstFivePositive(new int[]{0,1,2,3,4}));
		assertEquals(false, mth.isFirstFivePositive(new int[]{0,1,2,3,-4,}));
		assertEquals(false, mth.isFirstFivePositive(new int[]{0,-1,2,3,4}));
		assertEquals(true, mth.isFirstFivePositive(new int[]{0,1,2,3,4,-5}));
	}
}

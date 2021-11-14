package hwArraysLoopsTests;
import org.junit.Test;

import _05_arraysLoops.hw3.IntArr;

import static org.junit.Assert.assertEquals;

public class Test3 {
	IntArr intArr = new IntArr();
	@Test
	public void getSecondPositiveNumIndxTest() {
		assertEquals(-1, intArr.getSecondPositiveNumIndx(null));
		assertEquals(-1, intArr.getSecondPositiveNumIndx(new int[]{}));
		assertEquals(-1, intArr.getSecondPositiveNumIndx(new int[]{0,-1,2,-3}));
		assertEquals(-1, intArr.getSecondPositiveNumIndx(new int[]{-1,-2,-3,-4,5}));
		assertEquals(4, intArr.getSecondPositiveNumIndx(new int[]{0,-1,2,-3,4}));
		assertEquals(2, intArr.getSecondPositiveNumIndx(new int[]{-5,4,3,2,-1,0}));
		assertEquals(9, intArr.getSecondPositiveNumIndx(new int[]{0,1,-2,-3,-4,-5,-6,-7,-8,9}));
	}
	@Test
	public void minNumTest() {
		assertEquals(-1, intArr.minNum(new int[] {-1}));
		assertEquals(-1, intArr.minNum(new int[] {-1,0,1}));
		assertEquals(-1, intArr.minNum(new int[] {1,0,-1}));
		assertEquals(0, intArr.minNum(new int[] {0,1,2}));
		assertEquals(-3, intArr.minNum(new int[] {1,2,-3}));
		assertEquals(-2, intArr.minNum(new int[] {3,-2,-1}));
	}
	@Test
	public void minNumIndxTest() {
		assertEquals(0, intArr.minNumIndx(new int[] {0}));
		assertEquals(0, intArr.minNumIndx(new int[] {-1,0,1}));
		assertEquals(2, intArr.minNumIndx(new int[] {1,0,-1}));
		assertEquals(0, intArr.minNumIndx(new int[] {0,1,2}));
		assertEquals(2, intArr.minNumIndx(new int[] {1,2,-3}));
		assertEquals(1, intArr.minNumIndx(new int[] {3,-2,-1}));
	}
	@Test
	public void prodOfEvenTest() {
		assertEquals(0, intArr.prodOfEven(new int[] {}));
		assertEquals(0, intArr.prodOfEven(new int[] {1,3,5,7,9}));
		assertEquals(0, intArr.prodOfEven(new int[] {0}));
		assertEquals(0, intArr.prodOfEven(new int[] {0,2,4,6,8}));
		assertEquals(8, intArr.prodOfEven(new int[] {1,2,3,4,5}));
		assertEquals(3840, intArr.prodOfEven(new int[] {2,4,6,8,10}));
		assertEquals(3840, intArr.prodOfEven(new int[] {2,-4,6,-8,10}));
		assertEquals(-3840, intArr.prodOfEven(new int[] {1,-2,-3,4,5,-6,-7,8,9,-10}));
	}
}

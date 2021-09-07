import org.junit.Assert;
import org.junit.Test;
import com.softserve.edu05.CalcArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CalcArraysTest {
    @Test
    public void calcSumTest1() {
        int[] array = {1,4,6,7,-3,3,5,6,3,2};
        CalcArrays calcArrays = new CalcArrays(array);
        int actual = calcArrays.calcSum();
        int expected = 19;
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void calcSumTest2() {
        int[] array = {2,4,6,73,24,56,3,55};
        CalcArrays calcArrays = new CalcArrays(array);
        int actual = calcArrays.calcSum();
        int expected = 223;
        Assert.assertEquals(expected,actual);

    }
}

import org.junit.Assert;
import org.junit.Test;
import com.softserve.edu5.FindNumbers;

public class FindNumbersTest {
    @Test
    public void findPosTest() {
        int[] array = {2,3,-5,-7,5};
        FindNumbers findNumbers = new FindNumbers(array);
        int actual = findNumbers.findPos();
        int expected = 3;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void findMinTest() {
        int[] array = {2,-5,6,-10,14};
        FindNumbers findNumbers = new FindNumbers(array);
        int actual = findNumbers.findMin();
        int expected = -10;
        Assert.assertEquals(expected,actual);
    }
}

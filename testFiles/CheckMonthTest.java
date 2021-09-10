import com.softserve.edu5.CheckMonth;
import org.junit.Assert;
import org.junit.Test;

public class CheckMonthTest {
    @Test
    public void checkTest1() {
        CheckMonth check = new CheckMonth(2);
        int actual = check.check();
        int expected = 28;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void checkTest2() {
        CheckMonth check = new CheckMonth(19);
        int actual = check.check();
        int expected = 0;
        Assert.assertEquals(expected,actual);
    }
}

import org.junit.Assert;
import org.junit.Test;

import com.softserve.edu05.Car;

public class CarTest {
    @Test
    public void testCar() {
        Car[] actual = {
                new Car("BMW",300),
                new Car("Mersedes", 500),
                new Car("Audi",350),
                new Car("Huidai",400)
        };
        Car[] expected = Car.sortCars(actual);

        Assert.assertArrayEquals(actual,expected);
    }
}

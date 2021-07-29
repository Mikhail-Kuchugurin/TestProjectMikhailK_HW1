package hw1;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorSubTest extends AbstractCalculatorTest {


    @Test(dataProvider = "SubDataProvider", dataProviderClass = TestData.class, groups = "group1")
    public void testSubLong(long a, long b, long c) {
        long actual = calculator.sub(a, b);
        assertEquals(actual, c) ;

    }
}

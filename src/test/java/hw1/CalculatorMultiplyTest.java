package hw1;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorMultiplyTest extends AbstractCalculatorTest {


    @Test(dataProvider = "MultiplyDataProvider", dataProviderClass = TestData.class, groups = "group2")
    public void testMultiplyLong(long a, long b, long c) {
        long actual = calculator.mult(a, b);
        assertEquals(actual, c) ;

    }
}

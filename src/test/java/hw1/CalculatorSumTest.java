package hw1;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorSumTest extends AbstractCalculatorTest {

    @Test(dataProvider = "SumDataProvider", dataProviderClass = TestData.class, groups = {"group1"})
    public void testSumLong(long a, long b, long c) {
        long actual = calculator.sum(a, b);
        assertEquals(actual, c) ;

    }
}

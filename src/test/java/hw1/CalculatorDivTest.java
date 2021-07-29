package hw1;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorDivTest extends AbstractCalculatorTest {


    @Test(dataProvider = "DivDataProvider", dataProviderClass = TestData.class,  groups = "group2")
    public void testDivLong(long a, long b, long c) {
        long actual = calculator.div(a, b);
        assertEquals(actual, c) ;

    }
}

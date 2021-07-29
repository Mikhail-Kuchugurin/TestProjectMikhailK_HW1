package hw1;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class AbstractCalculatorTest {

    protected Calculator calculator;

    @BeforeMethod(alwaysRun=true)
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterMethod(alwaysRun=true)
    public void tearDown() {
        calculator = null;
    }

}

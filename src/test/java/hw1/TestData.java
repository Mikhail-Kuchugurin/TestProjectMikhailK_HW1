package hw1;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "DivDataProvider")
    public Object[][] divDataProvider() {
        return new Object[][] {
                {10,10,1},
                {5,5,1},
                {2,2,1}
        };
    }
    @DataProvider(name = "SubDataProvider")
    public Object[][] subDataProvider() {
        return new Object[][] {
                {10,10,0},
                {5,5,0},
                {2,2,0}
        };
    }

    @DataProvider(name = "MultiplyDataProvider")
    public Object[][] multiplyDataProvider() {
        return new Object[][] {
                {10,10,100},
                {5,5,25},
                {2,2,4}
        };
    }
    @DataProvider(name = "SumDataProvider")
    public Object[][] sumDataProvider() {
        return new Object[][] {
                {10,10,20},
                {5,5,10},
                {2,2,4}
        };
    }
}

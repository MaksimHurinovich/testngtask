package com.epam.tat.module4.test;

import com.epam.tat.module4.Timeout;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by Maksim_Hurinovich on 4/10/2018.
 */
public class SumDoubleTest extends BaseCalculatorTest{

    @DataProvider(name = "sumDoubleDp")
    public static Object[][] sumDoubleDp(){
        return new Object[][]{
                {0.5, 0.75, 1.25},
                {1, 3, 4},
                {-6.3, 0, -6.3}
        };
    }

    @Test(dataProvider = "sumDoubleDp")
    public void sumDoubleTest(double arg1, double arg2, double expected){
        double result = calculator.sum(arg1, arg2);
        assertEquals(result, expected, "defect founded in sum with double arguments");
        Timeout.sleep(1);
        checkTime();
    }
}

package com.epam.tat.module4.test;

import com.epam.tat.module4.Timeout;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by Maksim_Hurinovich on 4/10/2018.
 */
public class MultDoubleTest extends BaseCalculatorTest{

    @DataProvider(name = "multDoubleDp")
    public static Object[][] sumDoubleDp(){
        return new Object[][]{
                {0.5, 0.5, 0.25},
                {15, 3, 45},
                {6.3, 0, 0}
        };
    }

    @Test(dataProvider = "multDoubleDp")
    public void sumDoubleTest(double arg1, double arg2, double expected){
        double result = calculator.mult(arg1, arg2);
        assertEquals(result, expected, "defect founded in mult with double arguments");
        Timeout.sleep(1);
        checkTime();
    }
}

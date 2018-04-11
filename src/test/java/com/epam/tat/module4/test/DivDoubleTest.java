package com.epam.tat.module4.test;

import com.epam.tat.module4.Timeout;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Maksim_Hurinovich on 4/11/2018.
 */
public class DivDoubleTest extends BaseCalculatorTest{

    @Test(expectedExceptions = NumberFormatException.class, expectedExceptionsMessageRegExp = ".*Attempt.*")
    public void zeroDivisionTest(){
        double result = calculator.div(123.35, 0d);
        Timeout.sleep(1);
        checkTime();    }

    @DataProvider(name = "divDoubleDp")
    public Object[][] divDoubleDp(){
        return new Object[][]{
                {34d, 2d, 17d},
                {0d, 2253546246d, 0d},
                {-12d, 2d, -6d}
        };
    }

    @Test(dataProvider = "divDoubleDp")
    public void divDoubleTest(double arg1, double arg2, double expected){
        Assert.assertEquals(calculator.div(arg1, arg2), expected, "Defect founded in div double args");
        Timeout.sleep(1);
    }
}

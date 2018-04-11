package com.epam.tat.module4.test;

import com.epam.tat.module4.Timeout;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Maksim_Hurinovich on 4/11/2018.
 */
public class DivTest extends BaseCalculatorTest{

    @Test(expectedExceptions = NumberFormatException.class, expectedExceptionsMessageRegExp = ".*Attempt.*")
    public void zeroDivisionTest(){
        long result = calculator.div(351572L, 0L);
        Timeout.sleep(1);
        checkTime();

    }

    @DataProvider(name = "divDp")
    public Object[][] divDp(){
        return new Object[][]{
                {4L, 2L, 2L},
                {0L, 4L, 0L},
                {-2L, 1L, -2L}
        };
    }

    @Test(dataProvider = "divDp")
    public void divTest(long arg1, long arg2, long expected){
        Assert.assertEquals(calculator.div(arg1, arg2), expected, "Defect founded in div");
        Timeout.sleep(1);
        checkTime();
    }
}



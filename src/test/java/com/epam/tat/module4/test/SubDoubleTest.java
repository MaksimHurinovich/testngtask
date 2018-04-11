package com.epam.tat.module4.test;

import com.epam.tat.module4.Timeout;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Maksim_Hurinovich on 4/10/2018.
 */
public class SubDoubleTest extends BaseCalculatorTest{

    @Test(dataProvider = "subDp")
    public void subTest(double arg1, double arg2, double expected){
        double result = calculator.sub(arg1, arg2);
        Assert.assertEquals(result, expected, 0.0001, "Defect founded in sub double arguments");
        Timeout.sleep(1);
        checkTime();
    }

    @DataProvider(name = "subDp")
    public Object[][] sumDp() {
        return new Object[][]{
                {35, .2, 34.8},
                {0, 0, 0},
                {-0.3d, 2.4d, -2.7d}
        };
    }
}

package com.epam.tat.module4.test;


import com.epam.tat.module4.Timeout;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Maksim_Hurinovich on 4/11/2018.
 */

public class PowTest extends BaseCalculatorTest {


    @Test
    @Parameters({"arg1", "arg2", "expected"})
    public void powTest(double arg1, double arg2, double expected){
        Assert.assertEquals(calculator.pow(arg1, arg2), expected, "Defect found in pow");
        Timeout.sleep(1);
        checkTime();
    }
}

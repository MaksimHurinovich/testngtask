package com.epam.tat.module4.test;


import com.epam.tat.module4.Timeout;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Maksim_Hurinovich on 4/11/2018.
 */


public class PositiveNegativeTest extends BaseCalculatorTest{

    @Test
    public void isPositiveTest(){
        Assert.assertEquals(calculator.isPositive(0L), false);
        Timeout.sleep(1);
        checkTime();
    }

    @Test
    public void isNegativeTest(){
        Assert.assertEquals(calculator.isNegative(6L), false);
        Timeout.sleep(1);
        checkTime();
    }
}

package com.epam.tat.module4.test;

import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Maksim_Hurinovich on 4/11/2018.
 */
public class SqrtTest {

    static private Calculator calculator;

    @BeforeClass
    public static void init(){
        calculator = new Calculator();
    }

    @Test(expected = NumberFormatException.class)
    public void sqrtNegativeTest(){
        calculator.sqrt(-25d);

    }

    @Test
    public void sqrtTest(){
        Assert.assertEquals(calculator.sqrt(256d), 16d, 0.0001);
    }

}

package com.epam.tat.module4.test;

import com.epam.tat.module4.Calculator;
import com.epam.tat.module4.Timeout;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.Date;

/**
 * Created by Maksim_Hurinovich on 4/10/2018.
 */
public class BaseCalculatorTest {

    protected Calculator calculator;

    @BeforeClass
    public void setUp(){
        System.out.println("Before class");
        calculator = new Calculator();
    }

    @AfterClass
    public void tearDown(){
        System.out.println("After class");
        calculator = null;
    }

    protected void checkTime() {
        System.out.println("Current time: " + new Date(System.currentTimeMillis()));
    }

}

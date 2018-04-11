package com.epam.tat.module4.test;

import com.epam.tat.module4.Timeout;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.ObjectFactory;
import org.testng.annotations.Test;

/**
 * Created by Maksim_Hurinovich on 4/10/2018.
 */
public class SubTest extends BaseCalculatorTest{

    private long arg1;
    private long arg2;
    private long expected;


    @Factory(dataProvider = "subDp")
    public SubTest(long arg1, long arg2, long expected){
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.expected = expected;
    }

    @Test
    public void subTest(){
        long result = calculator.sub(arg1, arg2);
        Assert.assertEquals(result, expected, "Defect founded in div");
        Timeout.sleep(1);
        checkTime();
    }

    @DataProvider(name = "subDp")
    public Object[][] sumDp() {
        return new Object[][]{
                {1L, 1L, 0L},
                {0L, 1L, -1L},
                {-1L, 1L, -2L}
        };
    }
}

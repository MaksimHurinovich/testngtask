package com.epam.tat.module4.test;

import static org.testng.Assert.*;

import com.epam.tat.module4.Timeout;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Maksim_Hurinovich on 4/10/2018.
 */
public class SumTest extends BaseCalculatorTest {

    @DataProvider(name = "sumDp")
    public Object[][] sumDp() {
        return new Object[][]{
                {1L, 1L, 2L},
                {0L, 1L, 1L},
                {-1L, 1L, 0L}
        };
    }

    @Test(dataProvider = "sumDp")
    public void sumTest(long arg1, long arg2, long expected){
        long result = calculator.sum(arg1, arg2);
        assertEquals(result, expected, "Defect founded in sum");
        Timeout.sleep(1);
        checkTime();
    }
}

package com.epam.tat.module4.test;

import com.epam.tat.module4.Timeout;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Maksim_Hurinovich on 4/10/2018.
 */
public class MultTest extends BaseCalculatorTest{

    @Test
    public void simpleMultTest(){
        long result = calculator.mult(12267211266L, 0L);
        long expected = 0L;
        Assert.assertEquals(result, 0L, "Defect founded in mult");
        Timeout.sleep(1);
        checkTime();
    }
}

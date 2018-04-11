package com.epam.tat.module4.test;

import com.epam.tat.module4.Timeout;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Maksim_Hurinovich on 4/11/2018.
 */
public class TrigonometryTest extends BaseCalculatorTest{

    @Test(groups = "a", dependsOnGroups = "b")
    public void sinTest(){
        Assert.assertEquals(calculator.sin(0), 0d, "Defect found in sin");
        Timeout.sleep(1);
        checkTime();
    }

    @Test(groups = "a", dependsOnGroups = "b")
    public void cosTest(){
        Assert.assertEquals(calculator.cos(0), 1d, "Defect found in cos");
        Timeout.sleep(1);
        checkTime();
    }

    @Test(groups = "b")
    public void tanTest(){
        Assert.assertEquals(calculator.tg(1), 1d, "Defect found in tg");
        Timeout.sleep(1);
        checkTime();
    }

    @Test(groups = "b")
    public void ctgTest(){
        Assert.assertEquals(calculator.ctg(0), 0d, "Defect found in ctg");
        Timeout.sleep(1);
        checkTime();
    }
}

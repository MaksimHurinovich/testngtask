package com.epam.tat.module4.test;

import org.testng.annotations.Factory;

/**
 * Created by Maksim_Hurinovich on 4/10/2018.
 */
public class SubTestFactory {

    @Factory
    public Object[] generateTests() {
        return new Object[] {
                new SubTest(1, 2, -1),
                new SubTest(-1, 1, -2),
                new SubTest(-2, 5, -7)
        };
    }
}

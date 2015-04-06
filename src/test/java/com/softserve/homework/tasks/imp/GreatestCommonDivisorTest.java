package com.softserve.homework.tasks.imp;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GreatestCommonDivisorTest {
    @DataProvider(name = "correctValues")
    public static Object[][] primeNumbers() {
        return new Object[][]
                {
                        {45,60,15},
                        {12,22,2},
                        {12,18,6},
                        {100, 10, 10},
                        {123, 22, 1},
                        {44, 12, 4}
                };
    }

    @DataProvider(name = "incorrectValues")
    public static Object[][] incorrectValues() {
        return new Object[][]
                {
                        {45,0},
                        {-12,22},
                        {-12,-18},
                        {0, 10},
                };
    }

    @Test(dataProvider = "correctValues")
    public void testCorrectValues(int val1, int val2, int expectedResult) {
        GreatestCommonDivisor gcd = new GreatestCommonDivisor();

        int result = gcd.getGreatestCommonDivisor(val1, val2);
        Assert.assertEquals(expectedResult, result);
    }

    @Test(dataProvider = "incorrectValues", expectedExceptions = IllegalArgumentException.class)
    public void testIncorrectValues(int val1, int val2) {
        GreatestCommonDivisor gcd = new GreatestCommonDivisor();

        gcd.getGreatestCommonDivisor(val1, val2);
    }
}

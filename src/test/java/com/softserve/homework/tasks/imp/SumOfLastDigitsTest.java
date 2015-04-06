package com.softserve.homework.tasks.imp;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumOfLastDigitsTest {
    @DataProvider(name = "correctValues")
    public static Object[][] correctValues() {
                return new Object[][] {{123, 2, 5}, {123123, 2, 5}, {45, 1, 5}, {80, 1, 0}, {100, 2, 0},
                        {100, 0, 0}, {123, 3, 6}, {455, 2, 10}, {999999999, 9, 81}};
    }

    @DataProvider(name = "incorrectValues")
    public static Object[][] incorrectValues() {
                return new Object[][] {{0, 2}, {-45, 1}, {80, -1},
                        {100, 4}, {100, 10}, {123, 123}};
    }

    @Test(dataProvider = "correctValues")
    public void correctValuesTest(int val1, int val2, int expected) {
        SumOfLastDigits sumOfLastDigits = new SumOfLastDigits();
        Assert.assertEquals(expected, sumOfLastDigits.getSumOfLastDigits(val1, val2));
    }

    @Test(dataProvider = "incorrectValues", expectedExceptions = IllegalArgumentException.class)
    public void incorrectValuesTest(int val1, int val2) {
        SumOfLastDigits sumOfLastDigits = new SumOfLastDigits();
        sumOfLastDigits.getSumOfLastDigits(val1, val2);
    }
}

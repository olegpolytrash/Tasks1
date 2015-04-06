package com.softserve.homework.tasks.imp;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class MersennePrimeGeneratorTest {
@DataProvider(name = "correctValues")
public static Object[][] correctValues() {
    return new Object[][]
            {
                    {1024, Arrays.asList(1, 3, 7, 15, 31, 63, 127, 255, 511, 1023)},
                    {520, Arrays.asList(1, 3, 7, 15, 31, 63, 127, 255, 511)},
                    {300, Arrays.asList(1, 3, 7, 15, 31, 63, 127, 255)},
                    {200, Arrays.asList(1, 3, 7, 15, 31, 63, 127)},
                    {64, Arrays.asList(1, 3, 7, 15, 31, 63)},
                    {32, Arrays.asList(1, 3, 7, 15, 31)},
                    {16, Arrays.asList(1, 3, 7, 15)},
                    {8, Arrays.asList(1, 3, 7)},
                    {4, Arrays.asList(1, 3)},
                    {2, Arrays.asList(1)},
            };
}

    @DataProvider(name = "incorrectValues")
    public static Object[][] incorrectValues() {
        return new Object[][]
                {
                        {1024, Arrays.asList(1, 3, 7, 15, 31, 63, 127, 255, 511, 1023)},
                        {520, Arrays.asList(1, 3, 7, 15, 31, 63, 127, 255, 511)},
                        {300, Arrays.asList(1, 3, 7, 15, 31, 63, 127, 255)},
                        {200, Arrays.asList(1, 3, 7, 15, 31, 63, 127)},
                        {64, Arrays.asList(1, 3, 7, 15, 31, 63)},
                        {32, Arrays.asList(1, 3, 7, 15, 31)},
                        {16, Arrays.asList(1, 3, 7, 15)},
                        {8, Arrays.asList(1, 3, 7)},
                        {4, Arrays.asList(1, 3)},
                        {2, Arrays.asList(1)},
                };
    }

    @Test(dataProvider = "correctValues")
    public void correctValuesTest(int number, List<Integer> mersennesPrimes) {
        MersennePrimeGenerator mpg = new MersennePrimeGenerator();
        Assert.assertEquals(mersennesPrimes, mpg.getMersennePrimes(number));
    }

    @Test(dataProvider = "incorrectValues")
    public void incorrectValuesTest(int number, List<Integer> mersennesPrimes) {
        MersennePrimeGenerator mpg = new MersennePrimeGenerator();
        Assert.assertEquals(mersennesPrimes, mpg.getMersennePrimes(number));
    }
}

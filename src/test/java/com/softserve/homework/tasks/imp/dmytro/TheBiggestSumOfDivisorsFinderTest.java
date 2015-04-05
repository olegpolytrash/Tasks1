package com.softserve.homework.tasks.imp.dmytro;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.AccessDeniedException;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TheBiggestSumOfDivisorsFinderTest {

    @Test
    public void testNumberWithMaxDivisorsSum() {
        TheBiggestSumOfDivisorsFinder testObj = new
                TheBiggestSumOfDivisorsFinder();
        assertEquals(12, testObj.numberWithMaxDivisorsSum(13));
        assertEquals(6, testObj.numberWithMaxDivisorsSum(6));
        assertEquals(1, testObj.numberWithMaxDivisorsSum(1));
        assertEquals(20, testObj.numberWithMaxDivisorsSum(21));
        assertNotEquals(15, testObj.numberWithMaxDivisorsSum(14));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForZero() {
        TheBiggestSumOfDivisorsFinder testObj = new
                TheBiggestSumOfDivisorsFinder();
        testObj.numberWithMaxDivisorsSum(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForNonNatural() {
        TheBiggestSumOfDivisorsFinder testObj = new
                TheBiggestSumOfDivisorsFinder();
        testObj.numberWithMaxDivisorsSum(-1);
    }

    @Test
    public void testDivisorsSum() throws NoSuchMethodException,
            IllegalAccessException, InvocationTargetException {
        TheBiggestSumOfDivisorsFinder testObj = new
                TheBiggestSumOfDivisorsFinder();
        Method divSumMethod = testObj.getClass().getDeclaredMethod
                ("divisorsSum", int.class);
        divSumMethod.setAccessible(true);
        assertArrayEquals(new int[]{1, 3, 4}, (int[]) divSumMethod.invoke
                (testObj, 3));
        assertArrayEquals(new int[]{1, 3, 4, 7, 6, 12, 8}, (int[])
                divSumMethod.invoke
                        (testObj, 7));
        assertArrayEquals(new int[]{1, 3, 4, 7, 6, 12, 8, 15, 13, 18}, (int[])
                divSumMethod.invoke
                        (testObj, 10));
    }

    @Test
    public void testIndexOfMaxSum() throws NoSuchMethodException,
            IllegalAccessException, InvocationTargetException {
        TheBiggestSumOfDivisorsFinder testObj = new
                TheBiggestSumOfDivisorsFinder();
        Method maxIndMethod = testObj.getClass().getDeclaredMethod
                ("indexOfMaxSum", int[].class);
        maxIndMethod.setAccessible(true);
        assertEquals(2, maxIndMethod.invoke(testObj, new int[]{1, 2, 3}));
        assertEquals(0, maxIndMethod.invoke(testObj, new int[]{7, 2, 5}));
        assertEquals(3, maxIndMethod.invoke(testObj, new int[]{6, -2, 13, 75,
                4, 12,
                74}));
    }
}

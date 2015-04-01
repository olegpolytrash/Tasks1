package com.softserve.homework.tasks.imp;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

/**
 * Created by Oles on 4/1/2015.
 */
public class IncrementValueTest {
    private int value;
    private static final int INPUT_POSITIVE_VALUE = 123;
    private static final int EXPECTED_POSITIVE_VALUE = 100;

    private int findPositiveValuePeriod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        IncrementValue incrementValue = new IncrementValue();
        Method method = incrementValue.getClass().getDeclaredMethod("findValuePeriod", int.class);
        method.setAccessible(true);
        value = (int) method.invoke(incrementValue, new Object[]{INPUT_POSITIVE_VALUE});
        return value;
    }

    @Test
    public void testFindValuePeriod() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        int actualValue = 0;
        try {
            actualValue = findPositiveValuePeriod();
        } catch (NoSuchMethodException s) {
            s.printStackTrace();
        }
        assertEquals("actualValue should be 100", EXPECTED_POSITIVE_VALUE, actualValue);
    }
}

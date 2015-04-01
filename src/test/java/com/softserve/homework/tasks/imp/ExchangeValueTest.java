package com.softserve.homework.tasks.imp;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

/**
 * Created by Oles on 4/1/2015.
 */
public class ExchangeValueTest {
    private String value;
    private static final int INPUT_POSITIVE_VALUE =123;
    private static final int INPUT_NEGATIVE_VALUE =-123;
    private static final int EXPECTED_POSITIVE_VALUE =321;
    private static final int EXPECTED_NEGATIVE_VALUE =-321;

    private String findPositiveExchangedValue() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ExchangeValue exchangeValue = new ExchangeValue();
        Method method = exchangeValue.getClass().getDeclaredMethod("exchangePositive", int.class);
        method.setAccessible(true);
        value = (String) method.invoke(exchangeValue, new Object[]{INPUT_POSITIVE_VALUE});
        return value;
    }
    private String findNegativeExchangedValue() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ExchangeValue exchangeValue = new ExchangeValue();
        Method method = exchangeValue.getClass().getDeclaredMethod("exchangeNegative", int.class);
        method.setAccessible(true);
        value = (String) method.invoke(exchangeValue, new Object[]{INPUT_NEGATIVE_VALUE});
        return value;
    }

    @Test
    public void testExchangePositive() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        int actualValue = 0;
        try {
            actualValue = Integer.valueOf(findPositiveExchangedValue());
        } catch (NoSuchMethodException s) {
            s.printStackTrace();
        }
        assertEquals("actualValue should be 321", EXPECTED_POSITIVE_VALUE, actualValue);
    }

    @Test
    public void testExchangeNegative() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        int actualValue = 0;
        try {
            actualValue = Integer.valueOf(findNegativeExchangedValue());
        } catch (NoSuchMethodException s) {
            s.printStackTrace();
        }
        assertEquals("actualValue should be -321", EXPECTED_NEGATIVE_VALUE, actualValue);
    }
}

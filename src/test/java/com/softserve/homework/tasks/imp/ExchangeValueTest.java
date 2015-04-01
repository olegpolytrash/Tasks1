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

    private String findPositiveExchangedValue() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ExchangeValue exchangeValue = new ExchangeValue();
        Method method = exchangeValue.getClass().getDeclaredMethod("exchangePositive", int.class);
        method.setAccessible(true);
        value = (String) method.invoke(exchangeValue, new Object[]{123});
        return value;
    }
    private String findNegativeExchangedValue() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ExchangeValue exchangeValue = new ExchangeValue();
        Method method = exchangeValue.getClass().getDeclaredMethod("exchangeNegative", int.class);
        method.setAccessible(true);
        value = (String) method.invoke(exchangeValue, new Object[]{-123});
        return value;
    }

    @Test
    public void testExchangePositive() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        int actualValue = 0;
        int expectedValue = 321;
        try {
            actualValue = Integer.valueOf(findPositiveExchangedValue());
        } catch (NoSuchMethodException s) {
            s.printStackTrace();
        }
        assertEquals("actualValue should be 321", expectedValue, actualValue);
    }

    @Test
    public void testExchangeNegative() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        int actualValue = 0;
        int expectedValue = -321;
        try {
            actualValue = Integer.valueOf(findNegativeExchangedValue());
        } catch (NoSuchMethodException s) {
            s.printStackTrace();
        }
        assertEquals("actualValue should be 321", expectedValue, actualValue);
    }
}

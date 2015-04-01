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
    private int actualValue;
    private int expectedValue = 321;

    private String findReturnedValue() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ExchangeValue exchangeValue = new ExchangeValue();
        Method method = exchangeValue.getClass().getDeclaredMethod("exchangePositive", int.class);
        method.setAccessible(true);
        value = (String) method.invoke(exchangeValue, new Object[]{123});
        return value;
    }

    @Test
    public void test() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        try {
            actualValue = Integer.valueOf(findReturnedValue());
        } catch (NoSuchMethodException s) {
            s.printStackTrace();
        }
        assertEquals("actualValue should be 321",expectedValue, actualValue);

    }
}

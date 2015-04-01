package com.softserve.homework.tasks.imp;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Oles on 4/1/2015.
 */
public class FindValueTest {
    private void findValue() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        FindValue findValue = new FindValue();
        Method method = findValue.getClass().getDeclaredMethod("findCombination");
        method.setAccessible(true);
         method.invoke(findValue, new Object[]{});
    }
    @Test
    public void findCombinationTest(){
        boolean methodContainsException = false;
        try {
            findValue();
        } catch (Exception e) {
            methodContainsException = true;
        }
        assertFalse(methodContainsException);
    }
}

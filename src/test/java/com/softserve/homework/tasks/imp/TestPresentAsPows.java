package com.softserve.homework.tasks.imp;

import static org.junit.Assert.assertArrayEquals;

import java.lang.reflect.Method;

import org.junit.Test;

import com.softserve.homework.tasks.imp.PresentAsPows;

public class TestPresentAsPows {

    @Test
    public void testQuality() {
        Method method;
        try {
            method = PresentAsPows.class.getDeclaredMethod("sumOfThreePows",
                    Integer.TYPE);
            method.setAccessible(true);
            assertArrayEquals((int[]) method.invoke(null, 9), 
                    new int[] { 2, 2, 1 });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

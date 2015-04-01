package com.softserve.homework;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Method;

import org.junit.Test;

import com.softserve.homework.tasks.imp.ClosestBiggerPowOf2;

public class TestClosestBiggerPowOf2 {

    @Test
    public void testQuality() {
        Method method;
        try {
            method = ClosestBiggerPowOf2.class.getDeclaredMethod
                    ("biggerPowTwo", Integer.TYPE);
            method.setAccessible(true);
            assertEquals("for 15 the closest pow2 value is 16", (long) 16,
                    method.invoke(null, 15));
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

}

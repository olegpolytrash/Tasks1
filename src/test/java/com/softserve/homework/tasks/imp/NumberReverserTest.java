package com.softserve.homework.tasks.imp;

import com.softserve.homework.tasks.imp.NumberReverser;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberReverserTest {

    @Test
    public void testReverse() {
        NumberReverser testObj = new NumberReverser();
        assertEquals(123, testObj.reverse(321));
        assertEquals(321, testObj.reverse(123));
        assertNotEquals(123, testObj.reverse(123));
        assertNotEquals(123, testObj.reverse(124));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForNonNatural() {
        NumberReverser testObj = new NumberReverser();
        testObj.reverse(-1);
    }
}

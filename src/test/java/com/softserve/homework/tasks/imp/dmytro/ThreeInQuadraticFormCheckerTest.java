package com.softserve.homework.tasks.imp.dmytro;

import com.softserve.homework.tasks.imp.dmytro.ThreeInQuadraticFormChecker;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class ThreeInQuadraticFormCheckerTest {

    @Test
    public void testContainsThreeInQuadraticForm() {
        ThreeInQuadraticFormChecker testObj = new ThreeInQuadraticFormChecker();
        assertTrue(testObj.containsThreeInQuadraticForm(6));
        assertFalse(testObj.containsThreeInQuadraticForm(9));
        assertTrue(testObj.containsThreeInQuadraticForm(18));
        assertFalse(testObj.containsThreeInQuadraticForm(54));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForNonNatural() {
        ThreeInQuadraticFormChecker testObj = new ThreeInQuadraticFormChecker();
        testObj.containsThreeInQuadraticForm(-1);
    }
}

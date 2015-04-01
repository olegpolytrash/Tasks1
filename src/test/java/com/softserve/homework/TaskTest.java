package com.softserve.homework;
import static org.junit.Assert.*;

import org.junit.Test;

import com.softserve.homework.tasks.imp.*;

public class TaskTest {
    @Test
    public void testMishaTask() {
        assertTrue(GoodEnoughValue.makeGoodEnough(16) == 1);
        assertFalse(GoodEnoughValue.makeGoodEnough(17) == 1);
    }
}

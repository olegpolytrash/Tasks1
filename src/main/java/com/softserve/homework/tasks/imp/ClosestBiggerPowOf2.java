/**
 * Copyright (c) 2015, i474232898 and/or its affiliates. All rights reserved.
 * 
 */
package com.softserve.homework.tasks.imp;

import com.softserve.homework.tasks.Command;
import com.softserve.homework.utils.MyScanner;

/**
 * SmallestNumber Implementation of 108, task from
 * "Problem Programming" book.
 * 
 * @author i474232898
 * @version 1.0
 */
public class ClosestBiggerPowOf2 implements Command {

    /**
     * Task 108. Finds the smallest number type of 2^n that bigger than
     * 
     * @param naturalN
     */
    static void biggerPowTwo(final int naturalN) {
        int i = 2;
        while (i < naturalN) {
            i <<= 1;
        }
        System.out.println("Pow: " + i);
    }

    @Override
    public void execute() {
        System.out.println("Finds the smallest number type of 2^n "
                + "that bigger than value");
        MyScanner myScanner = MyScanner.getInstance();
        int value = myScanner.getValue();
        PresentAsPows.sumOfThreePows(value);
    }

    @Override
    public String getName() {
        return "Task 108";
    }
}

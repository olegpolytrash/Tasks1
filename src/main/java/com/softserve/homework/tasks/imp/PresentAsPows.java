/**
 * Copyright (c) 2015, i474232898 and/or its affiliates. All rights reserved.
 * 
 */
package com.softserve.homework.tasks.imp;

import com.softserve.homework.tasks.Command;
import com.softserve.homework.utils.MyScanner;

/**
 * SmallestNumber Implementation of 331 (a, b) task from
 * "Problem Programming" book.
 * 
 * @author i474232898
 * @version 1.0
 */
public final class PresentAsPows implements Command {
    /**
     * Task 331 a,b. Represents given number(N) as N = x^2 + y^2 + z^2 in all
     * possible variations.
     */
    static void sumOfThreePows(final int sum) {
        final int DEFAULT_CAPACITY = 3;
        int count = (int) Math.sqrt(sum);
        int[] xyzValues = new int[DEFAULT_CAPACITY];
        boolean succeed = false;

        for (int i = 1; i < count; i++) {
            xyzValues[0] = i;
            for (int j = 1; j < count; j++) {
                xyzValues[1] = j;
                for (int k = 1; k < count; k++) {
                    xyzValues[2] = k;
                    int testSum = getTestSum(xyzValues);
                    if (testSum > sum) {
                        break;
                    }
                    if (testSum == sum) {
                        for (int unit : xyzValues) {
                            System.out.print(unit + " ");
                            succeed = true;
                        }
                        System.out.println();
                    }
                }
            }
        }
        if (!succeed) {
            System.out.println(sum
                    + " can't be presented like n = x^2 + y^2 + z^2");
        }
    }

    private static int getTestSum(final int[] test) {
        int sum = 0;
        for (int i : test) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    @Override
    public void execute() {
        System.out.println("Value will be presented like "
                + "\"N = x^2 + y^2 + z^2\" in all possible variations.");
        MyScanner myScanner = MyScanner.getInstance();
        int value = myScanner.getValue();
        PresentAsPows.sumOfThreePows(value);
    }

    @Override
    public String getName() {
        return "Task 331 (a, b)";
    }
}

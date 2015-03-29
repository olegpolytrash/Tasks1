/* Copyright (C) 2015 Oleksandr Vyblov. All Rights Reserved. */

package com.softserve.homework.tasks.imp;

import com.softserve.homework.tasks.Command;
import com.softserve.homework.utils.MyScanner;
import java.util.ArrayList;
import java.util.List;

/**
 * A class to show all perfect numbers smaller than inserted
 *
 * @author Olexandr Vyblov
 * @version 1.0 28/03/2015
 */

public class PerfectNumber implements Command {
    /**
     * Returns list of values that are perfect numbers? smaller than
     * inserted
     *
     * @param n is a natural number.
     * @return list of integers
     */
    private static List<Integer> findPerfect(int n) {
        List<Integer> perfects = new ArrayList<Integer>();
        int buffer;
        int counter;
        int maxDivisor;
        //All perfect numbers are even
        for (int i = 2; i <= n; i += 2) {
            maxDivisor = (int) Math.floor(i / 2);
            counter = 1 + 2; // we know that 1 and 2 are divisors
            for (int j = 3; j <= maxDivisor; j++) {
                buffer = i % j;
                if (buffer == 0) {
                    counter += j;
                    if (counter > i) {
                        break; //greater than number
                    }
                }
            }
            if (counter != i) {
            //Sum of divisors less than number so number not perfect
                continue;
            }
            if (counter == i) {
                perfects.add(i);
            }
        }
        return perfects;
    }
    @Override
    public void execute() {
        MyScanner myScanner = MyScanner.getInstance();
        int value = myScanner.getValue();
        System.out.println("Perfect numbers less then " + value + " are "
                + findPerfect(value));
    }
    @Override
    public String getName() {
        return "PerfectNumber";
    }
}
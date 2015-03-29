/* Copyright (C) 2015 Dmytro Dobrovolskyi. All Rights Reserved. */

package com.softserve.homework.tasks.imp;

import com.softserve.homework.tasks.Command;

/**
 * A class to find a number with maximum
 * divisors sum.
 *
 * @author Dmytro Dobrovolskyi
 * @version 1.0 28/03/2015
 */
public final class DmytroTask322 implements Command {

    /**
     * Return number in range 1 to {@code bound}
     * that has maximum divisors sum.
     *
     * @param bound natural number that is the bound
     *              in sequence to search.
     * @return natural number that has maximum divisors sum.
     * @throws IllegalArgumentException if non-natural number or 0 was passed.
     */
    public int numberWithMaxDivisorsSum(int bound) {
        checkArg(bound);
        return indexOfMaxSum(divisorsSum(bound)) + 1;
    }

    /**
     * Check if arguments is a natural number >=0.
     *
     * @param n value to be checked.
     * @throws IllegalArgumentException if non-natural or 0 number was passed.
     */
    private void checkArg(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Required: natural number >=1." +
                    " Found: " + n);
        }
    }

    /**
     * Return array of sum of divisors of all number in range 1 to {@code
     * bound}.
     *
     * @param bound natural number that is the bound
     *              in sequence to calculating divisors sum.
     * @return array of divisors sum.
     */
    private int[] divisorsSum(int bound) {
        int[] divisors = new int[bound];
        for (int i = 1; i <= bound; i++) {
            int divSum = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divSum += j;
                }
            }
            divisors[i - 1] = divSum;
        }
        return divisors;
    }

    /**
     * Return index of max element in array
     * of divisors sum.
     *
     * @param arr array of divisors sum.
     * @return index of max element in array.
     */
    private int indexOfMaxSum(int[] arr) {
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
    @Override
    public void execute() {
        testTaskTwo();
    }

    @Override
    public String getName() {
        return "DmytroTask322";
    }
    private void testTaskTwo(){
        DmytroTask322 task2 = new DmytroTask322();
        System.out.println("Task 2:");
        System.out.println(task2.numberWithMaxDivisorsSum(1000));
    }
}
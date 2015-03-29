/* Copyright (C) 2015 Oleksandr Vyblov. All Rights Reserved. */

package com.softserve.homework.tasks.imp;


import com.softserve.homework.tasks.Command;
import com.softserve.homework.utils.MyScanner;

/**
 * A class to count number and sum of digits in integer.
 *
 * @author Olexandr Vyblov
 * @version 1.0 28/03/2015
 */

public class NumberOperations implements Command {
    /**
     * Returns int value that counts number of digits in integer
     *
     * @param num natural number.
     * @return count of digits in number,
     */
    private static int countNumber(int num) {
        int count = Integer.toString(num).length();
        return count;
    }
    /**
     * Returns int value that counts sum of digits in integer.
     *
     * @param num is a natural number.
     * @return sum of digits in number,
     */
    private static int sumOfNumbers(int num) {
        int sum = 0;
        while (num != 0) {
            sum = sum + (num % 10);
            num /= 10;
        }
        return sum;
    }
    @Override
    public void execute() {
        MyScanner myScanner = MyScanner.getInstance();
        int value = myScanner.getValue();
        System.out.println("The length of number is " + countNumber(value));
        System.out.println("The sum of numbers is " + sumOfNumbers(value));
    }
    @Override
    public String getName() {
        return "NumberOperations";
    }
}
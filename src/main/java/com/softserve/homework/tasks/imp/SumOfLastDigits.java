/**
 * Copyright (c) 2015, Oleh Chenygevych and/or its affiliates.
 * All rights reserved.
 */

package com.softserve.homework.tasks.imp;

import com.softserve.homework.tasks.Command;
import com.softserve.homework.utils.MyScanner;

import java.util.List;
import java.util.Scanner;

/**
 * 87. Даны натуральное n, m. Получить сумму m последних цифр числа n.
 */
public final class SumOfLastDigits implements Command {
    @Override
    public String getName() {
        return "SumOfLastDigits";
    }

    @Override
    public void execute() {
        System.out.println("Get the sum of the last digits of a number");

        System.out.println("Insert a number:");
        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();

        System.out.println("Insert a count of the last digits:");
        int value2 = scanner.nextInt();

        int result = getSumOfLastDigits(value1, value2);

        System.out.print(result);

        scanner.close();
    }

    /**
     * Get sum of the last digits of a number.
     *
     * @param number          natural number for processing
     * @param lastDigitsCount number of last digits
     * @return sum of the last numbers
     * @throws IllegalArgumentException if number isn't natural
     * @throws IllegalArgumentException if lastDigitsCount is negative
     * @throws IllegalArgumentException if lastDigitsCount > number's length
     */
    public int getSumOfLastDigits(final int number,
        final int lastDigitsCount) {
        int minNaturalValue = 1;

        if (number < minNaturalValue) {
            throw new IllegalArgumentException();
        }

        if (isNegative(lastDigitsCount)) {
            throw new IllegalArgumentException();
        }

        String numberString = String.valueOf(number);
        int numberLength = numberString.length();

        if (numberLength < lastDigitsCount) {
            throw new IllegalArgumentException();
        }

        String resultStr =
            numberString.substring(numberLength - lastDigitsCount);

        int result = 0;

        for (char numChar : resultStr.toCharArray()) {
            result += Character.getNumericValue(numChar);
        }

        return result;
    }

    /**
     * Determine if number is negative.
     *
     * @param num number to test
     * @return true if negative false otherwise
     */
    private static boolean isNegative(final int num) {
        return num < 0;
    }
}

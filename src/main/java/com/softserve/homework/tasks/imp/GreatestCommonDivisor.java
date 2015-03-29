/**
 * Copyright (c) 2015, Oleh Chenygevych and/or its affiliates.
 * All rights reserved.
 */

package com.softserve.homework.tasks.imp;

import com.softserve.homework.tasks.Command;
import com.softserve.homework.utils.MyScanner;

import java.util.*;

/**
 * Даны натуральные числа m, n. Получить все их натуральные общие кратные,
 * меньшие mn.
 */
public final class GreatestCommonDivisor implements Command {

    @Override
    public String getName() {
        return "GreatestCommonDivisor";
    }

    @Override
    public void execute() {
        System.out.println("Get the greatest common divisor for two values.");

        System.out.println("Insert first value:");
        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();

        System.out.println("Insert second value:");

        int value2 = scanner.nextInt();

        int result = getGreatestCommonDivisor(value1, value2);

        System.out.println(result);

        scanner.close();
    }

    /**
     * Default private constructor.
     * Class must be used by using static functions.
     */
    public GreatestCommonDivisor() { }

    /**
     * Get greatest common divisor of two numbers.
     *
     * @param number1 first number
     * @param number2 second number
     * @return the greates common divisor, or -1 in case of an error
     * @throws IllegalArgumentException then one of numbers isn't natural
     */
    public int getGreatestCommonDivisor(final int number1,
        final int number2) {
        int minNaturalValue = 1;

        boolean isNumber1Natural = number1 < minNaturalValue;
        boolean isNumber2Natural = number2 < minNaturalValue;

        if (isNumber1Natural && isNumber2Natural) {
            throw new IllegalArgumentException(
                "parameters must be natural numbers");
        }

        SortedMap<Integer, Integer> divisorsMap =
            new TreeMap<>(Collections.reverseOrder());

        // fill map with both numbers' divisors as keys and divisors' counts
        // as values
        fillMapWithDivisors(number1, divisorsMap);
        fillMapWithDivisors(number2, divisorsMap);

        int result = -1;

        int divisorCount = 0;
        final int correctDivisorCount = 2;

        // find the greatest common divisor of two numbers
        for (Map.Entry<Integer, Integer> entry : divisorsMap.entrySet()) {
            divisorCount = entry.getValue();

            if (divisorCount == correctDivisorCount) {
                result = entry.getKey();
                break;
            }
        }

        return result;
    }

    /**
     * Put all the number's divisors into the map.
     *
     * @param number      to get divisors of
     * @param divisorsMap to be filled
     */
    private void fillMapWithDivisors(final int number,
        final SortedMap<Integer, Integer> divisorsMap) {
        int lowestDivisor = 1;
        incrementDivisorCount(lowestDivisor, divisorsMap);
        incrementDivisorCount(number, divisorsMap);

        for (int divisor = 2; divisor < number / 2; ++divisor) {
            if (number % divisor == 0) {
                incrementDivisorCount(divisor, divisorsMap);
            }
        }
    }

    /**
     * Increments the divisor's count if it's in the map, or puts it in the map
     * with count = 1.
     *
     * @param divisor     to be incremented
     * @param divisorsMap for storing divisors and their counts
     */
    private void incrementDivisorCount(final int divisor,
        final SortedMap<Integer, Integer> divisorsMap) {
        if (divisorsMap.containsKey(divisor)) {
            int currentCount = divisorsMap.get(divisor);
            currentCount++;
            divisorsMap.put(divisor, currentCount);
        } else {
            divisorsMap.put(divisor, 1);
        }
    }
}

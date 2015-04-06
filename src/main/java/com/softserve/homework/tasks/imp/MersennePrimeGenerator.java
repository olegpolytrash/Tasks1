/**
 * Copyright (c) 2015, Oleh Chenygevych and/or its affiliates.
 * All rights reserved.
 */

package com.softserve.homework.tasks.imp;

import com.softserve.homework.tasks.Command;
import com.softserve.homework.utils.MyScanner;

import java.util.ArrayList;
import java.util.List;

/**
559. Дано натуральное число n. Найти все меньшие n числа
Мерсена. (Простое число называется числом Мерсена, если оно может
быть представлено в виде 2p(степінь) – 1, где р – тоже простое число.)
 */
public final class MersennePrimeGenerator implements Command {
    @Override
    public String getName() {
        return "MersennePrimeGenerator";
    }

    @Override
    public void execute() {
        System.out.println("Get all Mersenne's primes that are less then the "
            + "following number.");

        System.out.println("Insert a number:");
        MyScanner myScanner = MyScanner.getInstance();
        int value = myScanner.getValue();

        List<Integer> mersensNumber = getMersennePrimes(value);

        for (Integer i : mersensNumber) {
            System.out.print(i.toString() + " ");
        }
    }

    /**
     * Max power to be used in the Mersenne primes formula.
     */
    private static final int MAX_POWER = 31;

    /**
     * Get all Mersenne prime's less than an upper bound.
     * @param upperBound upper bound for Merenne's numbers
     * @return all Mersenne's primes below an upper bound
     */
    public List<Integer> getMersennePrimes(final int upperBound) {
        List<Integer> mer = new ArrayList<>();

        for (int n = 1, mersenne = 0; n < MAX_POWER; n++) {
            mersenne = (int) Math.pow(2, n) - 1;

            if (mersenne < upperBound) {
                mer.add(mersenne);
            } else {
                break;
            }
        }

        return mer;
    }
}

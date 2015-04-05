/* Copyright (C) 2015 Dmytro Dobrovolskyi. All Rights Reserved. */

package com.softserve.homework.tasks.imp;

import com.softserve.homework.tasks.Command;

import java.util.Scanner;

/**
 * A class to reverse any natural number.
 *
 * @author Dmytro Dobrovolskyi
 * @version 1.0 28/03/2015
 */
public final class NumberReverser implements Command {
    /**
     * Reverse a natural number.
     *
     * @param n natural number.
     * @return natural number that is
     * reversed value of n.
     * @throws IllegalArgumentException if non-natural number was passed.
     */
    public int reverse(int n) {
        checkArg(n);
        return Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse()
                .toString());
    }

    /**
     * Implementation of <em>Command</em> pattern. This  method tests work of
     * {@code reverse} method.
     *
     * @throws IllegalArgumentException if non-natural number was entered.
     */
    @Override
    public void execute() {
        NumberReverser testObj = new NumberReverser();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a natural number you want to " +
                "revers:");
        System.out.println("Result: " + testObj.reverse(in.nextInt()));
    }

    /**
     * Returns class name.
     */
    @Override
    public String getName() {
        return "NumberReverser";
    }

    /**
     * Check if argument is a natural number.
     *
     * @param n value to be checked.
     * @throws IllegalArgumentException if non-natural number was passed.
     */
    static void checkArg(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Required: natural number. " +
                    "Found: " + n);
        }
    }
}

/* Copyright (C) 2015 Dmytro Dobrovolskyi. All Rights Reserved. */

package com.softserve.homework.tasks.imp;

import com.softserve.homework.tasks.Command;

import java.util.Scanner;

/**
 * A class to reverse any natural number
 * and find out if there is '3' digit in its quadratic form.
 *
 * @author Dmytro Dobrovolskyi
 * @version 1.0 28/03/2015
 */
public final class DmytroTask88 implements Command {
    /**
     * Returns boolean value that indicates whether
     * '3' digit is present in argument quadratic form.
     *
     * @param n natural number.
     * @return true if '3' digit is present in n quadratic form,
     * false otherwise.
     * @throws IllegalArgumentException if non-natural number was passed.
     */
    public boolean containsThreeInQuadraticForm(int n) {
        checkArg(n);
        return String.valueOf(n * n).contains("3");
    }

    /**
     * Check if arguments is a natural number.
     *
     * @param n value to be checked.
     * @throws IllegalArgumentException if non-natural number was passed.
     */
    private void checkArg(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Required: natural number. " +
                    "Found: " + n);
        }
    }

    /**
     * Reverse natural number.
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

    @Override
    public void execute() {
        testTaskOneA();
        testTaskOneB();
    }

    @Override
    public String getName() {
        return "DmytroTask88";
    }
    private void testTaskOneA(){
        DmytroTask88 task1 = new DmytroTask88();
        System.out.println("Task 1(a):");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a natural number");
        System.out.println(task1.containsThreeInQuadraticForm(in.nextInt()));
    }
    private void testTaskOneB(){
        DmytroTask88 task1 = new DmytroTask88();
        System.out.println("Task 1(b):");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a natural number");
        System.out.println(task1.reverse(in.nextInt()));
    }
}

/* Copyright (C) 2015 Dmytro Dobrovolskyi. All Rights Reserved. */

package com.softserve.homework.tasks.imp;

import com.softserve.homework.tasks.Command;

import java.util.Scanner;

import static com.softserve.homework.tasks.imp.NumberReverser.checkArg;

/**
 * A class to find out if there is '3' digit in any natural number quadratic
 * form.
 *
 * @author Dmytro Dobrovolskyi
 * @version 1.0 28/03/2015
 */
public class ThreeInQuadraticFormChecker implements Command {
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
     * Implementation of <em>Command</em> pattern. This  method tests work of
     * {@code containsThreeInQuadraticForm} method.
     *
     * @throws IllegalArgumentException if non-natural number was entered.
     */
    @Override
    public void execute() {
        ThreeInQuadraticFormChecker testObj = new ThreeInQuadraticFormChecker();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a natural number you want to check:");
        System.out.println("Result: " + testObj.containsThreeInQuadraticForm(in
                .nextInt()));
    }

    /**
     * Returns class name.
     */
    @Override
    public String getName() {
        return "ThreeInQuadraticFormChecker";
    }
}

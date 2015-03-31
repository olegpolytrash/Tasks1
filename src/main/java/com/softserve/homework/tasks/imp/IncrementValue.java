package com.softserve.homework.tasks.imp;

import com.softserve.homework.tasks.Command;
import com.softserve.homework.utils.MyScanner;

/**
 * Class which increment first and last digit in a value.
 *
 * @author Oles Onyshchak
 * @version 0.1 28/03/2015
 */
public class IncrementValue implements Command {
    /**Multiplier convert newValue to the same period as value has  .*/
    private static final int MULTIPLIER = 10;
    /**NewValue is a number with the same period as number .*/
    private int newValue;
    @Override
    public final String getName() {
        return "IncrementValue";
    }
    @Override
    public final void execute() {
        MyScanner myScanner = MyScanner.getInstance();
        int value = myScanner.getValue();
        if (value > 0) {
            newValue = value + findValueLength(value) + 1;
        } else {
            newValue = value - findValueLength(value) - 1;
        }

        System.out.println(newValue);
    }
    /**
     * Method convert value into string, than swap first and last digit.
     *
     * @param value - number, who's first and last digit must be incremented
     * @return valueLength - positive value with the same number period as value
     */
    private int findValueLength(final int value) {
        String temp = String.valueOf(value);
        int valueLength = 1;
        if (value > 0) {
            for (int i = 0; i < temp.length() - 1; i++) {
                valueLength *= MULTIPLIER;
            }
        } else {
            for (int i = 0; i < temp.length() - 2; i++) {
                valueLength *= MULTIPLIER;
            }
        }
        return valueLength;
    }
}

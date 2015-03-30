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
    private static final int MULTIPLIER = 10;
    private int newValue;
    @Override
    public String getName() {
        return "IncrementValue";
    }

    public void execute() {
        MyScanner myScanner = MyScanner.getInstance();
        int value = myScanner.getValue();
        if (value > 0) {
            newValue = value + findValueLength(value) + 1;
        } else {
            newValue = value - findValueLength(value) - 1;
        }

        System.out.println(newValue);
    }

    private int findValueLength(int value) {
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

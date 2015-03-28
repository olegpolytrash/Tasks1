package com.softserve.homeAssignment.tasks.imp;

import com.softserve.homeAssignment.tasks.Command;
import com.softserve.homeAssignment.utils.MyScanner;

/**
 * Created by Oles on 3/26/2015.
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

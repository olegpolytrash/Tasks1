package com.softserve.homeAssignment.tasks.imp;

import com.softserve.homeAssignment.utils.MyScanner;
import com.softserve.homeAssignment.tasks.Command;

/**
 * Created by Oles on 3/28/2015.
 */
public class ExchangeValue implements Command {
    private int number;

    public void execute() {
        MyScanner myScanner = MyScanner.getInstance();
        int value = myScanner.getValue();
        if (value > 0) {
            number = Integer.valueOf(exchange(value));
        } else {
            number = Integer.valueOf(exchangeNegative(value));
        }
        System.out.println(number);
    }

    private String exchange(int value) {
        String temp = String.valueOf(value);
        char firstNumber = temp.charAt(0);
        char lastNumber = temp.charAt(temp.length() - 1);
        String newValue = String.valueOf(lastNumber);
        for (int i = 1; i < temp.length() - 1; i++) {
            newValue += String.valueOf(temp.charAt(i));
        }
        newValue += String.valueOf(firstNumber);
        return newValue;
    }

    private String exchangeNegative(int value) {
        String temp = String.valueOf(value);
        char firstNumber = temp.charAt(1);
        char lastNumber = temp.charAt(temp.length() - 1);
        String newValue = "-";
        newValue += String.valueOf(lastNumber);
        for (int i = 2; i < temp.length() - 1; i++) {
            newValue += String.valueOf(temp.charAt(i));
        }
        newValue += String.valueOf(firstNumber);
        return newValue;
    }
}

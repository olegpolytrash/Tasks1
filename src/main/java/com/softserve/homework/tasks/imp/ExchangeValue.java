
package com.softserve.homework.tasks.imp;

import com.softserve.homework.utils.MyScanner;
import com.softserve.homework.tasks.Command;

/**
 * Class which swap first and last digit in a value.
 *
 * @author Oles Onyshchak
 * @version 0.1 28/03/2015
 */
public class ExchangeValue implements Command {
    /**Number value of which will have been swapped .*/
    private int number;

    @Override
    public final String getName() {
        return "ExchangeValue";
    }
    @Override
    public final void execute() {
        MyScanner myScanner = MyScanner.getInstance();
        int value = myScanner.getValue();
        if (value > 0) {
            number = Integer.valueOf(exchangePositive(value));
        } else {
            number = Integer.valueOf(exchangeNegative(value));
        }
        System.out.println(number);
    }
    /**
     * Method convert value into string, than swap first and last digit.
     *
     * @param value - positive number, that must be swapped
     * @return swapped positive value in string representation
     */
    private String exchangePositive(final int value) {
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
    /**
     * Method convert value into string, than swap first and last digit.
     *
     * @param value - negative number, that must be swapped
     * @return swapped negative value in string representation
     */
    private String exchangeNegative(final int value) {
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

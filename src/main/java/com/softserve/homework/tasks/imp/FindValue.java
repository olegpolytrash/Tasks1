package com.softserve.homework.tasks.imp;

import com.softserve.homework.tasks.Command;
import com.softserve.homework.utils.MyScanner;

/**
 * Class which find necessary value according to task.
 *
 * @author Oles Onyshchak
 * @version 0.1 28/03/2015
 */
public class FindValue implements Command {
    /**Natural value according to the task.*/
    private int naturalValue;
    /**First component of the natural value according to the task.*/
    private int firstComp;
    /**Second component of the natural value according to the task.*/
    private int secondComp;
    /**Third component of the natural value according to the task.*/
    private int thirdComp;
    /**Forth component of the natural value according to the task.*/
    private int forthComp;
    /**MaxValue of every natural value component.*/
    private int maxValue;

    @Override
    public final String getName() {
        return "FindValuesXYZT";
    }
    @Override
    public final void execute() {
        MyScanner myScanner = MyScanner.getInstance();
        this.naturalValue = myScanner.getValue();
        maxValue = (int) Math.sqrt(naturalValue);
        System.out.println(maxValue);
        findCombination();
    }
    /**
     * Find all combination with necessary value and print them in console.
     */
    private void findCombination() {
        for (firstComp = 0; firstComp <= maxValue; firstComp++) {
            for (secondComp = 0; secondComp <= maxValue; secondComp++) {
                for (thirdComp = 0; thirdComp <= maxValue; thirdComp++) {
                    for (forthComp = 0; forthComp <= maxValue; forthComp++) {
                        int sum = (int) (Math.pow(firstComp, 2)
                                + Math.pow(secondComp, 2)
                                + Math.pow(thirdComp, 2)
                                + Math.pow(forthComp, 2));
                        if (naturalValue == sum) {
                            System.out.println(toString());
                        }
                    }
                }
            }

        }
    }

    @Override
    public final String toString() {
        return "FindValue{"
                + "naturalValue=" + naturalValue
                + ", firstComponent=" + firstComp
                + ", secondComponent=" + secondComp
                + ", thirdComponent=" + thirdComp
                + ", forthComponent=" + forthComp + '}';
    }
}

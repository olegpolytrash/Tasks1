package com.softserve.homework.tasks.imp;

import com.softserve.homework.tasks.Command;
import com.softserve.homework.utils.MyScanner;

/**
 * Class which find necessary value according to task.
 *
 * @author Oles Onyshchak
 * @version 0.1 28/03/2015
 */
public class FindValuesXYZT implements Command {
    private int naturalValue;
    private int firstComponent;
    private int secondComponent;
    private int thirdComponent;
    private int forthComponent;
    private int maxValue;

    @Override
    public String getName() {
        return "FindValuesXYZT";
    }

    public void execute() {
        MyScanner myScanner = MyScanner.getInstance();
        this.naturalValue = myScanner.getValue();
        maxValue = (int) Math.sqrt(naturalValue);
        System.out.println(maxValue);
        findCombination();
    }
    /**
     * Find all combination with necessary value and print them in console
     */
    private void findCombination() {
        for (firstComponent = 0; firstComponent <= maxValue; firstComponent++) {
            for (secondComponent = 0; secondComponent <= maxValue; secondComponent++) {
                for (thirdComponent = 0; thirdComponent <= maxValue; thirdComponent++) {
                    for (forthComponent = 0; forthComponent <= maxValue; forthComponent++) {
                        int sum = (int) (Math.pow(firstComponent, 2) + Math.pow(secondComponent, 2) + Math.pow(thirdComponent, 2) + Math.pow(forthComponent, 2));
                        if (naturalValue == sum) {
                            System.out.println(toString());
                        }
                    }
                }
            }

        }
    }

    @Override
    public String toString() {
        return "FindValuesXYZT{" +
                "naturalValue=" + naturalValue +
                ", firstComponent=" + firstComponent +
                ", secondComponent=" + secondComponent +
                ", thirdComponent=" + thirdComponent +
                ", forthComponent=" + forthComponent + '}';
    }
}

package com.softserve.homeAssignment.tasks.imp;

import com.softserve.homeAssignment.utils.MyScanner;
import com.softserve.homeAssignment.tasks.Command;
/**
 * Created by misha on 28.03.15.
 */
public class GoodEnoughValue implements Command  {

    @Override
    public String getName() {
        return "GoodEnoughValue";
    }

    @Override
    public void execute() {
        MyScanner myScanner = MyScanner.getInstance();
        int value = myScanner.getValue();
        System.out.println(makeGoodEnough(value));
    }

    /**
     * Finds the most suitable k value
     * according to this - 4^k < m
     *
     * @param m - real number, should be grater than 1
     * @return an integer number that satisfies the condition
     */
    private static int makeGoodEnough(double m) {
        int k = 0;
        while (Math.pow(4, k) < m) {
            k++;
        }
        return k - 1;
    }
}

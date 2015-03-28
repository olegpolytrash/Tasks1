package com.softserve.homeAssignment.tasks.imp;

import com.softserve.homeAssignment.tasks.Command;
import com.softserve.homeAssignment.utils.MyScanner;

/**
 * Created by Oles on 3/26/2015.
 */
public class FindValuesXYZT implements Command {
    private int n;
    private int x;
    private int y;
    private int z;
    private int t;
    private int maxValue;

    public void execute() {
        MyScanner myScanner = MyScanner.getInstance();
        this.n = myScanner.getValue();
        maxValue = (int) Math.sqrt(n);
        System.out.println(maxValue);
        findCombination();
    }

    private void findCombination() {
        for (x = 0; x <= maxValue; x++) {
            for (y = 0; y <= maxValue; y++) {
                for (z = 0; z <= maxValue; z++) {
                    for (t = 0; t <= maxValue; t++) {
                        int sum = (int) (Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2) + Math.pow(t, 2));
                        /*System.out.println(sum);*/
                        if (n == sum) {
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
                "n=" + n +
                ", x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", t=" + t + '}';
    }
}

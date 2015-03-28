package com.softserve.homeAssignment.tasks.imp;

import com.softserve.homeAssignment.tasks.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sander on 26.03.2015.
 */
public class PerfectNumber implements Command{
    //Finds all the perfect numbers <= n
    static protected List<Integer> findPerfect(int n) {
        List<Integer> perfects = new ArrayList<Integer>();
        int buffer;
        int counter;
        int maxDivisor;

        //All perfect numbers are even
        for (int i = 2; i <= n; i += 2) {
            maxDivisor = (int) Math.floor(i / 2);
            //Find divisors
            counter = 1 + 2; // we know that 1 and 2 are divisors
            for (int j = 3; j <= maxDivisor; j++) {
                buffer = i % j;
                if (buffer == 0) {
                    //Divisor found
                    counter += j;
                    if (counter > i) {
                        break; //greater than number
                    }
                }
            }
            if (counter != i) {
                //Sum of divisors less than number so number not perfect
                continue;
            }
            if (counter == i) {
                perfects.add(i);
            }
        }

        return perfects;
    }

    @Override
    public void execute() {
        System.out.println(PerfectNumber.findPerfect(50000));
    }
}

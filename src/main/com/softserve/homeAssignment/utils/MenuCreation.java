package com.softserve.homeAssignment.utils;

import com.softserve.homeAssignment.tasks.Command;
import com.softserve.homeAssignment.tasks.imp.*;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Oles on 3/28/2015.
 */
public class MenuCreation {
        private Map<Integer, Command> menu = new TreeMap<Integer, Command>();
        private ExchangeValue exchangeValue = new ExchangeValue();
        private FindValuesXYZT findValuesXYZT = new FindValuesXYZT();
        private IncrementValue incrementValue = new IncrementValue();
        private NumberOperations numberOperations = new NumberOperations();
        private PerfectNumber perfectNumber = new PerfectNumber();

        private void createMenu() {
            menu.put(1, exchangeValue);
            menu.put(2, incrementValue);
            menu.put(3, findValuesXYZT);
            menu.put(4, numberOperations);
            menu.put(5, perfectNumber);
        }

        public void runApplication() {
            createMenu();
            Scanner scanner = new Scanner(System.in);
            Switcher switcher = new Switcher();
            System.out.println("Please enter which type of program you would like to invoke");
            System.out.println("Press : 1 - exchangeValue, 2 - incrementValue, 3 - findValuesXYZT, 4 - numberOperation, 5 - perfectNumber ");
            boolean ok = true;
            while (ok) {
                int programType = scanner.nextInt();
                if (programType > 0 && programType < 6) {
                    switcher.executeCommand(menu.get(programType));
                    ok = false;
                } else {
                    System.out.println("Please enter 1-3");
                }
            }
        }
    }


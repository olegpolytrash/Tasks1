package com.softserve.homeAssignment.utils;

import com.softserve.homeAssignment.tasks.Command;

/**
 * Created by Oles on 3/26/2015.
 */
public class Switcher {
    public void executeCommand(Command command) {
        command.execute();
    }
}

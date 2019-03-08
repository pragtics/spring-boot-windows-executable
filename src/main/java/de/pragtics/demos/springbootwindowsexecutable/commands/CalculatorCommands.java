package de.pragtics.demos.springbootwindowsexecutable.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class CalculatorCommands {

    @ShellMethod(value = "Add two integers together.", group = "Rechner")
    public int add(
            @ShellOption(help = "The first number.") int left,
            @ShellOption(help = "The second number.") int right) {

        return left + right;
    }

    @ShellMethod(value = "Subtracts on integer from another.", group = "Rechner")
    public int subtract(int left, int right) {
        return left - right;
    }
}

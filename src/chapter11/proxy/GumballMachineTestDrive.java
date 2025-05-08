package chapter11.proxy;

import chapter10.state.GumballMachine;

import java.util.Objects;

public class GumballMachineTestDrive {

    public static void main(String[] args) {
        String[] argument = {"Austin", "112"};
        int count = 0;


        count = Integer.parseInt(argument[1]);
        

        count = Integer.parseInt(argument[1]);
        GumballMachine gumballMachine = new GumballMachine(argument[0], count);
        GumballMonitor monitor = new GumballMonitor(gumballMachine);


        monitor.report();
    }
}

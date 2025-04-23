package chapter8.cafe.impl;

import chapter8.cafe.CaffeineBeverageWithHook;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    protected void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    protected boolean customerWantsCondiments() {
        return getUserInput().equals("yes");
    }

    private String getUserInput() {
        System.out.println("Would you like milk and sugar with your coffee (y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            String answer = in.readLine();
            if (answer.toLowerCase().startsWith("y")) {
                return "yes";
            } else {
                return "no";
            }
        } catch (Exception e) {
            System.err.println("IO error trying to read your answer");
            return "no";
        }
    }
}


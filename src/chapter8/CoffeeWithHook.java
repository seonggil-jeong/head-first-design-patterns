package chapter8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    boolean customerWantsCondiments() {
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


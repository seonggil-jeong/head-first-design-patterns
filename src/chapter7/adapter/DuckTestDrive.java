package chapter7.adapter;

import chapter7.adapter.duck.Duck;
import chapter7.adapter.duck.impl.MallardDuck;
import chapter7.adapter.turkey.Turkey;
import chapter7.adapter.turkey.impl.WildTurkey;

public class DuckTestDrive {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("The Duck says...");
        testDuck(duck);


        System.out.println("The TurkeyAdapter says...");
        testDuck(turkeyAdapter);


    }


    private static void testDuck(Duck duck) {

        duck.quack();
        duck.fly();
    }
}

package org.example;

import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.function.Supplier;


public class Main {
    public static void main(String[] args) {

        // add
        simpleFunction add = (a,  b) -> a + b;
        System.out.println("--- Add ---");
        System.out.println(add.performOperation(9,10));

        // sub
        simpleFunction sub = (a, b) -> a - b;
        System.out.println("--- Sub ---");
        System.out.println(sub.performOperation(21,19));

        // mult
        simpleFunction mult = (a, b) -> a * b;
        System.out.println("--- Mult ---");
        System.out.println(mult.performOperation(69,1));

        // div (had to create a new function since the division was rounding up)
        simpleFunction2 div = ( a, b) ->  a / b;
        System.out.println("--- Div ---");
        System.out.println(div.performOperation(21,2));

        // predicate
        Predicate<Integer> greaterThan10 = (a) -> a > 10;
        System.out.println("--- Predicate---");
        System.out.println(greaterThan10.test(11));

        // function
        Function<Integer, Double> half = a -> a/ 2.0;
        System.out.println("--- Function ---");
        System.out.println(half.apply(2));

        // consumer
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        Consumer<ArrayList<Integer>> dispList = list -> list.stream().forEach(a -> System.out.print(a + "-"));
        System.out.println("--- Consumer ---");
        dispList.accept(nums);

        // supplier
        Supplier<Double> randNum = () -> Math.random();
        System.out.println();
        System.out.println("--- Supplier ---");
        System.out.println(randNum.get());


    }
    @FunctionalInterface
    public interface simpleFunction {
        int performOperation(int a, int b);

    }
    public interface simpleFunction2 {
        double performOperation(double a, double b);
    }


}
package UNIT2.class3;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInFunctionalInterface {
    public static void main(String[] args) {
        Predicate<Integer> isEven =n -> n%2 == 0; // predicate has test method with return type boolean
        System.out.println(isEven.test(15));

        Function<Integer, Integer> square = n -> n*n; // in function it is input and return type defined and apply what we want
        System.out.println(square.apply(4));

        Consumer<String> display = msg -> System.out.println(msg); // does not return anything
        display.accept("Hello display");

        Supplier<Double> randomValue = ()->Math.random(); // does not take any input just define the type of output
        System.out.println("random numeber " + randomValue.get());
    }
}

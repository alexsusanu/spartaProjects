package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
       int increment = incrementByOne(0);
        System.out.println(increment);

        Integer result = incrementByOneFunction.apply(1);
        System.out.println(result);

        int multiply = multiplyByTenFunction.apply(result);
        System.out.println(multiply);

        Function<Integer, Integer> addAndMultiply = incrementByOneFunction.andThen(multiplyByTenFunction);
        System.out.println(addAndMultiply.apply(2));

        System.out.println(incrementByOneMultiplyFunc.apply(1,10));
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyByTenFunction = number -> number * 10;

    static BiFunction<Integer, Integer, Integer> incrementByOneMultiplyFunc = (n, m) -> (n + 1) * m;


    static int incrementByOneMultiply(int n, int m){
        return (n + 1) * m;
    }

    static int incrementByOne(int number){
        return number + 1;
    }
}

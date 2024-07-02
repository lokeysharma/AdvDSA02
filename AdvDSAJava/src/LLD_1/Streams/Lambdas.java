package LLD_1.Streams;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;

public class Lambdas {
    public static void main(String[] args) {

        IntFunction<Integer> square = x -> x * x;
        System.out.println(square.apply(5));

        BinaryOperator<Integer> addition = Integer::sum;
        System.out.println(addition.apply(5, 5));

        Function<Integer, Integer> increment = x->x+1;
        System.out.println(increment.apply(5));
    }
}

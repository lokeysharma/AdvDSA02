package LLD_1.Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectMethodQuestion1 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "kiwi","apple");

        // What does the following code snippet do?
        String result = fruits.stream()
                .collect(Collectors.joining(", "));

        System.out.println("Result: " + result);

        Map<Integer, List<String>> groupByLength = fruits.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println("result: " + groupByLength);

        Set<String> uniqueFruits = fruits.stream()
                .collect(Collectors.toSet());

        System.out.println("uniqueFruits: " + uniqueFruits);

        List<String> words = fruits;

        boolean allMatch = words.parallelStream().allMatch(w -> w.length()>3);
        System.out.println("allMatch: " + allMatch);

    }

    static List<Integer> getOdd(Stream<Integer> stream){
        // write code here
            return stream.filter(x -> x % 2 != 0).collect(Collectors.toList());

    }

    static int getSum(Stream<Integer> stream){
        // write code here
        return stream.reduce(0, Integer::sum);
    }
}
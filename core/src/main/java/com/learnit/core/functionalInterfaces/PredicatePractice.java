package com.learnit.core.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicatePractice {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 10, 7, 9, 2, 5, 11, 8,6);
        List<String> names = Arrays.asList("puja","dipak","sonam", "rita");

        Predicate<Integer> isEven =  n-> n % 2 == 0;
        Predicate<String> stringWithI = s -> s.contains("i");

        List<Integer> evenNumbers = numbers.stream().filter(isEven).collect(Collectors.toList());
        List<String> namewithI = names.stream().filter(stringWithI).collect(Collectors.toList());

        System.out.println(evenNumbers);
        System.out.println(namewithI);


    }
}

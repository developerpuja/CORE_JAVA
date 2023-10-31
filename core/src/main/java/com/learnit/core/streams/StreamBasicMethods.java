package com.learnit.core.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Exercises on Employee class:
 * 1.       Get the employees whose age is greater than 25 and collect them into list.
 * 2.       Get Employee name and collect into list.
 * 3.       Sort the employees whose id is less than 15
 * 4.       Requirement: filter element whose length is greater than 5 and collect in list
 * 5.       print even element of an arraySolve the question given after below class
 *
 *          List<String> courses = List.of("Spring 6", "Spring Boot 10", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes")
 *          Print Courses Containing the word "Spring"
 *          Print Courses Whose Name has at least 4 letters
 *          Print the number of characters in each course name
 *
 */

public class StreamBasicMethods {
    public static void main(String[] args) {
        StreamBasicMethods sbm = new StreamBasicMethods();
        Employee employee = new Employee();
        List<Employee> employeeList = employee.getEmployeeList();
        //List<Employee>  adults =   sbm.getEmpByAge(employeeList);
        List<Integer> numbers = Arrays.asList(4, 4, 5, 6, 9, 8, 8, 1, 2, 2, 3, 7, 6);

        //adults.stream().forEach(employee1 -> System.out.println(employee1));
        //System.out.println(sbm.getEmployeeName(employeeList));
       // System.out.println(sbm.getEmpIdLessThanFive(employeeList));
        //System.out.println(sbm.getEmp(employeeList));

        List<String> cities = Arrays.asList("nagpur", "pune", "akola", "nagpur", "latur", "buldhana", "paithan", "nagalgaon");
        List<String> courses = List.of("Spring 6", "Spring Boot 10", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
        // filterStrings(courses);
        reduceMethodUse(numbers, cities);
       // exerciseOnMap();
    }

    /**
     * Print each element of cities by appending length to it and collect it in another list
     * Print each element of cities along with its length
     * Get unique cities and print
     * Get unique numbers and print.
     * Print cities and numbers in natural sorting order and reverse sorting order
     * Print first 5 elements of numbers and cities
     * Print all elements of numbers and cities after 3rd element
     */
    private static void exerciseOnMap() {
       List<String> cities = Arrays.asList("nagpur", "pune", "akola", "nagpur", "latur", "buldhana", "paithan", "nagalgaon");
       List<Integer> numbers = Arrays.asList(4, 4, 5, 6, 9, 8, 8, 1, 2, 2, 3, 7, 6);

       cities.stream().map(city -> city.concat(city.length()+"")).forEach(System.out::println);
       System.out.println();
       cities.stream().distinct().forEach(System.out::println);
       System.out.println();
       cities.stream().sorted().forEach(System.out::println);
       System.out.println();

       cities.stream().sorted().forEach(System.out::println);

    }

    /**
     *   Reduce
     *   Square every number in a list and find the sum of squares
     *   Cube every number in a list and find the sum of cubes
     *   Find Sum of Odd Numbers in a list
     * @param numbers
     */
    private static void reduceMethodUse(List<Integer> numbers, List<String> cities) {
        System.out.println(numbers.stream().map(a -> a*a).reduce(Integer::sum));
        System.out.println(numbers.stream().filter(n-> n%2 != 0).reduce(Integer::sum));
        System.out.println(cities.stream().reduce(String::concat));

    }


    private static void filterStrings(List<String> courses) {
       courses.stream().filter(str -> str.contains("Spring")).forEach(System.out::println);
       courses.stream().filter(str -> str.length() > 4).forEach(System.out::println);
    }

    public List<Employee> getEmpByAge(List<Employee> employeeList) {
        return employeeList.stream().filter(e-> e.getAge() > 25).collect(Collectors.toList());
    }

    public List<String> getEmployeeName(List<Employee> employeeList) {
        return employeeList.stream().map(Employee::getName).collect(Collectors.toList());
    }

    public List<Employee> getEmpIdLessThanFive(List<Employee> employeeList) {
        return employeeList.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).collect(Collectors.toList());
    }

    public List<Employee> getEmp(List<Employee> employeeList) {
        return employeeList.stream().filter(employee -> employee.getName().length() > 4).collect(Collectors.toList());
    }
}

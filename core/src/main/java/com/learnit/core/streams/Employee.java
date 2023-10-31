package com.learnit.core.streams;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class Employee {
    private int id;
    private int age;
    private String name;
    private String city;

    public Employee() {}

    public Employee(int id, int age,String name,  String city) {
        super();
        this.city = city;
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public List<Employee> getEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(Employee.builder().id(1).age(28).name("Sam").city("Hyd").build());
        employeeList.add(Employee.builder().id(2).age(45).name("John").city("Nagpur").build());
        employeeList.add(Employee.builder().id(3).age(27).name("Remo").city("Pune").build());
        employeeList.add(Employee.builder().id(4).age(30).name("Rio").city("Hyd").build());
        employeeList.add(Employee.builder().id(5).age(27).name("Sonal").city("Pune").build());
        employeeList.add(Employee.builder().id(6).age(15).name("Vicky").city("Nagpur").build());
        employeeList.add(Employee.builder().id(7).age(30).name("Zara").city("Hyd").build());
        employeeList.add(Employee.builder().id(8).age(29).name("Zeeva").city("Mumbai").build());
        employeeList.add(Employee.builder().id(9).age(28).name("Mira").city("Chennai").build());
        employeeList.add(Employee.builder().id(10).age(28).name("Ramen").city("Chennai").build());
        return employeeList;
    }
}

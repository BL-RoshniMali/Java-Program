package com.streamapis;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortDemo {
    public static void main(String[] args) {
        List<String> fruit = new ArrayList<>();
        fruit.add("Banana");
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Orange");

        // Ascending order
//       List<String> sortedList = fruit.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
//       System.out.println(sortedList);
//
//       List<String> sortedList1 = fruit.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
//       System.out.println(sortedList1);
//
//       List<String> sortedList2 = fruit.stream().sorted().collect(Collectors.toList());
//       System.out.println(sortedList2);

       // Descending Order
//       List<String> sortedList3 = fruit.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//       System.out.println(sortedList3);
//
//       List<String> sortedList4 = fruit.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
//       System.out.println(sortedList4);

       // Sort employee by salary
//        List<Employee> employees = new ArrayList<Employee>();
//        employees.add(new Employee(101, "Arjun", 28, 40000));
//        employees.add(new Employee(102, "Rahul", 30, 50000));
//        employees.add(new Employee(103, "Trisha", 25, 60000));
//        employees.add(new Employee(104, "Merissa", 32, 35000));
//
////      In ascending order
//        List<Employee> sortedEmployeeList = employees.stream().sorted(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return (int) (o1.getSalary() - o2.getSalary());
//            }
//        }).collect(Collectors.toList());
//        System.out.println(sortedEmployeeList);

//        List<Employee> sortedEmployeeList1 = employees.stream().sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
//        System.out.println(sortedEmployeeList1);

//        List<Employee> sortedEmployeeList2 = employees.stream().sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList());
//        System.out.println(sortedEmployeeList2);

//      In descending order
//        List<Employee> sortedEmployeeList3 = employees.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList());
//        System.out.println(sortedEmployeeList3);


    }
}

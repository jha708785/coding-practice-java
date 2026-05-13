package java8.basic;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class testEmp {
    static void main() {

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(101, 25, "Rahul", "IT", 50000));
        empList.add(new Employee(102, 30, "Amit", "HR", 40000));
        empList.add(new Employee(103, 28, "Neha", "Finance", 60000));
        empList.add(new Employee(104, 35, "Priya", "IT", 75000));


        Map<String,List<Employee>> map=empList.stream().collect(Collectors.groupingBy(Employee::getDept));
        //System.out.println(map);
        Employee employee = empList.stream().max(Comparator.comparing(Employee::getSalary)).get();
        //System.out.println(employee);

        Map<String, Double> collect = empList.stream().collect(Collectors.groupingBy(Employee::getDept,
                Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(collect);


        empList.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));

       empList.stream().filter(e->e.getSalary()>70000);

       empList.stream().max(Comparator.comparing(Employee::getAge));

       //1. find highest salary in each dept

        Map<String, Optional<Employee>> collect1 = empList.stream()
                .collect(Collectors
                        .groupingBy(Employee::getDept, Collectors
                                .maxBy(Comparator.comparing(Employee::getSalary))));


        // group employee by dept

        Map<String, List<Employee>> collect2 = empList.stream()
                .collect(Collectors
                        .groupingBy(Employee::getDept));

        //count employee each dept
        Map<String, Long> collect3 = empList.stream()
                .collect(Collectors
                        .groupingBy(Employee::getDept, Collectors.counting()));

        // sort employee by salary decending and get top 3
        empList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .forEach(e->System.out.println(employee.getName()));

        //find average salary in each dept
       empList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingDouble(Employee::getSalary)));

        //find duplicate salary
        Set<Employee>set=new HashSet<>();
        empList.stream().map(e->!set.add(e)).forEach(System.out::println);

        //convert list to map
        empList.stream().collect(Collectors.toMap(Employee::getId,Employee::getName));

        empList.stream().collect(Collectors.toMap(Employee::getId,Employee::getName));

        empList.stream().collect(Collectors.toSet());
    }
}

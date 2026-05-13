package Recursion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }

    @Override
    public String toString() {
        return name + " - " + salary;
    }
}

public class ComparableExm {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "Alice", 5000),
                new Employee(2, "Bob", 3000),
                new Employee(3, "Charlie", 4000)
        );

        List<Employee> empList = new ArrayList<>(employees);
        Collections.sort(empList); // Uses compareTo

        empList.forEach(System.out::println);
    }
}


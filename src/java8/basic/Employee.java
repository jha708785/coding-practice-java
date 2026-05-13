package java8.basic;

public class Employee {
    int id;
    int age;
    String name;
    String dept;
    double salary;

    public Employee(int id,int age,String name,String dept,double salary){
        this.id=id;
        this.age=age;
        this.name=name;
        this.dept=dept;
        this.salary=salary;
    }

    // 🔹 Getters
    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}

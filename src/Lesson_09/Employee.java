package Lesson_09;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return 0;
    }

    public int supportMoney(){
        return 0;
    }
}

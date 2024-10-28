package Lesson_09_1;

public abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract int getSalary();
    public abstract int getSupportMoney();
}

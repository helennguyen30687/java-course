package Lesson_09_1;

public class FTE extends Employee{
    public FTE(String name) {
        super(name);
    }

    @Override
    public int getSalary() {
        return 50000;
    }

    @Override
    public int getSupportMoney() {
        return 5000;
    }
}

package Lesson_10_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestSalary {
    public static void main(String[] args) {
        Employee teo = new Employee("Teo", 10);
        Employee ti = new Employee("Ti", 7);
        Employee tun = new Employee("Tun", 19);

        List<Employee> employees = Arrays.asList(teo, ti, tun);


        System.out.println("BEFORE================================");
        System.out.println(employees);
        Collections.sort(employees);

        System.out.println("AFTER=================================");
        System.out.println(employees);
    }
}

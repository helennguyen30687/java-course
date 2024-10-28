package Lesson_09_1;

import java.util.Arrays;
import java.util.List;

public class SalaryCalculator {
    public int getTotalSalary(List<FTE> employeeList){
        int totalSalary=0;
        for (Employee employee : employeeList) {
            totalSalary+= employee.getSalary()+ employee.getSupportMoney();
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        FTE teo = new FTE("Teo");
        new SalaryCalculator().getTotalSalary(Arrays.asList(teo));
    }
}

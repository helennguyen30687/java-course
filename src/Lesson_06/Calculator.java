package Lesson_06;

public class Calculator {

    public int sum(int num1, int num2){
        return num1+num2;
    }
    public int sum(int... restNum){
        int arrayTotal =0;
        for (int number : restNum) {
            arrayTotal = arrayTotal+number;
        }
        return arrayTotal;
    }

    //overloading happens at Compile Time
    //Overiding happens at Run Time

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(1, 2));
        System.out.println(calculator.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    }
}

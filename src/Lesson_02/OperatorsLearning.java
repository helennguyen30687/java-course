package Lesson_02;

public class OperatorsLearning {
    public static void main(String[] args) {
        int myNum1 = 1;
        int myNum2 = 2;

        int total = myNum1 + myNum2;
        System.out.println("total= " + total);

        System.out.println(5 / 2);
        System.out.println(5 % 2);

        int x = ++myNum1 + myNum2++;
        System.out.println("x= " + x);

        System.out.printf("\t\t\t%f+%d=%d\n", 1.1, 2, 3);
    }
}

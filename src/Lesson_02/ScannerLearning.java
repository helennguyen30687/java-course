package Lesson_02;

import java.util.Scanner;

public class ScannerLearning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your number: ");
        int inputNumber = scanner.nextInt();
        System.out.println("Your input number is: "+inputNumber);
    }
}

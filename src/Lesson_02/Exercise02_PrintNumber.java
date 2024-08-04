package Lesson_02;

import java.util.Scanner;

public class Exercise02_PrintNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen: ");
        int inputNumber = scanner.nextInt();

        if(inputNumber%2==0){
            System.out.println("Day la so chan");
        }
        else {
            System.out.println("Day la so le");
        }
    }
}

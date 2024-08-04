package Lesson_02;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        final int EXPECTED_TIME = 7;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the time (hr): ");
        int arrivalTime = scanner.nextInt();
        boolean isHeOnTime = arrivalTime == EXPECTED_TIME;

        System.out.println("Going to the location");
//        if(isHeOnTime){
//            System.out.println("Let's talk");
//        }else {
//            System.out.println("Write a letter");
//        }

        //Ternary operator
        String outputMsg = isHeOnTime ? "Let's talk" : "Write a letter";

        System.out.println(outputMsg);
        System.out.println("Going back home");
    }
}

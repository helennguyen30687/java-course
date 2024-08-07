package Lesson_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise_ArrayList {

    static List<Integer> myArrayList = new ArrayList<>();

    public static void main(String[] args) {
        printSimpleMenu();
        addPrintNumber();
        getMaxNumber();
        getMinNumber();
        findIndexOfNumber();
    }

    private static void printSimpleMenu() {
        System.out.println("====MENU====");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Find index of a number");
    }

    private static List<Integer> addPrintNumber() {
        myArrayList.add(20);
        myArrayList.add(3);
        myArrayList.add(76);
        myArrayList.add(8);
        myArrayList.add(23);
        System.out.println("Print Numbers: " + myArrayList);
        return myArrayList;
    }

    private static void getMaxNumber() {
        int maxNumber = Collections.max(myArrayList);
        System.out.println("Maximum number: " + maxNumber);
    }

    private static void getMinNumber() {
        int minNumber = Collections.min(myArrayList);
        System.out.println("Minimum number: " + minNumber);
    }

    private static void findIndexOfNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int inputUser = scanner.nextInt();

        int index= myArrayList.indexOf(inputUser);
        if (index!=-1) {
            System.out.println("The number " + inputUser + " is at index: " + index);
        } else {
            System.out.println("The number doesn't exist");
        }
    }
}

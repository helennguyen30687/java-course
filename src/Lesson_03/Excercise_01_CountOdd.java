package Lesson_03;

public class Excercise_01_CountOdd {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};

        int count = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0)
                ++count;
        }
        System.out.println("Even numbers: " + count);
        System.out.println("Odd numbers: " + (intArray.length - count));
    }
}

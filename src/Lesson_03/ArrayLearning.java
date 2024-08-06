package Lesson_03;

public class ArrayLearning {
    public static void main(String[] args) {
        int arrayLength = 20;
        int[] myIntArray = new int[arrayLength];


        for (int index = 0; index < arrayLength; index++) {
            System.out.println("index: "+index);
            myIntArray[index] = index ++;
        }

//        for (int index = 0; index < arrayLength; index++) {
//            System.out.printf("Element at the index %d has value %d \n", index, myIntArray[index]);
//        }

        for (int arrayElement : myIntArray) {
            System.out.println("arrayElement: "+arrayElement);
        }
    }
}

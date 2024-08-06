package Lesson_03;

import java.util.Arrays;

public class Excercise_04_MergeSortedArray {

    public static void main(String[] args) {
        int[] intArray1 = {1, 12, 16, 28, 100};
        int[] intArray2 = {1, 13, 16, 27, 99};

        int[] intMergedArray3 = new int[10];
        int i = 0, j = 0, k = 0;

        while (i < intArray1.length && j < intArray2.length) {
            if (intArray1[i] <= intArray2[j]) {
                intMergedArray3[k++] = intArray1[i++];
            }else {
                intMergedArray3[k++] = intArray2[j++];
            }
        }
        while(i < intArray1.length){
            intMergedArray3[k++]=intArray1[i++];
        }
        while(j < intArray2.length){
            intMergedArray3[k++]=intArray2[j++];
        }
        System.out.println("Merged array: " + Arrays.toString(intMergedArray3));
    }
}

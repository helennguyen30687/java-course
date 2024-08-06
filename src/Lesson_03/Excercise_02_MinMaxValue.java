package Lesson_03;

public class Excercise_02_MinMaxValue {

    public static void main(String[] args) {
        int[] intArray = {1, 21, 3, 46, 50};
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < intArray.length; i++) {
            if (min >= intArray[i]) {
                min = intArray[i];
            }
            if(max<=intArray[i]){
                max=intArray[i];
            }
        }
        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);
    }
}

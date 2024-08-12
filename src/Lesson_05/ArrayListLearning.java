package Lesson_05;

import java.util.Arrays;
import java.util.List;

public class ArrayListLearning {
    public static void main(String[] args) {
        List<Integer> myArrList = Arrays.asList(1,2,3,4,5);
        for (int index = 0; index < myArrList.size(); index++) {
            if(myArrList.get(index)%2!=0)
                myArrList.set(index,myArrList.get(index)+1);
        }
        System.out.println(myArrList);
    }
}

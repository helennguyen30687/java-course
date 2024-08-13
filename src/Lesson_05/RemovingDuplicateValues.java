package Lesson_05;

import java.util.*;

public class RemovingDuplicateValues {
    public static void main(String[] args) {
        List<Integer> myArrList = new ArrayList<>();
        myArrList.add(1);
        myArrList.add(7);
        myArrList.add(1);
        myArrList.add(5);
        myArrList.add(2);
        myArrList.add(3);

        /*
         * Lay 3 gia tri nho nhat ko trung nhau
         * */
        List<Integer> withoutDuplicatedValuesList = new ArrayList<>();
        for (Integer number : myArrList) {
            if (!withoutDuplicatedValuesList.contains(number)) {
                withoutDuplicatedValuesList.add(number);
            }
        }
        System.out.println("myArrList " + myArrList);
        Collections.sort(withoutDuplicatedValuesList);
        System.out.println("withoutDuplicatedValuesList " + withoutDuplicatedValuesList);

        //Set
        Set<Integer> set = new HashSet<>(myArrList);
        myArrList = new ArrayList<>(set);
        System.out.println(myArrList);

        //sublist
        List<Integer> first3MinValues= withoutDuplicatedValuesList.subList(0,3); //index at 3 is exclusive
        System.out.println("first3MinValues "+first3MinValues);
    }
}

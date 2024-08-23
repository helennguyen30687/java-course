package Lesson_07;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAndObject {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person teo = new Person();
        teo.setName("Teo day");
        teo.setAge(18);

        System.out.println(teo);

        personList.add(teo);
        personList.add(teo);

        System.out.println(personList);

        personList.get(1).setName("Ti");
        System.out.println(personList);
    }
}

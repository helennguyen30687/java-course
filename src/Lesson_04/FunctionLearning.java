package Lesson_04;

import java.security.SecureRandom;

public class FunctionLearning {

    public static void main(String[] args) {
        sayHello("Teo");
        System.out.println(getARandomNumber(2));
        System.out.println(getARandomNumber(10));
    }

    public static int getARandomNumber(int boundary) {
        return new SecureRandom().nextInt(boundary);
    }

    public static void sayHello(String name) {
        System.out.println("Hi, " + name);
    }
}

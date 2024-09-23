package lesson_07_1;

import javafx.scene.transform.Rotate;

import java.awt.*;

public class TestRobotDog {
    public static void main(String[] args) {
        RobotDog dog= new RobotDog();
        RobotDog dog2=new SolarRobotDog();
        RobotDog dog3=new WindRobotDog();

        System.out.println(dog.getDogId());
        System.out.println(dog2.getDogId());
        System.out.println(dog3.getDogId());
    }
}

package Lesson_10_3;

import java.util.Arrays;
import java.util.List;

public class RacingController {
    public void flyableRacing(List<IFlyable> flyableAnimal){}
    public void nonFlyableRacing(List<IMoveAble> moveAbleList){}

    public static void main(String[] args) {
        Cat cat = new Cat("Meo",32);
        Eagle eagle = new Eagle("Eagle",70);

        new RacingController().flyableRacing(Arrays.asList(eagle));
    }
}

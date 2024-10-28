package Lab_07;

import java.util.Random;

public class Dog extends Animal{
    private static int DOG_MAX_SPEED = 60;

    @Override
    public int speed() {
        Random random = new Random();
        return random.nextInt(DOG_MAX_SPEED)+1;//Random speed btw 1 and max speed
    }
}

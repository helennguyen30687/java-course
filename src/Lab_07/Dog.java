package Lab_07;

import java.security.SecureRandom;
import java.util.Random;

public class Dog extends Animal {
    private static int DOG_MAX_SPEED = 60;

    @Override
    public int speed() {
        return new SecureRandom().nextInt(DOG_MAX_SPEED)+1;
    }
}

package Lab_07;

import java.security.SecureRandom;
import java.util.Random;

public class Horse extends Animal {
    private static int HORSE_MAX_SPEED = 75;

    @Override
    public int speed() {
        return new SecureRandom().nextInt(HORSE_MAX_SPEED) + 1;
    }
}

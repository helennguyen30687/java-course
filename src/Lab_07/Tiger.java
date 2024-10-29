package Lab_07;

import java.security.SecureRandom;
import java.util.Random;

public class Tiger extends Animal {
    private static int TIGER_MAX_SPEED = 100;

    @Override
    public int speed() {
        return new SecureRandom().nextInt(TIGER_MAX_SPEED) + 1;
    }
}

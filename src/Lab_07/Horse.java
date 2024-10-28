package Lab_07;

import java.util.Random;

public class Horse extends Animal {
    private static int HORSE_MAX_SPEED = 75;

    @Override
    public int speed() {
        Random random = new Random();
        return random.nextInt(HORSE_MAX_SPEED) + 1;
    }
}

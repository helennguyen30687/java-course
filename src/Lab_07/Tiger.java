package Lab_07;

import java.util.Random;

public class Tiger extends Animal {
    private static int TIGER_MAX_SPEED = 100;


    @Override
    public int speed() {
        Random random = new Random();
        return random.nextInt(TIGER_MAX_SPEED) + 1;
    }
}

package Lab_07;

import java.security.SecureRandom;

public class Animal {
    private int speed;
    private String name;

    public Animal(int maxSpeed) {
        this.speed = new SecureRandom().nextInt(maxSpeed);
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }
}

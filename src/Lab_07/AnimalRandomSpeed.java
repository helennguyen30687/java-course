package Lab_07;

import java.security.SecureRandom;

public class AnimalRandomSpeed {
    final int MAX_SPEED =75;
    int animalRandomSpeed = new SecureRandom().nextInt(MAX_SPEED);
}

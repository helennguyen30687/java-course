package Lab_08;

import Lab_08.Animal.Builder;

import java.security.SecureRandom;

public class TestAnimalFly {
    public static void main(String[] args) {
        Builder animalBuilder = new Builder();
        animalBuilder.setName("Tiger")
                .setSpeed(new SecureRandom().nextInt(100)).setFlyable(false);
        Animal meo = animalBuilder.build();
        System.out.println(meo);
    }
}

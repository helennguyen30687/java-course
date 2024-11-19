package Lab_08;

import Lab_08.Animal.Builder;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class TestAnimalFly {
    public static void main(String[] args) {

        TestAnimalFly testAnimalFly = new TestAnimalFly();
        Builder animalBuilder = new Builder();
        List<Animal> animalList = new ArrayList<>();
        List<Animal> animalRacingList = new ArrayList<>();
        Animal tiger = animalBuilder.setName("Tiger").setFlyable(false)
                .setSpeed(new SecureRandom().nextInt(100)).build();
        Animal eagle = animalBuilder.setName("Eagle").setFlyable(true)
                .setSpeed(new SecureRandom().nextInt(389)).build();
        Animal buzzard = animalBuilder.setName("Tiger").setFlyable(true)
                .setSpeed(new SecureRandom().nextInt(320)).build();
        Animal hawk = animalBuilder.setName("Tiger").setFlyable(true)
                .setSpeed(new SecureRandom().nextInt(190)).build();
        Animal horse = animalBuilder.setName("Horse").setFlyable(false)
                .setSpeed(new SecureRandom().nextInt(75)).build();
        animalList.add(tiger);
        animalList.add(eagle);
        animalList.add(buzzard);
        animalList.add(hawk);
        animalList.add(horse);
        for (Animal animal : animalList) {
            if (animal.isFlyable()) {
                System.out.println("abc " + animal.isFlyable());
                animalRacingList.add(animal);
                testAnimalFly.getAnimalWin(animalRacingList);
            }
        }

    }

    private Animal getAnimalWin(List<Animal> animalList) {
        Animal animalWin = animalList.get(0);
        for (int i = 1; i < animalList.size(); i++) {
            if (animalList.get(i).getSpeed() > animalWin.getSpeed()) {
                animalWin = animalList.get(i);
            }
        }
        System.out.println("Winner is " + animalWin.getName() + ", with speed: " + animalWin.getSpeed());
        return animalWin;
    }

}

package Lab_07;

public class Horse extends Animal{
    private static int HORSE_MAX_SPEED=75;

    public Horse() {
        super(HORSE_MAX_SPEED);
    }

    public static void main(String[] args) {
        Animal horse = new Horse();
        System.out.println(horse.getSpeed());
        System.out.println(horse.getSpeed());
        System.out.println(horse.getSpeed());
    }
}

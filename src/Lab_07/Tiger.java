package Lab_07;

public class Tiger extends Animal {
    private static int TIGER_MAX_SPEED = 100;

    public Tiger() {
        super(TIGER_MAX_SPEED);
    }

    public static void main(String[] args) {
        Animal tiger = new Tiger();
        System.out.println(tiger.getSpeed());
        System.out.println(tiger.getSpeed());
        System.out.println(tiger.getSpeed());
        System.out.println(tiger.getSpeed());
    }
}

package Lab_07;

public abstract class Animal {

    /*
        Horse: max 75 km/h
        Tiger: max 100 km/h
        Dog: max 60 km/h

        Create an Animal class with a method speed() which return a random speeds
        Create 3 objects for those 3 animal type
        Run and see which animal is winner for racing
        Bonus: Default name with Class variable
        Format: winner is <Animal name>, with speed: <Speed>
        Hints: ** Class name can get from object.getClass().getSimpleName();
        int randomspeed = new SecureRandom().nextInt(50);
    */
    private int speed;

    public abstract int speed();
}

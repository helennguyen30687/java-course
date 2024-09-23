package lesson_07_1;

public class RobotDog {
    protected static int dogId = 0;
    private int robotId;

    public RobotDog() {
        robotId = dogId + 1;
        dogId++;
    }

    public int getDogId() {
        return robotId;
    }
}

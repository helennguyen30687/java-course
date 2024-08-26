package Lesson_07;

public class BatteryRobotCat extends RobotCat {
    public BatteryRobotCat(String name, String productionDate) {
        super(name, productionDate);
    }

    @Override
    public String charge() {
        return super.charge()+" with battery";
    }
}

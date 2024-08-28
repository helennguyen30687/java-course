package Lesson_07;

public class WindRobotCat extends RobotCat{
    public WindRobotCat(String name, String productioDate){
        super(name,productioDate);
    }
    public WindRobotCat(){
        super();
    }

    @Override
    public String charge(){
        return super.charge()+ " with wind";
    }
}

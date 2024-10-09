package Lesson_08;

public class TestHouseBuilder {
    public static void main(String[] args) {
        HouseWithBuilder.Builder builder = new HouseWithBuilder.Builder();
        builder.setDoorNum(2);
        builder.setTopRoofColor("white");
        HouseWithBuilder house = builder.build();
        System.out.println(house);
    }
}

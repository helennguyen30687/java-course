package Lesson_08;

import Lesson_08.HouseWithBuilder.Builder;

public class TestHouseBuilder {
    public static void main(String[] args) {
        Builder builder = new Builder();
        HouseWithBuilder house = builder
                .setDoorNum(2)
                .setTopRoofColor("white")
                .build();
        System.out.println(house);
    }
}

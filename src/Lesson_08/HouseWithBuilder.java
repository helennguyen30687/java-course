package Lesson_08;

public class HouseWithBuilder {
    private int doorNum = 1;
    private String topRoofColor = "red";

    public HouseWithBuilder() {
    }

    public HouseWithBuilder(Builder builder) {
        doorNum = builder.doorNum;
        topRoofColor = builder.topRoofColor;
    }

    // READ ONLY
    public int getDoorNum() {
        return doorNum;
    }

    public String getTopRoofColor() {
        return topRoofColor;
    }

    @Override
    public String toString() {
        return "HouseWithBuilder{" +
                "doorNum=" + doorNum +
                ", topRoofColor='" + topRoofColor + '\'' +
                '}';
    }

    public static class Builder {
        private int doorNum = 1;
        private String topRoofColor = "red";

        public void setDoorNum(int doorNum) {
            this.doorNum = doorNum;
        }

        public void setTopRoofColor(String topRoofColor) {
            this.topRoofColor = topRoofColor;
        }

        public HouseWithBuilder build() {
            return new HouseWithBuilder(this);
        }
    }
}

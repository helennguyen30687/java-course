package Lesson_10_2;

public class TestEch {
    public static void main(String[] args) {
        Ech ech;

        boolean isEnoughTime = true;

        if (isEnoughTime) {
            ech = new EchCon();
        } else {
            ech = new NongNoc();
        }
    }
}

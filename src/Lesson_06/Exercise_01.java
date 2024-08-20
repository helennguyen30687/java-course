package Lesson_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise_01 {
    //Given input string: "2hrs and 5 minutes", please calculate how many minutes in total
    public static void main(String[] args) {
        String timeString = "2hrs and 5 minutes";
        int totalTime = calculateTime(timeString);
        System.out.println("Total minutes is: " + totalTime);
    }

    public static int calculateTime(String timeString) {
        Pattern pattern = Pattern.compile("(\\d+)hrs?.*?(\\d+) minutes?");
        Matcher matcher = pattern.matcher(timeString);

        int hour = 0;
        int minute = 0;

        if (matcher.find()) {
            hour = Integer.parseInt(matcher.group(1));
            minute = Integer.parseInt(matcher.group(2));
        }
        return hour * 60 + minute;
    }
}

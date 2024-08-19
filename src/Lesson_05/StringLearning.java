package Lesson_05;

import java.util.Arrays;

public class StringLearning {
    public static void main(String[] args) {
        //Check lowercase, uppercase, digit...
        String myPassword = "123myPassword";
        char[] myCharacters = myPassword.toCharArray();
        int totalDigits = 0;
        int totalLowerCase = 0;
        int totalUpperCase = 0;

        for (char character : myCharacters) {
            if (Character.isDigit(character)) totalDigits++;
            else if (Character.isLowerCase(character)) totalLowerCase++;
            else if (Character.isUpperCase(character)) totalUpperCase++;
        }

        if (totalDigits > 0 && totalLowerCase > 0 && totalUpperCase > 0) {
            System.out.println("You are all set!");
        } else System.out.println("Wrong format password");
        //Replace, immutable
        String badWordContainer = "           bad, very bad, sth else, bad ";
        String filterStr = badWordContainer.replace("bad", "b**");
        System.out.println(badWordContainer);
        System.out.println(filterStr);

        //Trim
        System.out.println("--------------------");
        System.out.println(badWordContainer.trim());

        //Substring, indexOf, split
        String url = "☺https://google.com";
        System.out.println(url.length());
        System.out.println(url.indexOf("ht"));
        System.out.println(url.indexOf("w"));
        System.out.println(url.indexOf("☺"));

        System.out.println(url.substring(2, url.length()));
        System.out.println(url.substring(0, 3));

        String[] splitStr = url.split("");
        System.out.println(Arrays.toString(splitStr));

        //Regex | Regular expression
        String myCookingTimes = "          105 mins            ";

        // TODO: Pattern and Matcher
        String cookingTimeNumStr = myCookingTimes.replaceAll("[^0-9]", "");
        System.out.println(cookingTimeNumStr);
        System.out.println(cookingTimeNumStr + 1);

        System.out.println(Integer.valueOf(cookingTimeNumStr) + 1);
        System.out.println("My cooking time: " + (cookingTimeNumStr + 1));

        //StringBuilder
    }
}

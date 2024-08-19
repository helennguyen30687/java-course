package Lesson_05;

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

        if(totalDigits>0 && totalLowerCase >0 && totalUpperCase >0){
            System.out.println("You are all set!");
        }
        else System.out.println("Wrong format password");

    }
}

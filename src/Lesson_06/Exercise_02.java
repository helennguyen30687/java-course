package Lesson_06;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Exercise_02 {
    //String myPassword="password123"; Allow user to input maximum 3 times
    public static void main(String[] args) {

        String myPassword = "password123";
        int maxAttempt=3;
        boolean authenSuccess = false;
        Scanner scanner= new Scanner(System.in);

        for (int attempt = 0; attempt < maxAttempt; attempt++) {
            System.out.print("Enter password (attempt "+attempt+ " of "+maxAttempt+"): ");
            String userInput = scanner.nextLine();

            if(userInput.equals(myPassword)){
                authenSuccess=true;
                System.out.println("Correct password");
                break;
            }else {
                System.out.println("Incorrect password!");
            }
        }
        if(!authenSuccess){
            System.out.println("Access denied");
        }
        scanner.close();
    }
}

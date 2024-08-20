package Lesson_06;

public class Exercise_03 {
    //String myStr="100 minutes";
    //NOT using REGEX, extract digit character from that String
    //Expected output:"100".
    //EX: "12345nabcd678" -> "12345678"
    public static void main(String[] args) {
        String myStr = "12345nabcd678";
        System.out.println("Digit character from " + myStr + " is: "+extractDigit(myStr));
    }

    public static String extractDigit(String inputString) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char str : inputString.toCharArray()) {
            if (Character.isDigit(str)) {
                stringBuilder.append(str);
            }
        }
        return stringBuilder.toString();
    }
}

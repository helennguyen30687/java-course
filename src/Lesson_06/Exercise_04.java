package Lesson_06;

import java.net.MalformedURLException;
import java.net.URL;

public class Exercise_04 {
    //String url="https://google.com";
    //Check http OR https; domain name, .com OR .net

    public static void checkUrl(String urlString){
        try {
            URL url = new URL(urlString);

        } catch (MalformedURLException e) {
            System.out.println("Malformed URL: "+e.getMessage());
        }
    }
}

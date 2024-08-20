package Lesson_06;

import java.net.MalformedURLException;
import java.net.URL;

public class Exercise_04 {
    //String url="https://google.com";
    //Check http OR https; domain name, .com OR .net
    public static void main(String[] args) {
        checkUrl("https://sub.google.net.uk");
    }

    public static void checkUrl(String urlString) {
        try {
            URL url = new URL(urlString);

            String scheme = url.getProtocol();
            String host = url.getHost();
            String[] hostpart = host.split("\\.");
            String tld1 = hostpart[hostpart.length - 1];
            String tld2 = hostpart[hostpart.length - 2];

            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                System.out.println("Scheme: " + scheme);
            } else {
                System.out.println("Scheme is neither https nor http");
            }

            if (host.contains(".")) System.out.println("Domain name: " + host);
            else System.out.println("Domain name is invalid");

            if (hostpart.length > 1) {
                if (tld1.equalsIgnoreCase("com") && tld2.equalsIgnoreCase("net")
                        || (tld1.equalsIgnoreCase("net") && tld2.equalsIgnoreCase("com"))) {
                    System.out.println("Invalid URL");
                } else if (tld1.equalsIgnoreCase("com") || tld1.equalsIgnoreCase("net")) {
                    System.out.println("Top-level domain is: " + tld1);
                } else if (tld2.equalsIgnoreCase("com") || tld2.equalsIgnoreCase("net")) {
                    System.out.println("Top-level domain is: " + tld2);
                }
            } else System.out.println("Top-level domain is neither .com nor .net.");

        } catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        }

    }
}

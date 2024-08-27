//import Scanner

import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {

        // See Learn the Part for the complete instructions.
        String username;
        String home;
        int age;
        String favLanguage;

        // set up scanner.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        // Pick up user's name and store it.
        username = scanner.nextLine();

        // add new a line before asking next question.
        System.out.println("Hi " + username + "! I'm Javabot. Where are you from?");
        // Pick up user's home and store it.
        home = scanner.nextLine();

        // add new a line before asking next question.
        System.out.println("I hear it's beautiful at " + home + "! I'm from a place called Oracle");
        System.out.println("How old are you?");
        // Pick up age and store it.
        age = scanner.nextInt();

        // add new a line before asking next question.
        System.out.println("So you're " + age + ", cool! I'm 400 years old.");
        System.out.println("This means I'm " + (400 / age) + " times older than you.");
        System.out.println("Enough about me. What's your favourite language? (just don't say Python)");
        // Pick up language and store it.
        scanner.nextLine();
        favLanguage = scanner.nextLine();

        // add new a line here.
        System.out.println(favLanguage + ", that's great! Nice chatting with you " + username
                + ". I have to log off now. See ya!");

        // close scanner.
        scanner.close();

    }
}

package CODE_ALPHA;

import java.util.Scanner;

public class TASK2 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("      Welcome to AI ChatBot");
        System.out.println("Type 'bye' to exit.");
        System.out.println("================================");

        while (true) {

            System.out.print("\nYou: ");
            String message = input.nextLine().toLowerCase();

            if (message.equals("hello") || message.equals("hi")) {
                System.out.println("Bot: Hello! How can I help you?");

            } else if (message.contains("name")) {
                System.out.println("Bot: My name is Java AI ChatBot.");

            } else if (message.contains("how are you")) {
                System.out.println("Bot: I'm doing great! Thanks for asking.");

            } else if (message.contains("course")) {
                System.out.println("Bot: I can answer questions about Java programming.");

            } else if (message.contains("java")) {
                System.out.println("Bot: Java is an object-oriented programming language.");

            } else if (message.contains("time")) {
                System.out.println("Bot: Sorry, I cannot tell the current time because I'm offline.");

            } else if (message.contains("weather")) {
                System.out.println("Bot: I cannot check the weather because I'm offline.");

            } else if (message.contains("help")) {
                System.out.println("Bot: You can ask me about Java, my name, course, weather, or greet me.");

            } else if (message.contains("thank")) {
                System.out.println("Bot: You're welcome! Happy to help.");

            } else if (message.contains("creator") || message.contains("who made you")) {
                System.out.println("Bot: I was created as a Java chatbot project.");

            } else if (message.contains("age")) {
                System.out.println("Bot: I don't have an age. I am a computer program.");

            } else if (message.contains("favorite color")) {
                System.out.println("Bot: My favorite color is blue.");

            } else if (message.contains("good morning")) {
                System.out.println("Bot: Good morning! Have a wonderful day.");

            } else if (message.contains("good night")) {
                System.out.println("Bot: Good night! Sleep well.");

            } else if (message.contains("bye")) {
                System.out.println("Bot: Goodbye! Have a nice day.");
                break;

            } else {
                System.out.println("Bot: Sorry, I don't understand your question.");
            }
        }

        input.close();
    }
}

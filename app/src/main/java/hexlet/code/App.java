package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        String choice = scanner.next();
        switch (choice) {
            case "1":
                System.out.println("Welcome to the Brain Games!");
                System.out.print("May I have your name? ");

                String userName = scanner.next();

                System.out.println("Hello, " + userName + "!");
                scanner.close();
                break;
            case "2":
                System.out.println("Welcome to the Brain Games!");
                System.out.print("May I have your name? ");

                String usr = scanner.next();

                System.out.println("Hello, " + usr + "!");
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

                var correctCount = 0;
                while (correctCount != 3) {
                    var random = Math.round(Math.random() * 10);
                    System.out.println("Question: " + random);
                    System.out.print("Your answer: ");
                    String answer = scanner.next();

                    var isEven = random % 2 == 0;
                    var correctAnswer = isEven ? "yes" : "no";

                    if (answer.equals(correctAnswer)) {
                        System.out.println("Correct!");
                        correctCount += 1;
                    } else {
                        var prompt = "'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'" + ".";
                        System.out.println(prompt);
                        System.out.println("Let's try again, " + usr);
                        scanner.close();
                        return;
                    }
                }
                System.out.println("Congratulations, " + usr + "!");
                break;
            case "0":
                scanner.close();
                break;
            default:
                scanner.close();
                break;
        }
    }
}

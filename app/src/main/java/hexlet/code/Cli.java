package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Game;

public class Cli {
    private final Scanner scanner;

    Cli() {
        this.scanner = new Scanner(System.in);
    }

    public void exitProgram() {
        this.scanner.close();
    }

    public String promptMenu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        return this.scanner.next();
    }

    public void greet() {
        System.out.println("Welcome to the Brain Games!");
        this.askUserName();
        this.exitProgram();
    }

    public String askUserName() {
        System.out.print("May I have your name? ");

        String userName = this.scanner.next();

        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    public void runGame(Game game) {
        var userName = this.askUserName();

        System.out.println(game.getRules());

        var correctCount = 0;

        while (correctCount != 3) {
            var generatedGame = game.generate();
            var question = generatedGame[0];
            var answer = generatedGame[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = this.scanner.next();

            if (userAnswer.equals(answer)) {
                System.out.println("Correct!");
                correctCount += 1;
            } else {
                var endGageMessage = new StringBuilder();
                endGageMessage.append("'" + userAnswer + "'");
                endGageMessage.append(" is wrong answer ;(. Correct answer was ");
                endGageMessage.append("'" + answer + "'" + ".");

                System.out.println(endGageMessage);
                System.out.println("Let's try again, " + userName);

                this.exitProgram();
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}

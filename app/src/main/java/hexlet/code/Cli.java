package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Game;

public class Cli {
    private static final int MAX_WINS = 3;
    private final Scanner scanner;

    Cli() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Exits program.
     */
    public void exitProgram() {
        this.scanner.close();
    }

    /**
     * Prompts menu and returns user choice.
     * @return User choice
     */
    public String promptMenu() {
        System.out.println("Please enter the game number and press Enter.");

        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        return this.scanner.next();
    }

    /**
     * Prompts greeting.
     */
    public void greet() {
        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        this.askUserName();
        this.exitProgram();
    }

    /**
     * Prompts asking username and return.
     * @return username
     */
    public String askUserName() {
        System.out.print("May I have your name? ");

        String userName = this.scanner.next();

        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    /**
     * Runs a game.
     * @param game Game object
     */
    public void runGame(Game game) {
        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        var userName = this.askUserName();

        System.out.println(game.getRules());

        var wins = 0;

        while (wins != MAX_WINS) {
            var generatedGame = game.generate();
            var question = generatedGame[0];
            var answer = generatedGame[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = this.scanner.next();

            if (userAnswer.equals(answer)) {
                System.out.println("Correct!");
                wins += 1;
            } else {
                var endGameMessage = new StringBuilder();
                endGameMessage.append("'" + userAnswer + "'");
                endGameMessage.append(" is wrong answer ;(. Correct answer was ");
                endGameMessage.append("'" + answer + "'" + ".");

                System.out.println(endGameMessage);
                System.out.println("Let's try again, " + userName + "!");

                this.exitProgram();
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}

package hexlet.code;

import hexlet.code.games.IsEven;
import hexlet.code.games.Calc;

public class App {
    public static void main(String[] args) {
        var cli = new Cli();
        var choice = cli.promptMenu();

        switch (choice) {
            case "1":
                cli.greet();
                break;
            case "2":
                cli.runGame(new IsEven());
                break;
            case "3":
                cli.runGame(new Calc());
            default:
                cli.exitProgram();
                break;
        }
    }
}

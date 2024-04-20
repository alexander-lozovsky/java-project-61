package hexlet.code;

import hexlet.code.games.IsEven;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

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
                break;
            case "4":
                cli.runGame(new GCD());
                break;
            case "5":
                cli.runGame(new Progression());
            case "6":
                cli.runGame(new Prime());
            default:
                cli.exitProgram();
                break;
        }
    }
}

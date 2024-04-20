package hexlet.code;

import hexlet.code.games.IsEven;

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
            default:
                cli.exitProgram();
                break;
        }
    }
}

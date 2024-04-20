package hexlet.code.games;

import hexlet.code.Utils;

public class IsEven implements Game {
    private static int minNumber = 1;

    private static int maxNumber = 10;

    public String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public String[] generate() {
        var question = Utils.getRandomNumber(minNumber, maxNumber);
        var answer = Utils.isNumberEven(question) ? "yes" : "no";

        return new String[] {String.valueOf(question), answer};
    }
}

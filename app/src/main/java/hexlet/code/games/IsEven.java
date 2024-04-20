package hexlet.code.games;

import hexlet.code.Utils;

public class IsEven implements Game {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 10;

    /**
     * @return Rules description
     */
    public String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    /**
     * Generates game data.
     * @return Game data
     */
    public String[] generate() {
        var question = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
        var answer = Utils.isNumberEven(question) ? "yes" : "no";

        return new String[] {String.valueOf(question), answer};
    }
}

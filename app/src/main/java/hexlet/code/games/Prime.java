package hexlet.code.games;

import hexlet.code.Utils;

public class Prime implements Game {
    private static final int  MIN_NUMBER = 2;
    private static final int  MAX_NUMBER = 100;

    /**
     * @return Rules description
     */
    public String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    /**
     * Generates game data.
     * @return Game data
     */
    public String[] generate() {
        var question = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
        var answer = Utils.isNumberPrime(question) ? "yes" : "no";

        return new String[] {String.valueOf(question), answer};
    }
}

package hexlet.code.games;

import hexlet.code.Utils;

public class GCD implements Game {
    private static final int MIN_NUMBER = 1;

    private static final int MAX_NUMBER = 30;

    /**
     * @return Rules description
     */
    public String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    /**
     * Generates game data.
     * @return Game data
     */
    public String[] generate() {
        var firstNumber = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
        var secondNumber = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER);

        var question = firstNumber + " " + secondNumber;
        var answer = String.valueOf(Utils.getMaxDivisor(firstNumber, secondNumber));

        return new String[] {question, answer};
    }
}

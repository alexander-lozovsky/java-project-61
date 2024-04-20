package hexlet.code.games;

import hexlet.code.Utils;

public class GCD implements Game {
    private static int minNumber = 1;
    private static int maxNumber = 30;

    public String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    public String[] generate() {
        var firstNumber = Utils.getRandomNumber(minNumber, maxNumber);
        var secondNumber = Utils.getRandomNumber(minNumber, maxNumber);

        var question = firstNumber + " " + secondNumber;
        var answer = String.valueOf(Utils.getMaxDivisor(firstNumber, secondNumber));

        return new String[] {question, answer};
    }
}

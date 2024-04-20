package hexlet.code.games;

import hexlet.code.Utils;

public class Prime implements Game {
    private static int minNumber = 2;
    private static int maxNumber = 100;

    public String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public String[] generate() {
        var question = Utils.getRandomNumber(minNumber, maxNumber);
        var answer = Utils.isNumberPrime(question) ? "yes" : "no";

        return new String[] {String.valueOf(question), answer};
    }
}

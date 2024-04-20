package hexlet.code.games;

import hexlet.code.Utils;

public class IsEven implements Game {
    public String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public String[] generate() {
        var question = Utils.getRandomNumber(1, 10);
        var answer = Utils.isNumberEven(question) ? "yes" : "no";

        return new String[] {String.valueOf(question), answer};
    }
}

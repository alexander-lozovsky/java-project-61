package hexlet.code.games;

import hexlet.code.Utils;

import java.util.StringJoiner;

public class Progression implements Game {
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 20;
    private static final int MIN_STEP = 1;
    private static final int MAX_STEP = 5;
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;

    /**
     * @return Rules description
     */
    public String getRules() {
        return "What number is missing in the progression?";
    }

    /**
     * Generates game data.
     * @return Game data
     */
    public String[] generate() {
        var start = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
        var step = Utils.getRandomNumber(MIN_STEP, MAX_STEP);
        var length = Utils.getRandomNumber(MIN_LENGTH, MAX_LENGTH);
        var gap = Utils.getRandomNumber(0, length - 1);

        var question = new StringJoiner(" ");
        var answer = start + (step * gap);

        var i = 0;
        while (i < length) {
            var number = start + (step * i);
            if (i == gap) {
                question.add("..");
            } else {
                question.add(String.valueOf(number));
            }
            i++;
        }

        return new String[] {question.toString(), String.valueOf(answer)};
    }
}

package hexlet.code.games;

import hexlet.code.Utils;

import java.util.StringJoiner;

public class Progression implements Game {
    private static int minNumber = 0;
    private static int maxNumber = 20;
    private static int minStep = 1;
    private static int maxStep = 5;
    private static int minLength = 5;
    private static int maxLength = 10;

    public String getRules() {
        return "What number is missing in the progression?";
    }

    public String[] generate() {
        var start = Utils.getRandomNumber(minNumber, maxNumber);
        var step = Utils.getRandomNumber(minStep, maxStep);
        var length = Utils.getRandomNumber(minLength, maxLength);
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

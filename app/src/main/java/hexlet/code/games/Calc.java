package hexlet.code.games;

import hexlet.code.Utils;

public class Calc implements Game {
    @SuppressWarnings("checkstyle:StaticVariableName")
    private static int operandMin = 1;
    private static int operandMax = 20;
    private static int plusCode = 1;
    private static int minusCode = 2;
    private static int multiplyCode = 3;


    public String getRules() {
        return "What is the result of the expression?";
    }

    public String[] generate() {
        var left = Utils.getRandomNumber(operandMin, operandMax);
        var right = Utils.getRandomNumber(operandMin, operandMax);

        var operator = Utils.getRandomNumber(plusCode, multiplyCode);

        if (operator == plusCode) {
            var question = left + " + " + right;
            var answer = String.valueOf(left + right);

            return new String[] {question, answer};
        }

        if (operator == minusCode) {
            var question = left + " - " + right;
            var answer = String.valueOf(left - right);

            return new String[] {question, answer};
        }

        var question = left + " * " + right;
        var answer = String.valueOf(left * right);

        return new String[] {question, answer};
    }
}

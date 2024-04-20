package hexlet.code.games;

import hexlet.code.Utils;

public class Calc implements Game {
    @SuppressWarnings("checkstyle:StaticVariableName")
    private static final int OPERAND_MIN = 1;
    private static final int OPERAND_MAX = 20;
    private static final int PLUS_CODE = 1;
    private static final int MINUS_CODE = 2;
    private static final int MULTIPLY_CODE = 3;

    /**
     * @return Rules description
     */
    public String getRules() {
        return "What is the result of the expression?";
    }

    /**
     * Generates game data.
     * @return Game data
     */
    public String[] generate() {
        var left = Utils.getRandomNumber(OPERAND_MIN, OPERAND_MAX);
        var right = Utils.getRandomNumber(OPERAND_MIN, OPERAND_MAX);

        var operator = Utils.getRandomNumber(PLUS_CODE, MULTIPLY_CODE);

        if (operator == PLUS_CODE) {
            var question = left + " + " + right;
            var answer = String.valueOf(left + right);

            return new String[] {question, answer};
        }

        if (operator == MINUS_CODE) {
            var question = left + " - " + right;
            var answer = String.valueOf(left - right);

            return new String[] {question, answer};
        }

        var question = left + " * " + right;
        var answer = String.valueOf(left * right);

        return new String[] {question, answer};
    }
}

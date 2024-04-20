package hexlet.code.games;

public class IsEven implements Game {
    public String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public String[] generate() {
        var question = Math.round(Math.random() * 10);
        var answer = question % 2 == 0 ? "yes" : "no";

        return new String[] {String.valueOf(question), answer};
    }
}

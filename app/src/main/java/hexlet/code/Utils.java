package hexlet.code;

public class Utils {
    public static int getRandomNumber(int min, int max) {
        return (int) Math.floor(Math.random() * ((max - min) + 1)) + min;
    }

    public static boolean isNumberEven(int num) {
        return num % 2 == 0;
    }

    public static int getMaxDivisor(int a, int b) {
        if (b == 0) {
            return a;
        }

        return getMaxDivisor(b, a % b);
    };

    public static boolean isNumberPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

package lab1;

public class Reduce {

    public static int reduce(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        if (sum >= 10) {
            return reduce(sum);
        } else {
            return sum;
        }
    }
}
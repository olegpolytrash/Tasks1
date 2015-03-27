package oleksandr;

/**
 * Created by Sander on 26.03.2015.
 */
public class NumberOperations {
    protected static int countNumber(int num) {
     int  count = Integer.toString(num).length();
        return count;
    }

    protected static int sumOfNumbers(int num) {
        int sum = 0;
        while (num != 0) {
            sum = sum + (num % 10);
            num /= 10;
        }
        return sum;
    }
}

package oleksandr;

/**
 * Created by Sander on 26.03.2015.
 */
public class NumberOperations {
//method for checking number
    static protected int countNumber(int num) {
     int  count = Integer.toString(num).length();
        return count;
    }

     static protected int sumOfNumbers(int num) {
        int sum = 0;
        while (num != 0) {
            sum = sum + (num % 10);
            num /= 10;
        }
        return sum;
    }
}

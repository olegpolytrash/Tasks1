package misha;

/**
 * The {@code Application} class contains homework
 * solution.
 * @author misha
 */
public class Application {
    public static void main(String[] args) {
        System.out.println(makeGoodEnough(3));
        System.out.println(makeGoodEnough(4));
        System.out.println(makeGoodEnough(5));
    }

    /**
     * Finds the most suitable k value
     * according to this - 4^k < m
     *
     * @param m - real number, should be grater than 1
     * @return an integer number that satisfies the condition
     */
    public static int makeGoodEnough(double m) {
        int k = 0;
        while (Math.pow(4, k) < m) {
            k++;
        }
        return k - 1;
    }
}

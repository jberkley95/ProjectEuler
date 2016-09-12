/**
 * Created by John on 6/7/2016.
 */
public class Problem6 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int sumOfSquares = 0, squareOfSums = 0;

        for (int i = 1; i < 101; i++) {
            sumOfSquares += i * i;
            squareOfSums += i;
        }
        squareOfSums *= squareOfSums;

        System.out.println("The difference is " + (squareOfSums - sumOfSquares));

        long end = System.currentTimeMillis();
        System.out.println("Total Runtime: " + (end - start) + " milliseconds.");
    }
}

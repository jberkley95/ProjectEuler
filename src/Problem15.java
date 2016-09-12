import java.math.BigInteger;

/**
 * Created by John on 6/7/2016.
 */
public class Problem15 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        System.out.println("The total number of routes is: " +
                (factorial(new BigInteger("40"))).divide(
                        factorial(new BigInteger("20")).multiply(factorial(new BigInteger("20")))
                ));

        long end = System.currentTimeMillis();
        System.out.println("Total Runtime: " + (end - start) + " milliseconds.");
    }

    public static BigInteger factorial(BigInteger number) {
        BigInteger total = BigInteger.ONE;

        for (BigInteger i = BigInteger.ONE; i.compareTo(number) <= 0; i = i.add(BigInteger.ONE)) {
            total = total.multiply(i);
        }

        return total;
    }
}

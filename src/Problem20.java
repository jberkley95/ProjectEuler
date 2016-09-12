import java.math.BigInteger;

/**
 * Created by John on 6/7/2016.
 */
public class Problem20 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int sum = 0;
        String num = factorial(new BigInteger("100")).toString();


        for (int i = 0; i < num.length(); i++) {
            sum += Integer.parseInt(num.substring(i, i + 1));
        }

        System.out.println("The sum of the digits in 100! is: " + sum);

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

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by John on 6/8/2016.
 */
public class Problem025 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        BigInteger f1, f2, f3;
        f1 = new BigInteger("1");
        f2 = new BigInteger("1");
        f3 = new BigInteger("0");

        int count = 2;

        while (f3.toString().length() < 1_000) {
            f3 = f1.add(f2);
            count++;

            f1 = f2;
            f2 = f3;
        }

        System.out.println(f3);
        System.out.println("The index of the first Fib term to contain 1,000" +
                " digits is: Term " + count + ".");

        long end = System.currentTimeMillis();
        System.out.println("Total Runtime: " + (end - start) + " milliseconds.");
    }
}

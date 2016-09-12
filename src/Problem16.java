import java.math.BigInteger;

/**
 * Created by John on 6/7/2016.
 */
public class Problem16 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        BigInteger integer = new BigInteger("1");
        BigInteger base = new BigInteger("2");

        for (int i = 0; i < 1000; i++) {
            integer = integer.multiply(base);
        }
        String x = integer.toString();
        System.out.println(sumOfDigits(x));

        long end = System.currentTimeMillis();
        System.out.println("Total Runtime: " + (end - start) + " milliseconds.");
    }

    public static int sumOfDigits(String x)
    {
        int out = 0;
        for (int i = 0; i < x.length(); i++) {
            out += Integer.parseInt(x.charAt(i) +"");
        }
        return out;
    }
}

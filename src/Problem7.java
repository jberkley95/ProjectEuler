/**
 * Created by John on 6/7/2016.
 */
public class Problem7 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int numOfPrimes = 0;

        int i = 1;
        while (numOfPrimes < 10001) {
            i++;
            if (isPrime(i)) numOfPrimes++;
        }
        System.out.println("The 10,001st prime is : " + i);

        long end = System.currentTimeMillis();
        System.out.println("Total Runtime: " + (end - start) + " milliseconds.");
    }


    public static boolean isPrime(int i) {
        for (int j = 2; j < i; j++) {
            if (i % j == 0) return false;
        }
        return true;
    }
}

/**
 * Created by John on 6/7/2016.
 */
public class Problem14 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        long n;
        int startingNumber = 1, currentChain, longestChain = 0;

        for (long i = 1L; i < 1_000_000; i++) {
            n = i;
            currentChain = 1;
            while (n != 1) {
                if (n % 2 == 0) n /= 2;
                else n = (3 * n) + 1;
                currentChain++;
            }
            if (longestChain < currentChain) {
                longestChain = currentChain;
                startingNumber = (int)i;
            }
        }

        System.out.println("The longest chain starts at: " + startingNumber + ".");

        long end = System.currentTimeMillis();
        System.out.println("Total Runtime: " + (end - start) + " milliseconds.");
    }
}

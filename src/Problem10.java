/**
 * Created by John on 6/7/2016.
 */
public class Problem10 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        final int N = 2_000_000;
        long sum = 0L;

        boolean[] isPrime = new boolean[N+1];
        for (int i = 0; i <= N; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < N; i++) {
            if (isPrime[i]) {
                for (int j = i; i * j <= N; j++) {
                    isPrime[i * j] = false;
                }
            }
        }

        for (int i = 2; i < N; i++) {
            if (isPrime[i]) sum += i;
        }

        System.out.println("The sum of primes below 2 million is: " + sum);

        long end = System.currentTimeMillis();
        System.out.println("Total Runtime: " + (end - start) + " milliseconds.");
    }
}
/**
 * Created by John on 6/7/2016.
 */
public class PrimeSieve {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        final int N = 2_000_000_000;

        //generate prime flag array
        boolean[] isPrime = new boolean[N+1];
        for (int i = 0; i <= N; i++) {
            isPrime[i] = true;
        }

        //flag primes
        for (int i = 2; i * i < N; i++) {
            if (isPrime[i]) {
                for (int j = i; i * j <= N; j++) {
                    isPrime[i * j] = false;
                }
                //Uncomment to display primes as they are being generated
                //System.out.println(i);
            }
        }

        //count primes
        int primes = 0;
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                primes++;
            }
        }
        System.out.println("There are " + primes + " prime values less than " + N);

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total Runtime: " + totalTime + " milliseconds.");
    }
}

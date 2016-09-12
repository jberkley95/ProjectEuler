/**
 * Created by John on 6/6/2016.
 */
public class Problem003 {
    public static void main(String[] args) {
        long num = 600851475143L;
        long largestPrimeFactor = -1L;



        for (long i = 3L; i < num; i += 2) {
            if (num % i == 0 && isPrime(i)) {
                largestPrimeFactor = i;
                System.out.println(largestPrimeFactor);
            }
        }

        System.out.println(largestPrimeFactor);
    }

    public static boolean isPrime(long num) {
        for (long i = 3L; i < Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

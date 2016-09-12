/**
 * Created by John on 6/7/2016.
 */
public class Problem12 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        long currentTriangleNumber = 1L;
        int currentTriangleIndex = 1;

        while (numberOfDivisors(currentTriangleNumber) <= 500) {
            currentTriangleNumber = getNextTriangleNumber(currentTriangleIndex++);
        }

        System.out.println("The first triangle number w/ over 500 divisors is: "
                + currentTriangleNumber);

        long end = System.currentTimeMillis();
        System.out.println("Total Runtime: " + (end - start) + " milliseconds.");
    }

    public static long getNextTriangleNumber(int currentTriangleIndex) {
        currentTriangleIndex++;
        long sum = 0L;
        while (0 < currentTriangleIndex) {
            sum += currentTriangleIndex--;
        }

        return sum;
    }

    public static int numberOfDivisors(long num) {
        int count = 0;
        for (long i = 1L; i * i <= num; i++) {
            if (num % i == 0) count += 2;
        }

        return count;
    }
}

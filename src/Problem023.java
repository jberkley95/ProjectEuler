/**
 * Created by John on 6/8/2016.
 */
public class Problem023 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        final int MAX = 28123;
        int sum = 0;

        boolean[] abundantNums = new boolean[MAX + 1];
        boolean[] abundantSums = new boolean[MAX + 1];

        for (int i = 1; i < abundantNums.length; i++) {
            if (isAbundant(i)) abundantNums[i] = true;
        }

        for (int i = 1; i < abundantNums.length; i++) {
            for (int j = 1; j + i < abundantSums.length; j++) {
                if (abundantNums[i] && abundantNums[j] && i + j < abundantSums.length) {
                    abundantSums[i + j] = true;
                }
            }
        }

        for (int i = 1; i < abundantSums.length; i++) {
            if (!abundantSums[i]) sum += i;
        }

        System.out.println("The sum of all numbers that cannot be written as" +
                " the sum of two abundant nums is: " + sum + ".");

        long end = System.currentTimeMillis();
        System.out.println("Total Runtime: " + (end - start) + " milliseconds.");
    }

    public static boolean isAbundant(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum > num;
    }
}

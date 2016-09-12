/**
 * Created by John on 6/7/2016.
 */
public class Problem21 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int sum = 0;

        for (int i = 1; i < 10_000; i++) {
            if (isAmicable(i)) sum += i;
        }

        System.out.println("The sum of all amicable numbers under 10000 is "
                + sum + ".");

        long end = System.currentTimeMillis();
        System.out.println("Total Runtime: " + (end - start) + " milliseconds.");
    }

    public static int sumOfProperDivisors(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum;
    }

    public static boolean isAmicable(int num) {
        int partner = sumOfProperDivisors(num);
        return partner != num && sumOfProperDivisors(partner) == num;
    }
}

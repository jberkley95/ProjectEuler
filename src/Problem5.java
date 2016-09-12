/**
 * Created by John on 6/7/2016.
 */
public class Problem5 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int i = 20;
        while (true) {
            if (isMaximallyDivisible(i)) {
                System.out.println(i + " is divisible by 1-20.");
                break;
            }
            i++;
        }

        long end = System.currentTimeMillis();
        System.out.println("Total Runtime: " + (end - start) + " milliseconds.");
    }

    public static boolean isMaximallyDivisible(int i) {
        for (int j = 1; j < 21; j++) {
            if (!(i % j == 0)) return false;
        }
        return true;
    }
}

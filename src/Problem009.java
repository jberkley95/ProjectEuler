/**
 * Created by John on 6/7/2016.
 */
public class Problem009 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int finalA = -1, finalB = -1, finalC = -1;
        boolean foundTriple = false;

        for (int a = 1; a < 333; a++) {
            for (int b = a + 1; b < 500; b++) {
                for (int c = b + 1; c < 1000; c++) {
                    if ((a * a) + (b * b) == (c * c) && (a + b + c) == 1_000) {
                        foundTriple = true;
                        finalA = a;
                        finalB = b;
                        finalC = c;
                        break;
                    }
                }
                if (foundTriple) break;
            }
            if (foundTriple) break;
        }

        System.out.println("The Pythagorean Triple is: " + finalA + ", " + finalB + ", " + finalC + ".");
        System.out.println("The product is: " + (finalA * finalB * finalC) + ".");

        long end = System.currentTimeMillis();
        System.out.println("Total Runtime: " + (end - start) + " milliseconds.");
    }
}

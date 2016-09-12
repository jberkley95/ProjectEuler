/**
 * Created by John on 6/6/2016.
 */
public class Problem2 {
    public static void main(String[] args) {
        int f1 = 1, f2 = 1, f3 = 0;
        int sum = 0;

        while (f3 < 4_000_000) {
            f3 = f1 + f2;

            if (f3 % 2 == 0) {
                sum += f3;
            }

            f1 = f2;
            f2 = f3;
        }
        System.out.println(sum);
    }
}

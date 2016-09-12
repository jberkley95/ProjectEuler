/**
 * Created by John on 6/7/2016.
 */
public class Problem004 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int currentLargestPalindrome = -1;
        int numToBeChecked, temp, reverseNum, digit;

        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                numToBeChecked = i * j;
                temp = numToBeChecked;
                reverseNum = 0;

                while (temp > 0) {
                    digit = temp % 10;
                    reverseNum = reverseNum * 10 + digit;
                    temp /= 10;
                }

                if (numToBeChecked == reverseNum && currentLargestPalindrome < numToBeChecked)
                    currentLargestPalindrome = numToBeChecked;
            }
        }

        System.out.println("The largest palindrome is " + currentLargestPalindrome);

        long end = System.currentTimeMillis();
        System.out.println("Total Runtime: " + (end - start) + " milliseconds.");
    }
}

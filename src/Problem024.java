import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by John on 6/8/2016.
 */
public class Problem024 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        List<String> permutationList = new ArrayList<>();
        int[] values = {0,1,2,3,4,5,6,7,8,9};

        permutationGenerate(values, values.length, permutationList);
        Collections.sort(permutationList);

        System.out.println("The millionth lexicographical permutation of 0 - 9" +
                " is: " + permutationList.get(999_999) + ".");

        long end = System.currentTimeMillis();
        System.out.println("Total Runtime: " + (end - start) + " milliseconds.");
    }

    //Heap's Algorithm for Generating Permutations
    public static void permutationGenerate(int[] array, int n, List endList) {
        if (n == 1) {
            endList.add(arrayToString(array));
            System.out.println(Arrays.toString(array));
        } else {
            for (int i = 0; i < n - 1; i++) {
                permutationGenerate(array, n - 1, endList);
                if (n % 2 == 0)
                    swap(array, i, n - 1);
                else
                    swap(array, 0, n - 1);
            }
            permutationGenerate(array, n - 1, endList);
        }
    }

    public static void swap(int[] v, int i, int j) {
        int t = v[i]; v[i] = v[j]; v[j] = t;
    }

    public static String arrayToString(int[] array) {
        String temp = "";
        for (int i = 0; i < array.length; i++) {
            temp += Integer.toString(array[i]);
        }
        return temp;
    }
}

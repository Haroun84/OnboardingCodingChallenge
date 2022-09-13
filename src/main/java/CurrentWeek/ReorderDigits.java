package CurrentWeek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReorderDigits {
    public static void main(String[] args) {

        int[] arr = new int[]{515, 341, 98, 44, 211};
        System.out.println("Reorder each element of array " + Arrays.toString(arr)
                           + " in ascending order: " +reorderDigitsAsc(arr));
        System.out.println("Reorder each element of array " + Arrays.toString(arr)
                           + " in descending order: " +reorderDigitsDesc(arr));
    }
        /*

         */
    public static String reorderDigitsAsc(int[] arr) {

        List<String> myList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            String s = Integer.toString(n);
            int[] digitArrays = new int[s.length()];
            int index = digitArrays.length - 1;
            while (n > 0) {
                int lastDigit = n % 10;
                digitArrays[index] = lastDigit;
                n /= 10;
                index--;
            }
            Arrays.sort(digitArrays);
            String m = "";
            for (int num : digitArrays) {
                m += num;
            }
            myList.add(m);
        }
        return myList.toString();
    }

    public static String reorderDigitsDesc(int[] arr) {

        List<String> myList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            String s = Integer.toString(n);
            Integer[] digitArrays = new Integer[s.length()];
            int index = digitArrays.length - 1;
            while (n > 0) {
                int lastDigit = n % 10;
                digitArrays[index] = lastDigit;
                n /= 10;
                index--;
            }
            Arrays.sort(digitArrays, Collections.reverseOrder());
            String m = "";
            for (int num : digitArrays) {
                m += num;
            }
            myList.add(m);
        }
        return myList.toString();
    }

}

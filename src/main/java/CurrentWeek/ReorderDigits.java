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
        /* Method to reorder each integer of the array in ascendant order
           - Convert each integer into an array of string
           - Create an array of digits with same length as string array
           - Add each digit to the digits array
           - Sort the digit array
           - Construct a string with the digits of the number
           - Add each string to an arraylist
           - Print array
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

                Arrays.sort(digitArrays); // Sort array of digits(from each element of array) in ascending order
                String m = "";

            for (int num : digitArrays) {
                m += num;
            }
            myList.add(m); // add each string constructed from digits of a number to list
        }
        return myList.toString(); // printing final array
    }

    //Method to reorder each integer of the array in descending order
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

                Arrays.sort(digitArrays, Collections.reverseOrder());//Sorting array in descending order
                String m = "";

            for (int num : digitArrays) {
                m += num;
            }
            myList.add(m);// add each string constructed from digits of a number to list
        }
        return myList.toString();
    }

}

import java.util.ArrayList;
import java.util.Collections;

public class LargestGapInArray {

    /* To find the largest gap between any two elements in an array, the following is my approach:
    1 - Define a variable gap that will store the absolute value of the difference between each element
        and every element in the array.
    2 - Initialize gap to 0
    4 - Iterate through all elements of the array to find all values of gap
    4 - Store all values in an arraylist called gaps.
    5 - Sort the arraylist in ascendant order
    6 - The result maxGap is the largest of the arraylist, which is at index(size - 1)
    7 - return maxGap
    */
    public static int LargestGap(int[] arr){
        int gap = 0;
        ArrayList<Integer> gaps = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++){
                gap = Math.abs(arr[i] - arr[j]); // The gap between an element and all the elements after
                gaps.add(gap); // add the difference to the list
            }
        }
        Collections.sort(gaps); // sort the list in ascendant order
        int maxGap = gaps.get(gaps.size() - 1); // value of the last element of the least which is the largest
        return maxGap;
    }

    public static void main(String[] args){
        int[] arr = {3, 10, 6, 7};
        System.out.println("The largest gap in the array is " +LargestGap(arr));
    }
}

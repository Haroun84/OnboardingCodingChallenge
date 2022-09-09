
public class MaxSumOfSubArray {

    /*
    To find the max sum of sub-arrays using divide and conquer:
    1- divide the array in two halves, left and right
    2 - iterate through the left part and find the maximum sum
    3 - iterate through the right part and find the maximum sum
    4 - find the maximum of sub-array that crosses the midpoint
    5 - the maximum of the sub-arrays is the maximum of left, right and mid sub-arrays
     */

    // method to return the maximum sum of sub-array crossing the middle element
    static int MidCrossSum(int[] arr, int low, int mid, int high) {

        // Iterating from the mid-element to the lowest to find the max sum including the mid-element
        int sum = 0;
        int leftSum = Integer.MIN_VALUE;
        for (int i = mid; i >= low; i--) {
            sum = sum + arr[i];
            if (sum > leftSum) {
                leftSum = sum;
            }
        }
        // Iterating from the mid-element to the right(high) to find the max sum including the mid-element
        sum = 0;
        int rightSum = Integer.MIN_VALUE;
        for (int i = mid + 1 ; i <= high ; i++) {
            sum = sum + arr[i];
            if (sum > rightSum) {
                rightSum = sum;
            }
        }
        return leftSum + rightSum; //maximum sum including the middle element

    }
    // Method to return the maximum sum of the sub-arrays
    static int LeftRightMaxSubArray(int[] arr, int low, int high) {
        // If the array contains only one element, we return that element, else we find the middle element
        if (low == high) {
            return arr[low];
        }
        else {
            int mid = (low + high)/2; // middle element of the array

            // returning the max element
            return Math.max(
                    Math.max(LeftRightMaxSubArray(arr, low, mid),
                    LeftRightMaxSubArray(arr, mid+1, high)),
                    MidCrossSum(arr, low, mid, high));
        }

    }

    public static void main(String[] args)
    {
        int arr[] =  {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = LeftRightMaxSubArray(arr, 0, arr.length - 1);
        System.out.println("The Maximum sum sub-array is " + maxSum);
    }

}

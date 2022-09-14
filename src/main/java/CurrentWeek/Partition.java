package CurrentWeek;

public class Partition {
    public static void main(String[] args) {
        Integer[] arr = {-1, -20, 5, -1, -2, 2};
        canPartition(arr);
    }
    // Define variable prod to store the product of all distinct elements of the array
    // Iterate through array to find all possible products between all elements
    //find the product of all elements except the current

    //Function using linear search to check whether an element of the array is equal to the product
    //of all elements except the element itself
    public static void canPartition(Integer[] arr){
        int prod = 1; //Initialize prod to 1 because it will be multiplied
        //Iteration loop to get product of all elements
        for (int i = 0; i < arr.length; i++) {
            prod = prod * arr[i];
        }
        boolean ans = false;
        for (Integer integer : arr) {
            if (prod - (integer * integer) == 0) {
                ans = true;
                break;
            }
        }
        System.out.println(ans);//printing answer
    }
}

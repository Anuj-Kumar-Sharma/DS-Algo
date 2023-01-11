package backtracking;

import java.util.*;

public class PartitionOfArray {
    public static void main(String[] args) {
        int a[] = {2, 1, 2, 3, 4, 8};
        // initialize a sum variable and set it to 0
        int sum = 0;
        // iterate over the array and add the value of each element to the sum
        for(int i = 0; i<a.length; i++) {
            sum += a[i];
        }
        // Create an ArrayList variable to store the partitioned array
        ArrayList<Integer> ans = new ArrayList<>();
        
        // check if the sum is even, if not partition is not possible
        // partition method is called to find the partition and store the result in isPossible variable
        boolean isPossible = (sum&1) == 0 && partition(a, sum/2, 0, ans);
        
        if(isPossible) {
            // print the partitioned array
            for(int e: ans) {
                System.out.print(e+" ");
            }
        } else {
            //if sum is odd or partition is not possible
            System.out.println("not possible");
        }

    }

    static boolean partition(int a[], int sum, int i, ArrayList<Integer> ans) {
        // if current index is greater than or equal to the length of array or sum is negative
        // the partition is not possible
        if(i >= a.length || sum < 0) return false;
        // if the remaining sum is 0, then return true, partition is possible
        if(sum == 0) return true;
        
        // add the current element to ans array 
        ans.add(a[i]);
        // make a recursive call to the partition method by reducing the sum by the value of current element
        // and increase the index to the next element 
        boolean leftPossible = partition(a, sum-a[i], i+1, ans);
        
        // if leftPossible is true, means partition is possible 
        if(leftPossible) return true;
        
        // if leftPossible is false, means partition is not possible with the current element
        // remove the current element as it was added to ans array earlier
        ans.remove(ans.size()-1);
        // make a recursive call to the partition method by keeping the same sum and 
        // increase the index to the next element 
        return partition(a, sum, i+1, ans);
    }

}























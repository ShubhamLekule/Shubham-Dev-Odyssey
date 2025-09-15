//Problem Description
//Given an array A, check if it is sorted in non-decreasing order or not.
//
//Non-decreasing order means that the numbers in a sequence can stay the same or increase, but they cannot decrease.
//
//
//Problem Constraints
//1 <= Ai <= 109
//1 <= |A| <= 105
//
//
//Input Format
//The first and only argument contains an integer array A.
//
//
//Output Format
//Return 1 if array is sorted else return 0.
//
//
//Example Input
//Input 1:
// A = [1, 2, 2] 
//Input 2:
// A = [1, 2, 1] 
//
//
//Example Output
//Output 1:
// 1
//Output 2:
// 0
//
//
//Example Explanation
//Explanation 1:
//We can see that the array elements are in non-decreasing order.
//Explanation 2:
//Second element is greater than the third element thus array is not in ascending order, hence not sorted.
import java.util.ArrayList;
import java.util.Arrays;
public class CheckArraySortedOrNot {
	public static int solve(ArrayList<Integer> A) {
        int prev=Integer.MIN_VALUE;
        for(int elm:A){
            if(prev<=elm) prev=elm;
            else return 0;
        }
        return 1;
    }
	public static void main(String[] args) {
		ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(4, 2, 3, 4, 4));
		System.out.println(solve(arr));


}

}

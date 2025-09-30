//Problem Description
//
//You are given an integer array A and an integer B.
//
//You are required to return the count of pairs having sum equal to B.
//
//NOTE: pair (i,j) and (j,i) are same.
//
//
//
//Problem Constraints
//
//1 <= A.size() <= 10000
//
//1 <= A[i] <= 10000
//
//1 <= B <= 10000
//
//
//
//Input Format
//
//First argument is an integer array A.
//
//Seond argument is an integer B.
//
//
//
//Output Format
//
//You have to return an integer representing count of required pairs.
//
//
//
//Example Input
//
//Input 1:
//
//A = [1,2,3,2,1]
//B = 5
//Input 2:
//
//A = [1,1,1]
//B = 2
//
//
//Example Output
//
//Output 1:
//
//2
//Output 2:
//
//3
//
//
//Example Explanation
//
//Explanation 1:
//
// A[1]+A[2] = A[2]+A[3] = 5
//Explanation 2:
//
// A[0]+A[1] = A[0]+A[2] = A[1]+A[2] = 2
import java.util.ArrayList;
import java.util.Arrays;

public class PairCount {
	public static int solve(ArrayList<Integer> A, int B) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
        int count=0;
        for(int i=0;i<A.size()-1;i++){
           for(int j=i+1;j<A.size();j++){
           if(A.get(i)+A.get(j)==B) count++;
        }
        }
        return count;
    }
	public static void main(String[] args) {
		ArrayList<Integer> arr= new ArrayList<Integer>(Arrays.asList(1,2,3,2,1));
		System.out.print(solve(arr, 5));

	}

}

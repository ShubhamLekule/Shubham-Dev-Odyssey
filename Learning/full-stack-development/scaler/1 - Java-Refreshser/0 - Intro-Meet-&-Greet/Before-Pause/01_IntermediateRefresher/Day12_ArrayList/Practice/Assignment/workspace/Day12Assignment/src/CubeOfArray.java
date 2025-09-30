//Problem Description
//You are provided with an integer array A. Return another array B of size same as that of A such that B[i] = A[i]3 for 1 <= i <= |A| (1 based indexing).
//
//
//Problem Constraints
//1 <= |A| <= 106
//1 <= A[i] <= 106
//
//
//Input Format
//The first and only argument is an integer array A.
//
//
//Output Format
//Return array B.
//
//
//Example Input
//Input 1 :
//A=[2, 6, 8, 1]
//Input 2 :
//A=[5]
//
//
//Example Output
//Output 1 :
//[8, 216, 512, 1]
//Output 2 :
//[125]
//
//
//Example Explanation
//Example 1 : Cubes of numbers 2, 6, 8 and 1 are 8, 216, 512 and 1 respectively.
//Example 2 : Cubes of number 5 is 125.
import java.util.ArrayList;
public class CubeOfArray {
	public ArrayList<Long> solve(ArrayList<Integer> A) {
        ArrayList<Long> arr=new ArrayList<>();
        for(int i=0;i<A.size();i++)
         arr.add((long)A.get(i)*A.get(i)*A.get(i));
         return arr;
    }
	public static void main(String[] args) {
		// call solve



}

}

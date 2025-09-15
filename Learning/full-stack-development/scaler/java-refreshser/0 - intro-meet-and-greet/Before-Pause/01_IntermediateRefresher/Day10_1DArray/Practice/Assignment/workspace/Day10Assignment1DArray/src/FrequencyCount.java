//Problem Description
//You are given an integer array A, you have to return an integer array of same size whose ith element is the frequency count of A[i] in array A .
//
//Note:
//
//When comparing two elements of the ArrayList(java), make sure to use .equals() method for accurate comparison.
//Eg : To compare ith index with jth index use A.get(i).equals(A.get(j)).
//
//
//
//Problem Constraints
//1 <= len(A) <= 1000
//
//1 <= A[i] <= 100
//
//
//
//Input Format
//First argument is an array of integers representing array A.
//
//
//
//Output Format
//You have to return an array of integers as per the question.
//
//
//
//Example Input
//Input 1:
//
//A = [1, 2, 5, 1, 5, 1 ]
//
//
//Example Output
//Output 1:
//
//[3, 1, 2, 3, 2, 3]
//
//
//Example Explanation
//Explanation 1:
//
//Clearly, In the given array we have 1 three times, 2 one time and 5 two times.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class FrequencyCount {
	 public static ArrayList<Integer> solve(ArrayList<Integer> A) {
	        ArrayList<Integer> arr=new ArrayList<Integer>(A.size());
	        for(int i=0;i<A.size();i++){
	            int count=0;
	            for(int j=0;j<A.size();j++){
	                if(A.get(i).equals(A.get(j))){
	                    ++count;
	                }
	            }
	            arr.add(count);
	        }
	        return arr;
	    }
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(1, 2, 5, 1, 5, 1));
		
		ArrayList<Integer> arrNew=solve(arr);
		for(int elm:arrNew) {
			System.out.print(elm+" ");
		}

	}

}

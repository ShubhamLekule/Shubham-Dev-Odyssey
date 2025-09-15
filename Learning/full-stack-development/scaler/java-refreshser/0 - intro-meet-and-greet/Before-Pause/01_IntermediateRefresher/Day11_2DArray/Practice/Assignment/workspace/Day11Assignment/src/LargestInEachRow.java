//Problem Description
//Given a 2D array A of N rows and M columns. Find value of largest element in each row.
//
//
//Problem Constraints
//1 <= N, M <= 1000
//1 <= Ai <= 109
//
//
//Input Format
//The first argument A is a 2D array of integers
//
//
//Output Format
//Return an array of length N, in which every index i contains the maximun value of the ith row in the 2D matrix.
//
//
//Example Input
//Input 1:
//A = [[1, 2], [1, 3]]
//Input 2:
//A = [[1, 2, 3]]
//
//
//Example Output
//Output 1:
// [2, 3]
//Output 2:
// [3]
//
//
//Example Explanation
//Explanation 1:
//In the first row 2 is maximum value.
//In the second row 3 is maximum value.
//Explanation 2:
//In the first and only row 3 is maximum value.
public class LargestInEachRow {
	 public int[] solve(int[][] A) {
	        int[] large=new int[A.length];
	        for(int i=0;i<A.length;i++){
	            large[i]=Integer.MIN_VALUE;
	            for(int j=0;j<A[0].length;j++){
	                if(A[i][j]>large[i]) large[i]= A[i][j];
	            }

	        }
	        return large;
	    }
	
	public static void main(String[] args) {
		// call solve

	}

}

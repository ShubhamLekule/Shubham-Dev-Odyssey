//Problem Description
//
//You are given a character string A, having length N and an integer ASCII code B.
//
//You have to tell the rightmost occurrence of the character having ASCII code equal to B, in A or report that it does not exist.
//
//
//
//
//                                                image
//
//
//
//
//
//Problem Constraints
//
//1 <= N <= 105
//
//A[i] ∈ ['a'-'z']
//
//97 <= B <= 122
//
//
//
//Input Format
//
//First argument is a character string A.
//
//Second argument is an integer B.
//

public class LastOccarance {
	public int solve(final String A, final int B) {
        int lastOccurance=-1;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)==B)
            lastOccurance=i;
        }
        return lastOccurance;
    }
	public static void main(String[] args) {
		// Call solve

	}

}

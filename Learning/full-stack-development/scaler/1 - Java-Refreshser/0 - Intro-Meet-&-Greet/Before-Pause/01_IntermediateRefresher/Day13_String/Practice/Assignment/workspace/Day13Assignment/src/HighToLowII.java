//Problem Description
//
//You are given uppercase string (S) and you have to return a string that is the lower case form of S.
//
//Uppercase strings are those which have all letters in uppercase (Example: MACHINE)
//
//Lowercase strings are those which have all letters in lowercase (Example: machine)
//
//Problem Constraints
//
//1 <= S.size() <= 1000
//Input Format
//
//First and only argument containing a uppercase string **S**.
//Output Format
//
//You have to return lowercase form of input string.
//Example Input
//
//Input 1:
//INTERVIEWBIT
//Input 2:
//SCALER
//Example Output
//
//Output 1:
//interviewbit
//Output 2:
//scaler
//Example Explanation
//
//Explanation 1:
//Clearly, lowercase of INTERVIEWBIT is interviewbit.
//Explanation 2:
//Clearly, lowercase of SCALER is scaler.
//Expected Output
//Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
public class HighToLowII {
	 public String solve(String A) {
	        String str="";
	        for(int i=0;i<A.length();i++){
	            str=str+((char)((int)A.charAt(i)+32));
	        }
	        return str;
	    }
	public static void main(String[] args) {
		// call solve

	}

}

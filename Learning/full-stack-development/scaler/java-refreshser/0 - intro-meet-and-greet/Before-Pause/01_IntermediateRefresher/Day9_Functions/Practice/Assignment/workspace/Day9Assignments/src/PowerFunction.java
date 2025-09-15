//Problem Description
//
//You are given two integers A and B.
//
//You have to find the value of AB.
//
//NOTE: The value of answer is always less than or equal to 109.
//
//
//Problem Constraints
//
//1 <= A, B <= 1000
//
//
//
//Input Format
//
//First parameter is an integer A.
//
//Second parameter is an integer B.
//
//
//
//Output Format
//
//Return an integer.
//
//
//
//Example Input
//
//Input 1:
//
// A = 2
// B = 3 
//Input 2:
//
// A = 1
// B = 10 
//
//
//Example Output
//
//Output 1:
//
// 8 
//Output 2:
//
// 1 
//
//
//Example Explanation
//
//Explanation 1:
//
// For A = 2 and B = 3, the value of 23 = 2 * 2 * 2 = 8. 
//Explanation 2:
//
// For A = 1 and B = 10, the value of 110 = 1.
public class PowerFunction {
	public static int power(final int A, final int B) {
        return (int)Math.pow(A,B);
    }
	public static void main(String[] args) {
		System.out.println(power(10,2));

	}

}

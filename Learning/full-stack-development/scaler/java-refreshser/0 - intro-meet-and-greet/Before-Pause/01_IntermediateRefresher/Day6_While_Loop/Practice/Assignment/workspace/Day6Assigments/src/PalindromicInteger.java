//Problem Description
//You are given an integer A as input and you need to determine whether it is a palindrome or not.
//A palindrome integer is one whose digits, when reversed, result in the same number.
//For example, 121 is a palindrome because its reverse is also 121, but 123 is not a palindrome because its reverse is 321.
//
//Note: The given integer will not have any leading zeros.
//
//
//Problem Constraints
//1 <= A <= 106
//
//
//
//Input Format
//First and the only line contains a single integer A.
//
//
//
//Output Format
//Print Yes if it is palindromic, else print No.
//
//
//
//Example Input
//Input 1:
//
// 120 
//Input 2:
//
// 1001 
//Input 3:
//
// 131 
//
//
//Example Output
//Output 1:
//
// No 
//Output 2:
//
// Yes 
//Output 3:
//
// Yes 
//
//
//Example Explanation
//Explanation 1:
//
// For A = 120, reverse(A) = reverse(120) = 021 = 21 (removing leading zeroes). 120 is not equal to 21 
//Explanation 2:
//
// For A = 1001, reverse(A) = reverse(1001) = 1001, which is same as A.
//Explanation 3:
//
// For A = 131, reverse(A) = reverse(131) = 131, which is same as A. 
import java.util.Scanner;
public class PalindromicInteger {

	public static void main(String[] args) {
		 // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner ip=new Scanner(System.in);

    long A=ip.nextLong();
       long rev=0, org=A;

        while(A>=1){
            rev=(rev*10)+A%10;
            A=A/10;    
        }
        if(rev==org)System.out.print("Yes");
        else System.out.print("No");

	}

}

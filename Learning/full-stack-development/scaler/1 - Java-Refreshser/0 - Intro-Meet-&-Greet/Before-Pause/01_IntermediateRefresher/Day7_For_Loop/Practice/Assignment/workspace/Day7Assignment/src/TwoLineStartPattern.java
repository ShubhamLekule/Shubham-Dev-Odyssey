//Problem Description
//Print a pattern consisting of N rows, where each row contains an asterisk (*) at the beginning and end of the line, with N-2 spaces in between.
//
//The Pattern should look like:
//
//*<N-2 Spaces>*
//
//Print the above pattern for a total of N Rows.
//
//Refer Example ouput, for better clarification.
//
//
//Problem Constraints
//2 <= N <= 100
//
//
//
//Input Format
//First and only line of input contains a single integer N.
//
//
//
//Output Format
//Output the pattern corresponding to the given N.
//
//
//
//Example Input
//Input 1:
//
// 2
//Input 2:
//
// 4
//
//
//Example Output
//Output 1:
//
//**
//**
//Output 2:
//
//*  *
//*  *
//*  *
//*  *
//
//
//Example Explanation
//Explanation 1:
// Here N = 2,  So each row should have N - 2 spaces which is 0.
// Thus the N rows(i.e, 2 rows) should be in the form (asterisk)(0 spaces)(asterisk)
//Explanation 2:
// Here N = 4,  So each row should have N - 2 spaces which is 2.
// Thus the N rows(i.e, 4 rows) should be in the form (asterisk)(2 spaces)(asterisk)
import java.util.Scanner;
public class TwoLineStartPattern {

	public static void main(String[] args) {
		// YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        byte N=new Scanner(System.in).nextByte();
        for(byte i=1;i<=N;i++)
        {
           for(byte j=1;j<=N;j++) System.out.print((j==1 || j==N)?"*":" ");
           System.out.println();
        }

	}

}

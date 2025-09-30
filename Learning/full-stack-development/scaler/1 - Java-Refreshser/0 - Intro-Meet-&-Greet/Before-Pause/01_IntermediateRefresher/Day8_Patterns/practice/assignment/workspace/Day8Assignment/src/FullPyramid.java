//Problem Description
//
//Take an integer N, print the corresponding Full Pyramid pattern for N.
//
//For example if N = 5 then pattern will be like:
//
//    * 
//   * * 
//  * * * 
// * * * * 
//* * * * * 
//NOTE: There should be exactly one extra space after each * for each row.
//
//
//Problem Constraints
//
//2 <= N <= 100
//
//
//
//Input Format
//
//First and only line of input contains a single integer N.
//
//
//
//Output Format
//
//Output the Full Pyramid pattern corresponding to the given N.
//
//
//
//Example Input
//
//Input 1:
//
// 2
//Input 2:
//
// 3
//Input 3:
//
// 4
//
//
//Example Output
//
//Output 1:
//
//  * 
// * * 
//Output 2:
//
//   * 
//  * * 
// * * * 
//Output 3:
//
//    * 
//   * * 
//  * * * 
// * * * *   
// 
//
//
//Example Explanation
//
// Print the pattern as described.
import java.util.Scanner;
public class FullPyramid {

	public static void main(String[] args) {
		/*
		 * N=4
		 * 
		 * row			1	2	3	4
		 * space	3	2	1	0
		 * star			1	2	4	4
		 * 
		 * star=row
		 * leftspace=rightspace=N-row
		 * 
		 * Note:
		 * 1)There is no right Space, 
		 * 2)space after "*"
		 * 
		 */
		// YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        byte N=new Scanner(System.in).nextByte();
        for(byte i=1;i<=N;i++){
            for(byte j=1;j<=N-i;j++)System.out.print(" ");
            for(short j=1;j<=i;j++)System.out.print("* ");
            System.out.println();
        }

	}

}

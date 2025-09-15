//Problem Description
//Take an integer N as input, print the corresponding pattern for N.
//
//For example if N = 5 then pattern will be like:
//
//*****
//*   *
//*   *
//*   *
//*****
//Note : Except for the first line and the last line, every line will have N-2 spaces between the two stars.
//
//
//Problem Constraints
//3 <= N <= 100
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
// 3
//Input 2:
//
// 4
//
//
//Example Output
//Output 1:
//
//***
//* *
//***
//Output 2:
//
// 
//****
//*  *
//*  *
//****
//
//
//Example Explanation
// Print the pattern as described.
import java.util.Scanner;
public class PhotoFramePattern {

	public static void main(String[] args) {
		// YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        byte N=new Scanner(System.in).nextByte();
        for(byte i=1;i<=N;i++){
            for(byte j=1;j<=N;j++)System.out.print((i==1 || j==1 || i==N || j==N)?"*":" ");
            System.out.println();
        }

	}

}

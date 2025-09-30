//Problem Description
//Given an integer N, print N stars in a single line.
//
//For example if N = 5 then pattern will be like:
//
//*****
//
//Problem Constraints
//2 <= N <= 100
//
//
//
//Input Format
//Single line input contains a single integer N.
//
//
//
//Output Format
//Output N stars in a single line.
//
//
//
//Example Input
//Input 1:
//
// 2
//Input 2:
//
// 3
//
//
//Example Output
//Output 1:
//
//**
//Output 2:
//
//***
//
//
//Example Explanation
// Print the pattern as described.
import java.util.Scanner;
public class PrintNStar {

	public static void main(String[] args) {
		// YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner ip=new Scanner(System.in);
        byte N=ip.nextByte();
        for(int i=1;i<=N;i++) System.out.print("*");

	}

}

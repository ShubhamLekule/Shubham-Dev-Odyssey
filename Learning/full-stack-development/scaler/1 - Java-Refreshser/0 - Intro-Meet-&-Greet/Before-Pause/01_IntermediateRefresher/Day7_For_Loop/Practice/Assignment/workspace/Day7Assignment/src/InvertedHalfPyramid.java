//Problem Description
//
//Given an integer N, print the corresponding Inverted Half Pyramid pattern for N.
//
//For example if N = 4 then pattern will be like:
//
//****
//***
//**
//*
//
//
//Problem Constraints
//
//1 <= N <= 100
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
//Output the Inverted Half Pyramid pattern corresponding to the given N.
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
//
//
//Example Output
//
//Output 1:
//
// **
// *
//Output 2:
//
// ***
// **
// *
//
//
//Example Explanation
//
// Print the pattern as described.
import java.util.Scanner;
public class InvertedHalfPyramid {

	public static void main(String[] args) {
		// YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        byte N=new Scanner(System.in).nextByte();
        for(byte i=N;i>=1;i--){
            for(byte j=1;j<=i;j++) System.out.print("*");
            System.out.println();
        }

	}

}

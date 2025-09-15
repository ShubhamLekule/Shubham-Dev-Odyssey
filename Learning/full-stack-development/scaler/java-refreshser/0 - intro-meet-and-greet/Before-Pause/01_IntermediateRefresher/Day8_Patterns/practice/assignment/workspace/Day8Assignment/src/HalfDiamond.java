//Problem Description
//
//Take an integer N as input, print the corresponding Half Diamond pattern with 2*N - 1 rows.
//
//For example if N = 5 then pattern will be like:
//
//* 
//**
//***
//****
//*****
//****
//***
//**
//*
//NOTE: There should be no spaces after any * .
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
//Output the Half Diamond pattern corresponding to the given N.
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
// * 
// **
// *
//Output 2:
//
// *
// **
// ***
// **
// *
//
//
//Example Explanation
//
// Print the pattern as described.
import java.util.Scanner;
public class HalfDiamond {

	public static void main(String[] args) {
		/*
		 * N=4
		 * 
		 * row	1	2	3	4	5	6	7
		 * star	1	2	3	4	3	2	1
		 * 
		 */
		// YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        byte N=new Scanner(System.in).nextByte();
        // for(byte i=1;i<=(N*2)-1;i++){
        //     if(i<=N) for(byte j=1;j<=i;j++) System.out.print("*");
        //     else for(int j=(N*2)-i;j>=1;j--) System.out.print("*");
        //     System.out.println();
        // }
        for(byte i=1;i<=N;i++){
            for(byte j=1;j<=i;j++)System.out.print("*");
            System.out.println();
        }
        for(int i=N-1;i>=1;i--){
            for(int j=i;j>=1;j--) System.out.print("*");
            System.out.println();
        }

	}

}

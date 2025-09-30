//Problem Description
//Given two integers N and M as inputs, print a rectangle of N * M stars.
//
//For example if N = 3, M = 4 then pattern will be like:
//
//****
//****
//****
//
//
//Problem Constraints
//2 <= N, M <= 100
//
//
//
//Input Format
//First line of input contains an integers N (no of rows).
//
//Second line of input contains an integer M (no of cols).
//
//
//
//Output Format
//Output N * M rectangle of stars.
//
//
//
//Example Input
//Input 1:
//
// 2
// 3
//Input 2:
//
// 3
// 1
//
//
//Example Output
//Output 1:
//
//***
//***
//Output 2:
//
//*
//*
//*
//
//
//Example Explanation
// Print the pattern as described.
import java.util.Scanner;
public class PrintMatrixOfStar {

	public static void main(String[] args) {
		// YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner ip=new Scanner(System.in);
        int N=ip.nextInt(),M=ip.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=1;j<=M;j++){
                System.out.print("*");
            }
            System.out.println();
        }

	}

}

//Problem Description
//Write a program to input two numbers(A & B) from user and print the minimum element among A & B in each line.
//
//
//Problem Constraints
//1 <= A <= 1000000
//
//1 <= B <= 1000000
//
//
//
//Input Format
//First line is a single integer A.
//Second line is a single integer B.
//
//
//
//Output Format
//One line containing an integer as per the question.
//
//
//
//Example Input
//Input 1:
//
//5 
//6
//Input 2:
//
//1000 
//10000
//
//
//Example Output
//Output 1:
//
//5
//Output 2:
//
//1000
//
//
//Example Explanation
//Explanation 1:
//
//Clearly, among 5 and 6, 5 is minimum.
//Explanation 2:
//
//Clearly, among 1000 and 10000, 1000 is minimum.
import java.util.Scanner;
public class MinOfTwo {

	public static void main(String[] args) {
		// YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner ip = new Scanner(System.in);
        long A=ip.nextLong();
        long B=ip.nextLong();
        if(A>B)System.out.print(B);
        else System.out.print(A);

	}

}

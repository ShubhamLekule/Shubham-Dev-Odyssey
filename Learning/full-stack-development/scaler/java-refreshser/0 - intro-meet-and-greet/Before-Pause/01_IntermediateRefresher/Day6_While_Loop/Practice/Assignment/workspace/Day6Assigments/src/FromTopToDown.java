//Problem Description
//Write a program that takes a positive integer N as input from the user and prints all natural numbers from 1 to N, with each number followed by a space (including the last number).
//
//
//Problem Constraints
//1 <= N <= 1000000
//
//
//
//Input Format
//A single line representing N
//
//
//
//Output Format
//N space separated integers from 1 to N, with each number followed by a space, including the last number.
//
//
//
//Example Input
//Input 1:
//
//5
//Input 2:
//
//10
//
//
//Example Output
//Output 1:
//
//1 2 3 4 5 
//Output 2:
//
//1 2 3 4 5 6 7 8 9 10 
import java.util.Scanner;
public class FromTopToDown {

	public static void main(String[] args) {
		// YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        long N=new Scanner(System.in).nextLong();
        long i=1;
        if(N>0){
            while(i<=N){
                System.out.print(i+" ");
                i++;
            }
        }

	}

}

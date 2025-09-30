//Problem Description
//Write a program to print all odd numbers from 1 to N where you have to take N as input from user. Here N is inclusive.
//
//Note:
//Each number should be followed by a space, including the last number.
//
//
//Problem Constraints
//1 <= N <= 2000000
//
//
//
//Input Format
//A single line representing N
//
//
//
//Output Format
//All odd numbers from 1 to N, each number followed by a space, including the last number.
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
//1 3 5 
//Output 2:
//
//1 3 5 7 9 
import java.util.Scanner;
public class OddGame {

	public static void main(String[] args) {
		// YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner ip=new Scanner(System.in);
        long N=ip.nextLong();
        long i=1;
        if(N==0)System.out.print(N);
        else{
            while(i<=N){
                System.out.print(i+" ");
                i=i+2;
            }
        }

	}

}

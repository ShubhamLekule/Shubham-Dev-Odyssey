//Problem Description
//
//Write a program to print all Natural numbers from N to 1 where you have to take N as input from user
//
//
//Problem Constraints
//
//1 <= N <= 10000000
//
//
//
//Input Format
//
//A single line representing N
//
//
//
//Output Format
//
//N space separated integers from N to 1.
//
//
//
//Example Input
//
//Input 1:
//
//5
//Input 2:
//
//10
//
//
//Example Output
//
//Output 1:
//
//5 4 3 2 1 
//Output 2:
//
//10 9 8 7 6 5 4 3 2 1 
import java.util.Scanner;
public class FromDownToTop {

	public static void main(String[] args) {
		// YOUR CODE GOES HERE
		// Please take input and print output to standard input/output (stdin/stdout)
		// DO NOT USE ARGUMENTS FOR INPUTS
		// E.g. 'Scanner' for input & 'System.out' for output
		Scanner ip=new Scanner(System.in);
		long N=ip.nextLong();
		if(N==0) System.out.print(N);
		else{
			while(N>0){
				System.out.print(N+" ");
				N--;
			}
		}


	}

}

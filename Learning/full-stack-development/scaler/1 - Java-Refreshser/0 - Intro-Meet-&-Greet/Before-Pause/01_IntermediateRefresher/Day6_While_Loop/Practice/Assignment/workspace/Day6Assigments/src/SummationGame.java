//Problem Description
//
//Write a program to find sum all Natural numbers from 1 to N where you have to take N as input from user
//
//
//Problem Constraints
//
//1 <= N <= 1000
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
//A single integer showing sum of all Natural numbers from 1 to N
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
//15
//Output 2:
//
//55
import java.util.Scanner;
public class SummationGame {

	public static void main(String[] args) {
		// YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner ip=new Scanner(System.in);
        int N=ip.nextInt();
        long sum=0;
        int i=1;
            while(i<=N){
                sum=sum+i;
                i++;
            }
        
        System.out.print(sum);

	}

}

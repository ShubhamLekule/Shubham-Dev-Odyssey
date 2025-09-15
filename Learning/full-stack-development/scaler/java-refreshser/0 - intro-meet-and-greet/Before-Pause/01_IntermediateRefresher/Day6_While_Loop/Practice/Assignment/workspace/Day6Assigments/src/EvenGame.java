//Problem Description
//Write a program to print all even numbers from 1 to N where you have to take N as input from the user.
//Note: Use while-loop OR for-loop, according to session flow.
//
//Note: You can use int(input()) for obtaining user input of number N.
//
//Problem Constraints
//
//1 &lt;= N &lt;= 1000000
//Input Format
//
//A single line representing N
//Output Format
//
//All even numbers from 1 to N are separated by spaces.
//Example Input
//
//Input 1:
//5
//
//Input 2:
//10
//Example Output
//
//Output 1:
//2 4 
//
//Output 2:
//2 4 6 8 10
//Example Explanation
//
//Sample 1:
//2 4
//The even numbers between 1 to 5 are 2 and 4. So the numbers 2 and 4 are printed separated by space.
//
//Output 2:
//2 4 6 8 10
//The even numbers between 1 to 10 are 2, 4, 6, 8 and 10. So the numbers 2, 4, 6, 8, 10 are printed separated by space.
import java.util.Scanner;
public class EvenGame {

	public static void main(String[] args) {
		// YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner ip=new Scanner(System.in);
        long N=ip.nextLong();
        long i=2;
            while(i<=N){
                System.out.print(i+" ");
                i=i+2;
        }
	}

}

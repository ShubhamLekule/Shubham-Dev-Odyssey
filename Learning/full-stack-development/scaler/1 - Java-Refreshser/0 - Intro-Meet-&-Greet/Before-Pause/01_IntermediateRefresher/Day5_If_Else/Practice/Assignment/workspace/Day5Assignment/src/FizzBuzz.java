//Problem Description
//
//Write a program that takes in a number N as input and does the following:
//
//if N is a multiple of 3, print Fizz
//if N is a multiple of 5, print Buzz
//if N is a multiple of both 3 and 5, print FizzBuzz
//Problem Constraints:
//
//1 <= N <= 1000
//
//Input Format
//
//There is only 1 single line in the input, which is the integer N.
//
//Output Format
//
//Print Fizz / Buzz / FizzBuzz depending on the value N.
//
//Example Input
//
//Input 1:-
//9
//Input 2:-
//15
//
//
//Example Output
//
//Output 1:-
//Fizz
//Output 2:-
//FizzBuzz
import java.util.Scanner;
public class FizzBuzz {

	public static void main(String[] args) {
		 // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner ip =new Scanner(System.in);
        int num=ip.nextInt();
        if(num%3==0 && num%5==0)System.out.print("FizzBuzz");
        else if(num%3==0)System.out.print("Fizz");
        else if(num%5==0)System.out.print("Buzz");

	}

}

//Q7. Print perfect squares
//Solved
//feature icon
//Get your doubts resolved blazing fast with Chat GPT Help
//Check Chat GPT
//feature icon
//Using hints except Complete Solution is Penalty free now
//Use Hint
//Problem Description
//
//Take an input of a number A from the user. Print all perfect squares less than or equal to A.
//Note - Perfect squares are integers whose square root is an integer. (For Example: 16 is perfect square as √16 = 4, or 42 = 16)
//
//
//Problem Constraints
//
//1 <= A <= 104
//
//
//
//Input Format
//
//A single line consisting of a integer A.
//
//
//
//Output Format
//
//Print perfect squares less than or equal to A in a single line in a space-separated manner.
//
//
//
//Example Input
//
//Input 1:
//
//20
//Input 2:
//
//100
//
//
//Example Output
//
//Output 1:
//
//1 4 9 16
//Output 2:
//
//1 4 9 16 25 36 49 64 81 100
import java.util.Scanner;
public class PrintPerfectSquare {

	public static void main(String[] args) {
		// YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner ip=new Scanner(System.in);
        long A=ip.nextLong();
        long i=1;
        while((i*i)<=A){
            System.out.print(i*i+" ");
            i++;
        }

	}

}

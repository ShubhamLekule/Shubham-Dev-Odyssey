//Problem Description
//
//Take a name A as input from the user and print "Hello A", where A is the name in input.
//
//Problem Constraints
//
//1 <= len(A) <= 15 Characters in A are in lowercase English Alphabets.
//Input Format
//
//There is a single input line, which is the string **A**.
//Output Format
//
//Print in a single line "Hello A" without quotes.
//Example Input
//
//Input 1:-
//Ram
//Input 2:-
//Shyam
//Example Output
//
//Output 1:-
//Hello Ram
//Output 2:-
//Hello Shyam
import java.util.Scanner;
public class HelloName {

	public static void main(String[] args) {
		// YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner ip = new Scanner(System.in);
        String name=ip.next();
        System.out.print("Hello "+name);
	}

}

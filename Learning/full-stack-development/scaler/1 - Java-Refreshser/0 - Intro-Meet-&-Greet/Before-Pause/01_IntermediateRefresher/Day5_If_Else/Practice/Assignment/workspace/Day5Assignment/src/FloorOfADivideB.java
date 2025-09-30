//Problem Description
//Given two numbers A and B. Print the floor of A/B.
//
//Problem Constraints
//1 <= A, B <= 104
//
//
//Input Format
//There are two input lines
//The first line has a single integer A.
//The second line has a single integer B.
//
//
//Output Format
//Print the floor of A/B in a single line.
//
//
//Example Input
//Input 1:-
//4
//5
//Input 2:-
//16
//2
//
//
//Example Output
//Output 1:-
//0
//Output 2:-
//8
//
//
//Example Explanation
//Explanation 1:-
//floor(4/5) = 0
//Explanation 2:-
//floor(16/2) = 8
import java.util.Scanner;
public class FloorOfADivideB {

	public static void main(String[] args) {
		 // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
		Scanner ip=new Scanner(System.in);
        System.out.print(ip.nextInt()/ip.nextInt());

	}

}

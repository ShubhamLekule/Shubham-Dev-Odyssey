//Problem Description
//Given the number N, Categorise the number according to following condition :
//1. Odd-Positive
//2. Odd-Negative
//3. Even-Positive
//4. Even-Negative
//
//Note : Intention of problem is to teach you Nested If-Else, so try to solve this problem using nested if-else
//
//
//Problem Constraints
//-10000 <= N <= 10000 except 0
//
//
//Input Format
//Take Number in single line.
//
//
//Output Format
//Print the statement, according to number N in single line.
//
//
//Example Input
//Input 1 :
//15
//
//Input 2 :
//-38
//
//
//Example Output
//Output 1 :
//Odd-Positive
//
//Output 2 :
//Even-Negative
//
//
//Example Explanation
//Example Explanation 1 :
//N is 15, which is Odd and Positive.
//
//Example Explanation 2 :
//N is -38, which is Even and Negative.
import java.util.Scanner;
public class CategoriseTheNumber {

	public static void main(String[] args) {
		// YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner ip=new Scanner(System.in);
        int num=ip.nextInt();
        if(num < 0 && num%2==0)System.out.print("Even-Negative");
        else if(num < 0 && num%2!=0)System.out.print("Odd-Negative");
        else if(num%2==0)System.out.print("Even-Positive");
        else System.out.print("Odd-Positive");
	}

}

//Problem Description
//
//You are given a positive integer A. You have to print the sum of all even numbers in the range [1, A].
//
//
//
//Problem Constraints
//
//1 <= A <= 1000
//
//
//
//Input Format
//
//First and only line contains a single positive integer A.
//
//
//
//Output Format
//
//Print the required sum in a single line.
//
//
//Example Input
//
//Input 1:
//
// 1 
//Input 2:
//
// 4 
//
//
//Example Output
//
//Output 1:
//
// 0 
//Output 2:
//
// 6 
//
//
//Example Explanation
//
//Explanation 1:
//
// For A = 1, there are no even number which lies in the range [1, 1].
//Explanation 2:
//
// For A = 4, Even numbers 2 and 4 lie in the range [1, 4]. 
// Sum = 2 + 4 = 6. 
import java.util.Scanner;
public class SumOfEven {

	public static void main(String[] args) {
		// YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        int sum=0,i=2;
        Scanner ip=new Scanner(System.in);
        int A=ip.nextInt();
        while(i<=A){
            sum=sum+i;
            i+=2;
        }
        System.out.print(sum);

	}

}

//Problem Description
//
//You are given an integer N you need to print all the Prime Numbers between 1 and N.
//
//Prime numbers are numbers that have only 2 factors: 1 and themselves. For example, the first 5 prime numbers are 2, 3, 5, 7, and 11.
//
//
//Problem Constraints
//
//1 <= N <= 300
//
//
//
//Input Format
//
//First and only line of input contains a single integer N.
//
//
//
//Output Format
//
//Print all the prime numbers between between 1 and N each in a new line.
//
//
//
//Example Input
//
//Input 1:
//
// 5
//Input 2:
//
// 10
//
//
//Example Output
//
//Output 1:
//
// 2
// 3
// 5
//Output 2:
//
// 2
// 3
// 5
// 7
//
//
//Example Explanation
//
//Explanation 1:
//
// Prime numbers between [1, 5] are (2, 3, 5).
//Explanation 2:
//
// Prime numbers between [1, 10] are (2, 3, 5, 7)
import java.util.Scanner;
public class PrintThePrime {

	public static void main(String[] args) {
		 // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        short N=new Scanner(System.in).nextShort();
        for(short i=2;i<=N;i++){
            byte count=0; 
            for(short j=2;j<=i;j++){
            if(i%j==0) count++;
            if(count>1) break;
            }
            if(count==1)System.out.println(i);
        }

	}

}

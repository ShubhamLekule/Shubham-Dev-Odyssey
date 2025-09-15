//Problem Description
//Take T (number of test cases) as input.
//For each test case, take integer N as input and Print the count of digits of that number.
//
//Note: No of digits for number 0 is considered as 1.
//
//Problem Constraints
//
//1 <= T <= 100
//0 <= N <= 100000000
//
//Input Format
//
//The first line is the number T which denotes the total number of test cases.
//Next T lines contain an integer N for which you have to print the number of digits.
//Output Format
//
//For T different Numbers, Print the number of digits in separate lines.
//Example Input
//
//Input 1: 
//2
//0
//1
//
//Input 2:
//2
//100
//10101
//Example Output
//
//Output 1:
//1
//1
//Output 2:
//3
//5
//Example Explanation
//
//Explanation 1:
//0 and 1 both have only one digit.
//Explanation 2:
//100 has three digits and 10101 has 5 digits.
import java.util.Scanner;
public class CountTheDigits {

	public static void main(String[] args) {
		// YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner ip=new Scanner(System.in);
        short T=ip.nextShort();
        while(T>0){
            
            long N=ip.nextLong();
            
            if(N<10)System.out.println("1");
            else{
                short count=0;
            while(N>0){
                count++;
                N=N/10;
            }
            System.out.println(count);
            }
            T--;
        }
	}

}

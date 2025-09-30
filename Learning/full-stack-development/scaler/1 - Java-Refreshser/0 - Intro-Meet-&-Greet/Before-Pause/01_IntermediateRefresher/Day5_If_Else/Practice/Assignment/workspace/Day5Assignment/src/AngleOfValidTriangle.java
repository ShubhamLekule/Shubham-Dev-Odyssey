//Problem Description
//
//You are given 3 integer angles(in degrees) A, B and C of a triangle. You have to tell whether the triangle is valid or not.
//
//A triangle is valid if sum of its angles equals to 180.
//
//NOTE: You have to take the input of 3 sides of triangle from the user.
//
//
//Problem Constraints
//
//1 <= A, B, C <= 180
//
//
//
//Input Format
//
//First line of the input contains an integer A.
//
//Second line of the input contains an integer B.
//
//Third line of the input contains an integer C.
//
//
//
//Output Format
//
//Print 1 if the triangle having given sides is valid, else print 0.
//
//
//
//Example Input
//
//Input 1:
//
// 60
// 60
// 60
//Input 2:
//
// 30
// 40
// 50
//
//
//Example Output
//
//Output 1:
//
// 1 
//Output 2:
//
// 0 
//
//
//Example Explanation
//
//Explanation 1:
//
// Sum of angles = A + B + C = 60 + 60 + 60 = 180
// Hence, the given triangle is valid.
//Explanation 2:
//
// Sum of angles = A + B + C = 30 + 40 + 50 = 120
// As sum of angles is not equal to 180, the given triangle is not valid.
import java.util.Scanner;
public class AngleOfValidTriangle {

	public static void main(String[] args) {
		// YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner ip=new Scanner(System.in);
        int A=ip.nextInt();
        int B=ip.nextInt();
        int C=ip.nextInt();
        if((A+B+C)==180)System.out.print("1");
        else System.out.print("0");

	}

}

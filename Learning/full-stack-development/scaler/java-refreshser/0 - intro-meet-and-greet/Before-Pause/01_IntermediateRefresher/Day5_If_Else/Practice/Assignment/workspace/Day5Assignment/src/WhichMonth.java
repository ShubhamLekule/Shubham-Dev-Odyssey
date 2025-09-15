//Problem Description
//
//Write a program to input an integer(A) from user and print the Ath month of the year.
//
//Months list: {January, February, March, April, May, June, July, August, September, October, November, December}
//
//
//Problem Constraints
//
//1 <= A <= 12
//
//
//
//Input Format
//
//One line containing an integer integer A.
//
//
//
//Output Format
//
//One line containing the Ath month of the year.
//
//
//
//Example Input
//
//Input 1:
//
//1
//Input 2:
//
//6
//
//
//Example Output
//
//Output 1:
//
//January
//Output 1:
//
//June
//
//
//Example Explanation
//
//Explanation 1:
//
//Clearly, January is the 1st month.
//Explanation 2:
//
//Clearly, June is the 6th month.
import java.util.Scanner;
public class WhichMonth {

	public static void main(String[] args) {
		 // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner ip=new Scanner(System.in);
        short num=ip.nextShort();
        if(num==1)System.out.print("January");
        else if(num==2)System.out.print("February");
        else if(num==3)System.out.print("March");
        else if(num==4)System.out.print("April");
        else if(num==5)System.out.print("May");
        else if(num==6)System.out.print("June");
        else if(num==7)System.out.print("July");
        else if(num==8)System.out.print("August");
        else if(num==9)System.out.print("September");
        else if(num==10)System.out.print("October");
        else if(num==11)System.out.print("November");
        else System.out.print("December");

	}

}

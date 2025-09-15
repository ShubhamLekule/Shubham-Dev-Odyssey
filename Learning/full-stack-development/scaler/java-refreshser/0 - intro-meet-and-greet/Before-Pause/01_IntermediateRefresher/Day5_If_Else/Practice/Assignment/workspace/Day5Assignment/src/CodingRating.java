//Problem Description
//Write a program to input from user an integer(n) representing the rating of a person on a platform.
//
//You have to print the category of that person.
//
//If the rating is greater than or equal to 2100 then that person is "grand master".
//If the rating is greater than or equal to 1900 then that person is "candidate master".
//If the rating is greater than or equal to 1600 then that person is "expert".
//If the rating is greater than or equal to 1400 then that person is "pupil".
//If the rating is smaller than 1400 then that person is "newbie".
//NOTE: Print all the chars of the category of the person in lowercase if rating is odd otherwise print in UPPERCASE
//
//
//Problem Constraints
//1000 <= n <= 2500
//
//
//
//Input Format
//One line containing an integern.
//
//
//
//Output Format
//A string representing the category of the person.
//
//
//
//Example Input
//Input 1:
//
//1659
//Input 2:
//
//2100
//
//
//Example Output
//Output 1:
//
//expert
//Output 2:
//
//GRAND MASTER
//
//
//Example Explanation
//Explanation 1:
//
//Clearly, 1659 is odd and is in the range of expert.
//Explanation 2:
//
//Clearly, 2100 is even and is in the range of grand master.
import java.util.Scanner;
public class CodingRating {

	public static void main(String[] args) {
		// YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner ip=new Scanner(System.in);
        int rate=ip.nextInt();
        if(rate >=2100 && rate%2==0)System.out.print("GRAND MASTER");
        else if(rate >=2100)System.out.print("grand master");
        else if(rate >=1900 && rate%2==0)System.out.print("CANDIDATE MASTER");
        else if(rate >=1900 )System.out.print("candidate master");
        else if(rate >=1600 && rate%2==0)System.out.print("EXPERT");
        else if(rate >=1600)System.out.print("expert");
        else if(rate >=1400 && rate%2==0)System.out.print("PUPIL");
        else if(rate >=1400)System.out.print("pupil");
        else if(rate%2==0) System.out.print("NEWBIE");
        else System.out.print("newbie");

	}

}

//Problem Description
//You are given a positive integer A denoting the radius of a circle. You have to calculate the area of the circle.
//
//Note :
//
//The formula for the area of a circle is Area = πr², where r is the radius of the circle.
//You can use the value of PI as 3.1416
//Round up the final answer up to 2 decimal places.
//You can use round(area, 2) it for rounding area to 2 decimal places
//
//
//Problem Constraints
//1 <= A <= 1000
//
//
//Input Format
//First and only argument is an integer A.
//
//
//Output Format
//Return final answer upto 2 decimal places, denoting the area of the circle.
//
//
//Example Input
//Input 1:
//8
//Input 2:
//15
//
//
//Example Output
//Output 1:
//201.06
//Output 2:
//706.86
//
//
//Example Explanation
//Explanation 1:
//r = 8
//Area = πr²
//     = 3.1416 * 8 * 8
//     = 201.0604
//     = 201.06 (upto 2 decimal places)
//Explanation 2:
//r = 8
//Area = πr²
//     = 3.1416 * 15 * 15
//     = 706.86
//
//
//
//Expected Output
//Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
//Correct Output
//50.27
//Your Input
//Arg 1: A single Integer, For e.g 9
//4
import java.util.Scanner;
public class AreaOfCircle {
	public static double solve(int A) {
        //double pi=3.1416;
        double scale=Math.pow(10,2);
        return Math.round((3.1416*A*A)*scale)/scale;
    }
	public static void main(String[] args) {
		System.out.println(solve(new Scanner(System.in).nextInt()));

	}

}

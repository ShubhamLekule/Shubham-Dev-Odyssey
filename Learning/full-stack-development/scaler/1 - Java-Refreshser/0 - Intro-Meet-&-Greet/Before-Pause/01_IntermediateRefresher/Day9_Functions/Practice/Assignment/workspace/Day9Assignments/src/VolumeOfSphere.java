//Problem Description
//
//You are given a positive integer A denoting the radius of a sphere. You have to calculate the volume of the sphere.
//
//Volume of a sphere having radius R is given by (4 * π * R3) / 3.
//
//NOTE: Since, the answer can be a real number, you have to return the ceil value of the volume. Ceil value of a real number X is the smallest integer that is greater than or equal to X.
//
//
//
//Problem Constraints
//
//1 <= A <= 400
//
//
//
//Input Format
//
//First and only argument is an integer A.
//
//
//
//Output Format
//
//Return a single integer denoting the ceil value of volume of the sphere.
//
//
//
//Example Input
//
//Input 1:
//
// A = 1 
//Input 2:
//
// A = 4 
//
//
//Example Output
//
//Output 1:
//
// 5 
//Output 2:
//
// 269 
//
//
//Example Explanation
//
//Explanation 1:
//
// Volume of sphere having radius 1 units = 4.19
// Ceil value of volume = 5 
//Explanation 2:
//
// Volume of sphere having radius 4 units = 268.08
// Ceil value of volume = 269 
import java.util.Scanner;

public class VolumeOfSphere {
	
	
	    // DO NOT MODIFY THE LIST. IT IS READ ONLY
	    public static int solve(final int A) {
	        return (int)Math.ceil((Math.PI*4*Math.pow(A,3))/3);
	    }

	
	public static void main(String[] args) {
		System.out.println(solve(new Scanner(System.in).nextInt()));
	}

}

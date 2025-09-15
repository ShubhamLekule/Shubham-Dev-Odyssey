//Problem Description
//Take an integer N as input, print the corresponding pattern for N.
//
//For example if N = 5 then pattern will be like:
//
//********** // 0 spaces
//
//****__**** // 2 spaces
//
//***____*** // 4 spaces
//
//**______** // 6 spaces
//
//*________* // 8 spaces
//NOTE: Here '_' is used to represent spaces. You have to print spaces in your code.
//
//
//
//Problem Constraints
//2 <= N <= 100
//
//
//
//Input Format
//First and only line of input contains a single integer N.
//
//
//
//Output Format
//Output the Full Pyramid pattern corresponding to the given N.
//
//
//
//Example Input
//Input 1:
//
// 2
//Input 2:
//
// 3
//
//
//Example Output
//Output 1:
//
//**** // 0 spaces
//
//*__* // 2 spaces
//Output 2:
//
//****** // 0 spaces
//
//**__** // 2 spaces
//
//*____* // 4 spaces
//
//NOTE: Here '_' is used to represent spaces. You have to print spaces in your code.
//
//
//
//
//Example Explanation
// Print the pattern as described.
import java.util.Scanner;
public class HollowPyramidPattern {

	public static void main(String[] args) {
		/*
		 * N=4
		 * 
		 * row			1	2	3	4
		 * LeftStar		4	3	2	1
		 * RightStar	4	3	2	1
		 * space		0	2	4	6
		 * 
		 * LeftStar=RightStar=N+1-row
		 * space=row-1*2
		 */
		byte N=new Scanner(System.in).nextByte();
        for(byte i=1;i<=N;i++){
            for(byte j=1;j<=N+1-i;j++) System.out.print("*");
            for(short j=1;j<=(i-1)*2;j++) System.out.print(" ");
            for(byte j=1;j<=N+1-i;j++) System.out.print("*");
            System.out.println();
        }
	}

}

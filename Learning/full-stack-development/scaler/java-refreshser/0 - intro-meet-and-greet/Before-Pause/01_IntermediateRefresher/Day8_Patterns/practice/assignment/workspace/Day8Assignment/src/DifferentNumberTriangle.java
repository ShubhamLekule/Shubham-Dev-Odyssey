//Problem Description
//Take an integer N as input, print the corresponding Full Numeric Pyramid pattern for N.
//
//For example if N = 5 then pattern will be like:
//
//0 0 0 0 5 0 0 0 0 
//0 0 0 4 8 12 0 0 0 
//0 0 3 6 9 12 15 0 0
//0 2 4 6 8 10 12 14 0
//1 2 3 4 5 6 7 8 9 
//NOTE: There should be exactly one extra space after each number for each row.
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
//NOTE:
//
//There is no extra space before the first integer of any row.
//There is an extra space after the last integer of any row.
//All the integers in any row are space separated.
//
//
//Example Input
//Input 1:
//
//2
//Input 2:
//
//3
//
//
//Example Output
//Output 1:
//
//0 2 0
//1 2 3
//Output 2:
//
//0 0 3 0 0
//0 2 4 6 0
//1 2 3 4 5
//
//
//Example Explanation
// Print the pattern as described.
import java.util.Scanner;
public class DifferentNumberTriangle {

	public static void main(String[] args) {
		
	/*
	 * N=4
	 * 	0 0 0 4 0 0 0
	 * 	0 0 3 6 9 0 0
	 * 	0 2 4 6 8 10 0
	 * 	1 2 3 4 5 6 7
	 * 
	 * leftzero 3	2	1	0
	 * num		1	3	5	7
	 * rightzero3	2	1	0
	 * row		1	2	3	4
	 * 
	 * leftzero=rightzero=N-row
	 * num=row*2-1
	 */
		byte N=new Scanner(System.in).nextByte();
        for(byte i=1;i<=N;i++){
            for(short j=1;j<=N-i;j++) System.out.print("0 ");
            for(short j=1;j<=(i*2)-1;j++) System.out.print((N+1-i)*j+" ");
            for(short j=1;j<=N-i;j++) System.out.print("0 ");
            System.out.println();
        }
}
}

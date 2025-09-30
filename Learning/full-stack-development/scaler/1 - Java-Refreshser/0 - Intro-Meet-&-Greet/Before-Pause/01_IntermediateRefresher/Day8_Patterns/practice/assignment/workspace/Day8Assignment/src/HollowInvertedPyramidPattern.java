//Problem Description
//Take an integer N as input, print the corresponding pattern for N.
//
//For example if N = 5 then pattern will be like:
//
//*________* // 8 spaces
//
//**______** // 6 spaces
//
//***____*** // 4 spaces
//
//****__**** // 2 spaces
//
//********** // 0 spaces
//
//NOTE: Here '_' is used to represent spaces. You have to print spaces in your code.
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
//*__* // 2 spaces
//
//**** // 0 spaces
//Output 2:
//
//*____* // 4 spaces
//
//**__** // 2 spaces
//
//****** // 0 spaces
//
//NOTE: Here '_' is used to represent spaces. You have to print spaces in your code.
//
//
//
//
//Example Explanation
// Print the pattern as described.
import java.util.Scanner;
public class HollowInvertedPyramidPattern {

	public static void main(String[] args) {
		/*
		 * 	leftstar	space	rightstar	row		N=4
		 * 	1			6		1			1
		 * 	2			4		2			2
		 * 	3			2		3			3
		 * 	4			0		4			4
		 * 
		 * leftstar=rightstar=row
		 * space=(N-row)*2
		 */
		byte N=new Scanner(System.in).nextByte();
        for(byte i=1;i<=N;i++){
            for(byte j=1;j<=i;j++)System.out.print("*");
            for(int j=1;j<=(N-i)*2;j++)System.out.print(" ");
            for(byte j=1;j<=i;j++)System.out.print("*");
            System.out.println();
        }
/*
 * Scanner sc = new Scanner(System.in);
int N = sc.nextInt();

for(int i = 0; i < N; i++){
for(int j = 0; j < 2 N; j++){
System.out.print((j <= i|| j >= 2N - i - 1 )?"*":" ");
}
System.out.println();
}
 */
	}

}

//Problem Description
//Given a matrix of N rows and M columns, print it row by row. Firstly print 0th row, then 1st row, 2nd row and so on.
//
//
//Problem Constraints
//1 <= N <= 100
//1 <= M <= 100
//1 <= mat[i][j] <= 10000
//
//
//Input Format
//Two values denoting N and M,
//Next N lines contain M space separated integers representing the matrix Mat
//
//
//Output Format
//N lines denoting each row.
//Note: Ensure there is a space character (' ') at the end of the line.
//
//
//Example Input
//3 4
//10 20 30 40
//50 60 70 80
//90 100 110 120
//
//
//Example Output
//10 20 30 40
//50 60 70 80
//90 100 110 120
//
//
//Example Explanation
//0th row -> 10 20 30 40
//1st row -> 50 60 70 80
//2nd row -> 90 100 110 120
import java.util.Scanner;
public class PrintMatrixRowByRow {

	public static void main(String[] args) {
		// YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        byte N=sc.nextByte(),M=sc.nextByte();
        int[][] mat=new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++) {
            mat[i][j]=sc.nextInt();
            System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

	}

}

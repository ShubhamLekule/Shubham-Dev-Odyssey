//Problem Description
//
//Write a program to input an N X M matrix A from user and print sum of every row.
//
//
//Problem Constraints
//
//1 <= N <= 100
//1 <= M <= 100
//1 <= A[i][j] <= 10000
//
//
//Input Format
//
//Two values denoting N and M,
//Next N lines contain M space separated integers representing the matrix A.
//
//
//Output Format
//
//Print sum of each row space separated.
//
//
//Example Input
//
//3 4
//1 2 3 4
//5 6 7 8
//9 2 4 1
//
//
//Example Output
//
//10 26 16
//
//
//Example Explanation
//
//0th row sum -> 1+2+3+4 = 10
//1st row sum -> 5+6+7+8 = 26
//2nd row sum-> 9+2+4+1 = 16
import java.util.Scanner;
public class SumOfEveryRow {
	public static int[] sumOfRow(int[][] mat){
        int[] sum=new int[mat.length];
        for(int i=0;i<mat.length;i++){
            sum[i]=0;
            for(int j=0;j<mat[0].length;j++) sum[i]+=mat[i][j];
        }
        return sum;
    }
    public static void print(int[][] mat){
        int[] sum=sumOfRow(mat);
        for(int i=0;i<sum.length;i++) System.out.print(sum[i]+" ");
    }
	public static void main(String[] args) {
		// YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(),M=sc.nextInt();
        int[][] arr=new int[N][M];
        for(int i=0;i<N;i++) for(int j=0;j<M;j++) arr[i][j]=sc.nextInt();
        print(arr);

	}

}

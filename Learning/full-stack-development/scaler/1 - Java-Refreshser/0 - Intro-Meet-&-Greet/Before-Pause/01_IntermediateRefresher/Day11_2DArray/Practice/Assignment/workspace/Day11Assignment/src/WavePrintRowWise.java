//Problem Constraints
//1 <= N <= 103
//
//0 <= Mat[i][j] <= 109
//
//
//
//Input Format
//First line is an integer N
//
//Next N lines contain N space separated integers representing the matrix Mat
//
//
//
//Output Format
//A single line containing N*N integers of matrix Mat in wave form (row wise)
//
//Note: Ensure there is a space character (' ') at the end of the line.
//
//
//Example Input
//Input 1:
//
//[[4, 1, 2],
// [7, 4, 4], 
// [3, 7, 4]]
//Input 2:
//
//[[1, 2],
// [3, 4]]
//
//
//Example Output
//Output 1:
//
//4 1 2 4 4 7 3 7 4
//Output 2:
//
//1 2 4 3
//
//
//Example Explanation
//For Input 1:
//We will first iterate the 1st row from left to right and print the elements, 
//then we will iterate the 2nd row from right to left and print the elements,
//then we will iterate the 3rd row from left to right and print the elements.
//This looks like a wave.
//For Input 2:
//We will first iterate the 1st row from left to right and print the elements, 
//then we will iterate the 2nd row from right to left and print the elements.
//This looks like a wave.
import java.util.Scanner;
public class WavePrintRowWise {
	 public static void print(int[][] mat){
	        for(int i=0;i<mat.length;i++){
	            if(i%2==0){
	                for(int j=0;j<mat.length;j++) System.out.print(mat[i][j]+" ");
	            }else{
	                for(int j=mat.length-1;j>=0;j--) System.out.print(mat[i][j]+" ");
	            }
	        }
	    }
	public static void main(String[] args) {
		 // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[][] arr=new int[N][N];
        for(int i=0;i<N;i++) for(int j=0;j<N;j++) arr[i][j]=sc.nextInt();
        print(arr);

	}

}

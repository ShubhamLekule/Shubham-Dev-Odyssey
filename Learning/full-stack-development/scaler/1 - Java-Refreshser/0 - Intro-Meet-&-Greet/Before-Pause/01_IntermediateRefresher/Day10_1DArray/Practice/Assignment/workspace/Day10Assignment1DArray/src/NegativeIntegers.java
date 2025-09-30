//Problem Description
//
//Write a program to print all negative numbers from input array A of size N. Take integer N and N elements of the array as input from user.
//
//
//Problem Constraints
//
//1 <= N <= 1000
//-1000 <= A <= 1000
//
//Input Format
//
//A single line representing N followed by N integers of the array A
//
//Output Format
//
//A single line containing elements from the input array which are negative in the same order.
//
//Note - Keep a space character (' ') at the end of the line.
//
//
//Example Input
//
//Input 1:
//
//5 1 -5 2 -8 -4
//Input 2:
//
//4 -1 0 -8 -1
//
//Example Output
//
//Output 1:
//
//-5 -8 -4 
//Output 2:
//
//-1 -8 -1 
//Example explanation:
//
//Output 1:
//
//all the negative elements of [5 1 -5 2 -8 -4] are [-5 -8 -4]
//
//Output 2:
//
//all the negative elements of [4 -1 0 -8 -1] are [-1 -8 -1]
import java.util.Scanner;
public class NegativeIntegers {
	public static void printNegativeNumber(int[] arr){
        for(int i=0;i<arr.length;i++) if(arr[i]<0) System.out.print(arr[i]+" ");
    }
	public static void main(String[] args) {
//		 Scanner sc=new Scanner(System.in);
//	        int N=sc.nextInt();
//	        for(int i=0;i<N;i++) {
//	            int x=sc.nextInt();
//	            if(x<0)
//	            System.out.print(x+" ");
//	        }
		
		
		// YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++) 
            arr[i]=sc.nextInt();
          printNegativeNumber(arr); 
	}

}
